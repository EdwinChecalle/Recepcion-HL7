package com.consulting.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "E_OMG19")
public class EventoOMG19 implements Serializable {

	@Id
	@Column(name = "OMG19_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "OMG19_V_APLICACION")
	private String aplicacion;

	@Column(name = "OMG19_V_HL7")
	private String hl7;

	@Temporal(TemporalType.DATE)
	@Column(name = "OMG19_D_FECRECGISTRO")
	private Date fechaRegistro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}

	public String getHl7() {
		return hl7;
	}

	public void setHl7(String hl7) {
		this.hl7 = hl7;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

}
