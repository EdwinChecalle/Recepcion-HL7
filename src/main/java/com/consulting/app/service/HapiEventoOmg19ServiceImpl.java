package com.consulting.app.service;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.consulting.app.model.EventoOMG19;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.app.Initiator;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.group.OMG_O19_ORDER;
import ca.uhn.hl7v2.model.v25.group.OMG_O19_PATIENT;
import ca.uhn.hl7v2.model.v25.group.OMG_O19_PATIENT_VISIT;
import ca.uhn.hl7v2.model.v25.message.OMG_O19;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.ORC;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.parser.Parser;

@Service("EventoOmg19Service")
public class HapiEventoOmg19ServiceImpl implements EventoOmg19Service {

	private static final Logger log = LoggerFactory.getLogger(HapiEventoOmg19ServiceImpl.class);
	
	private String host;
	private int puerto;

	@Override
	public String objectToEr7(EventoOMG19 obj) {
		try {
			OMG_O19 adt = new OMG_O19();
			adt.initQuickstart("OMG", "O19", "P");

			MSH mshSegment = adt.getMSH();

			mshSegment.getSendingApplication().getNamespaceID().setValue("TESIS");
			mshSegment.getSendingFacility().getNamespaceID().setValue("SISEP");
			mshSegment.getReceivingApplication().getNamespaceID().setValue(obj.getMsh5_1_app_solicitud());
			mshSegment.getReceivingFacility().getNamespaceID().setValue("HIS");
			Format formatter = new SimpleDateFormat("yyyyMMddHHmmss");
			mshSegment.getDateTimeOfMessage().getTime().setValue(formatter.format(new Date()));
			mshSegment.getMessageControlID().setValue(formatter.format(new Date())); // ??
			// mshSegment.getMessageControlID().getExtraComponents().getComponent(0).parse("O19");//??
			mshSegment.getAcceptAcknowledgmentType().setValue("AL");
			mshSegment.getApplicationAcknowledgmentType().setValue("NE");
			mshSegment.getCharacterSet(0).setValue("UNICODE UTF-8");

			OMG_O19_PATIENT paciente = adt.getPATIENT();
			PID pid = paciente.getPID();

			pid.getPatientIdentifierList(0).getIDNumber().setValue(obj.getPid3_1_id_peticion());
			pid.getPatientIdentifierList(1).getIDNumber().setValue(obj.getPid3_1_id_seguridad_social());
			pid.getPatientIdentifierList(2).getIDNumber().setValue(obj.getPid3_1_id_dni());
			pid.getPatientIdentifierList(3).getIDNumber().setValue("");
			pid.getPatientIdentifierList(4).getIDNumber().setValue("");
			pid.getPatientIdentifierList(5).getIDNumber().setValue("");
			pid.getPatientIdentifierList(6).getIDNumber().setValue(obj.getPid3_1_id_cip_nacional());
			pid.getAlternatePatientIDPID(0).getIDNumber().setValue(obj.getPid4_1_id_peticion_alternativo());
			pid.getPatientName(0).getFamilyName().getSurname().setValue(obj.getPid5_1_v_primer_apellido());
			pid.getPatientName(0).getGivenName().setValue(obj.getPid5_2_v_nombre());
			pid.getMotherSMaidenName(0).getFamilyName().getSurname().setValue(obj.getPid6_1_v_segundo_apellido());
			pid.getDateTimeOfBirth().getTime().setValue(obj.getPid7_1_d_fecha_nacimiento());
			pid.getAdministrativeSex().setValue(obj.getPid8_1_v_genero());
			pid.getPatientAddress(0).getStreetAddress().getStreetOrMailingAddress()
					.setValue(obj.getPid11_1_v_direccion());
			pid.getPatientAddress(0).getCity().setValue(obj.getPid11_3_v_ciudad());
			pid.getPatientAddress(0).getStateOrProvince().setValue(obj.getPid11_4_v_provincia());
			pid.getPatientAddress(0).getZipOrPostalCode().setValue("15000");
			pid.getCountyCode().setValue(obj.getPid12_1_v_pais());
			pid.getPhoneNumberHome(0).getTelephoneNumber().setValue(obj.getPid13_1_v_telefono());
			pid.getPhoneNumberBusiness(0).getTelephoneNumber().setValue(obj.getPid14_1_v_telefono2());

			OMG_O19_PATIENT_VISIT pacientevisitas = paciente.getPATIENT_VISIT();
			PV1 pv1 = pacientevisitas.getPV1();
			pv1.getVisitNumber().getIDNumber().setValue(obj.getPv1_19_1_id_proceso_clinico());
			OMG_O19_ORDER orden = adt.getORDER();
			ORC orc = orden.getORC();
			orc.getPlacerOrderNumber().getEntityIdentifier().setValue(obj.getOrc2_1_id_peticion());
			OBR obr = orden.getOBR();
			obr.getOrderingProvider(0).getIDNumber().setValue(obj.getObr16_1_v_codigo_observacion());
			obr.getOrderingProvider(0).getFamilyName().getSurname().setValue(obj.getObr16_2_v_observacion());

			@SuppressWarnings("resource")
			HapiContext context = new DefaultHapiContext();
			Parser parser = context.getPipeParser();
			String encodedMessage = parser.encode(adt);

			return encodedMessage;

		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return null;
		}
	}

	@Override
	public void enviarEventoOmg19(String er7Omg19) {
		HapiContext ctx = new DefaultHapiContext();
		Connection connection;
		try {
			connection = ctx.newLazyClient(this.host, this.puerto, false);
			Initiator initiator = connection.getInitiator();
			Parser p = ctx.getPipeParser();
			Message mensajeadt = p.parse(er7Omg19);
			Message response = initiator.sendAndReceive(mensajeadt);
			String responseString = p.encode(response);
			connection.close();
			ctx.close();
			System.out.println(responseString);

		} catch (HL7Exception e) {
			log.error(e.getMessage(),e);
		} catch (LLPException e) {
			log.error(e.getMessage(),e);
		} catch (IOException e) {
			log.error(e.getMessage(),e);
		}

	}

	@Override
	public clienteHl7Builder config() {
		return new clienteHl7Builder(this);
	}

	public static class clienteHl7Builder {
		private HapiEventoOmg19ServiceImpl heos;

		public clienteHl7Builder(HapiEventoOmg19ServiceImpl heos) {
			this.heos = heos;
		}

		public clienteHl7Builder setHost(String host) {
			heos.host = host;
			return this;
		}

		public clienteHl7Builder setPuero(int puerto) {
			heos.puerto = puerto;
			return this;
		}

		public HapiEventoOmg19ServiceImpl build() {
			return heos;
		}
	}

}
