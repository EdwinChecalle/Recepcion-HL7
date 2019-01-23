package com.consulting.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EVENTO_ORU01")
public class EventoORUR01 {

	@Id
	@Column(name = "ORU01_ID")
	private int oru01_id;

	@Column(name = "PID3_1_ID_PETICION")
	private String pid3_1_id_peticion;

	@Column(name = "PID3_1_ID_SEGURIDAD_SOCIAL")
	private String pid3_1_id_seguridad_social;

	@Column(name = "PID3_1_ID_CIP_NACIONAL")
	private String pid3_1_id_cip_nacional;

	@Column(name = "PID3_1_ID_DNI")
	private String pid3_1_id_dni;

	@Column(name = "PID5_1_V_PRIMER_APELLIDO")
	private String pid5_1_v_primer_apellido;

	@Column(name = "PID5_2_V_NOMBRE")
	private String pid5_2_v_nombre;

	@Column(name = "ORC2_1_ID_PETICION")
	private String orc2_1_id_peticion;

	@Column(name = "OBX_2_V_TIPO_VALOR")
	private String obx_2_v_tipo_valor;

	@Column(name = "OBX_3_1_V_ID_OBSERVACION")
	private String obx_3_1_v_id_observacion;

	@Column(name = "OBX_4_V_SUB_ID_OBSERVACION")
	private String obx_4_v_sub_id_observacion;

	@Column(name = "OBX_5_V_VALOR_OBSERVACION")
	private String obx_5_v_valor_observacion;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORU01_DT_FECREGISTRO")
	private Date oru01_dt_fecregistro;

	@Column(name = "ORU01_ID_MEDICION")
	private String oru01_id_medicion;

	@Column(name = "ORU01_V_MEDICO")
	private String oru01_v_medico;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORU01_DT_FECHA_ESPIROMETRIA")
	private Date oru01_dt_fecha_espirometria;

	@Column(name = "ORU01_V_PEF")
	private String oru01_v_pef;

	@Column(name = "ORU01_V_FEV1")
	private String oru01_v_fev1;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORU01_DT_FECHA_FONENDOSCOPIA")
	private Date oru01_dt_fecha_fonendoscopia;

	@Column(name = "ORU01_V_SONIDO")
	private String oru01_v_sonido;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORU01_DT_FECHA_RESULTADO")
	private Date oru01_dt_fecha_resultado;

	@Column(name = "ORU01_B_ESTADO")
	private String oru01_b_estado;

	@Column(name = "ORU01_ID_HISTORICO")
	private String oru01_id_historico;

	@Column(name = "ORU01_V_AMBIENTES_CONTAMINADOS")
	private String oru01_v_ambientes_contaminados;

	@Column(name = "ORU01_V_ACTIVIDADES")
	private String oru01_v_actividades;

	@Column(name = "ORU01_V_CANSANCIO")
	private String oru01_v_cansancio;

	@Column(name = "ORU01_V_AUSENTISMO")
	private String oru01_v_ausentismo;

	@Column(name = "ORU01_V_ASMA")
	private String oru01_v_asma;

	@Column(name = "ORU01_V_FUMA")
	private String oru01_v_fuma;

	@Column(name = "ORU01_V_ALERGICO")
	private String oru01_v_alergico;

	@Column(name = "ORU01_V_OPERACIONES")
	private String oru01_v_operaciones;

	@Column(name = "ORU01_V_TUMORES")
	private String oru01_v_tumores;

	@Column(name = "ORU01_V_ANTECEDENTES")
	private String oru01_v_antecedentes;

	@Column(name = "ORU01_V_MEDICION_ACTUAL")
	private String oru01_v_medicion_actual;

	//AGREGADOS
	@Column(name = "CONCENTRACION_OXIGENO")
	private String concentracion_oxigeno;

	@Column(name = "CVF_CAPACIDAD_VITAL_FORSADA")
	private String cvf_capacidad_vital_forsada;

	@Column(name = "FRECUENCIA_INSPIRACION")
	private String frecuencia_inspiracion;

	@Column(name = "FRECUENCIA_EXPIRACION")
	private String frecuencia_expiracion;

	@Column(name = "ORU01_V_INC")
	private String oru01_v_inc;

	@Column(name = "ORU01_V_TOS")
	private String 	oru01_v_tos;

	@Column(name = "ORU01_V_DOLOR")
	private String oru01_v_dolor;

	@Column(name = "ORU01_V_SIBILANCIA")
	private String oru01_v_sibilancia;

	@Column(name = "ORU01_V_RONCANTES")
	private String oru01_v_roncantes;

	@Column(name = "ORU01_V_FECA")
	private String oru01_v_feca;

	@Column(name = "ORU01_B_ESTADO_P")
	private Integer 	oru01_b_estado_p ;

	@Column(name = "ORU01_B_ESTADO_F")
	private Integer oru01_b_estado_f;

	@Column(name = "ORU01_PORCENTAJE_EPOC")
	private BigDecimal oru01_porcentaje_epoc;

	public int getOru01_id() {
		return oru01_id;
	}

	public void setOru01_id(int oru01_id) {
		this.oru01_id = oru01_id;
	}

	public String getPid3_1_id_peticion() {
		return pid3_1_id_peticion;
	}

	public void setPid3_1_id_peticion(String pid3_1_id_peticion) {
		this.pid3_1_id_peticion = pid3_1_id_peticion;
	}

	public String getPid3_1_id_seguridad_social() {
		return pid3_1_id_seguridad_social;
	}

	public void setPid3_1_id_seguridad_social(String pid3_1_id_seguridad_social) {
		this.pid3_1_id_seguridad_social = pid3_1_id_seguridad_social;
	}

	public String getPid3_1_id_cip_nacional() {
		return pid3_1_id_cip_nacional;
	}

	public void setPid3_1_id_cip_nacional(String pid3_1_id_cip_nacional) {
		this.pid3_1_id_cip_nacional = pid3_1_id_cip_nacional;
	}

	public String getPid3_1_id_dni() {
		return pid3_1_id_dni;
	}

	public void setPid3_1_id_dni(String pid3_1_id_dni) {
		this.pid3_1_id_dni = pid3_1_id_dni;
	}

	public String getPid5_1_v_primer_apellido() {
		return pid5_1_v_primer_apellido;
	}

	public void setPid5_1_v_primer_apellido(String pid5_1_v_primer_apellido) {
		this.pid5_1_v_primer_apellido = pid5_1_v_primer_apellido;
	}

	public String getPid5_2_v_nombre() {
		return pid5_2_v_nombre;
	}

	public void setPid5_2_v_nombre(String pid5_2_v_nombre) {
		this.pid5_2_v_nombre = pid5_2_v_nombre;
	}

	public String getOrc2_1_id_peticion() {
		return orc2_1_id_peticion;
	}

	public void setOrc2_1_id_peticion(String orc2_1_id_peticion) {
		this.orc2_1_id_peticion = orc2_1_id_peticion;
	}

	public String getObx_2_v_tipo_valor() {
		return obx_2_v_tipo_valor;
	}

	public void setObx_2_v_tipo_valor(String obx_2_v_tipo_valor) {
		this.obx_2_v_tipo_valor = obx_2_v_tipo_valor;
	}

	public String getObx_3_1_v_id_observacion() {
		return obx_3_1_v_id_observacion;
	}

	public void setObx_3_1_v_id_observacion(String obx_3_1_v_id_observacion) {
		this.obx_3_1_v_id_observacion = obx_3_1_v_id_observacion;
	}

	public String getObx_4_v_sub_id_observacion() {
		return obx_4_v_sub_id_observacion;
	}

	public void setObx_4_v_sub_id_observacion(String obx_4_v_sub_id_observacion) {
		this.obx_4_v_sub_id_observacion = obx_4_v_sub_id_observacion;
	}

	public String getObx_5_v_valor_observacion() {
		return obx_5_v_valor_observacion;
	}

	public void setObx_5_v_valor_observacion(String obx_5_v_valor_observacion) {
		this.obx_5_v_valor_observacion = obx_5_v_valor_observacion;
	}

	public Date getOru01_dt_fecregistro() {
		return oru01_dt_fecregistro;
	}

	public void setOru01_dt_fecregistro(Date oru01_dt_fecregistro) {
		this.oru01_dt_fecregistro = oru01_dt_fecregistro;
	}

	public String getOru01_id_medicion() {
		return oru01_id_medicion;
	}

	public void setOru01_id_medicion(String oru01_id_medicion) {
		this.oru01_id_medicion = oru01_id_medicion;
	}

	public String getOru01_v_medico() {
		return oru01_v_medico;
	}

	public void setOru01_v_medico(String oru01_v_medico) {
		this.oru01_v_medico = oru01_v_medico;
	}

	public Date getOru01_dt_fecha_espirometria() {
		return oru01_dt_fecha_espirometria;
	}

	public void setOru01_dt_fecha_espirometria(Date oru01_dt_fecha_espirometria) {
		this.oru01_dt_fecha_espirometria = oru01_dt_fecha_espirometria;
	}

	public String getOru01_v_pef() {
		return oru01_v_pef;
	}

	public void setOru01_v_pef(String oru01_v_pef) {
		this.oru01_v_pef = oru01_v_pef;
	}

	public String getOru01_v_fev1() {
		return oru01_v_fev1;
	}

	public void setOru01_v_fev1(String oru01_v_fev1) {
		this.oru01_v_fev1 = oru01_v_fev1;
	}

	public Date getOru01_dt_fecha_fonendoscopia() {
		return oru01_dt_fecha_fonendoscopia;
	}

	public void setOru01_dt_fecha_fonendoscopia(Date oru01_dt_fecha_fonendoscopia) {
		this.oru01_dt_fecha_fonendoscopia = oru01_dt_fecha_fonendoscopia;
	}

	public String getOru01_v_sonido() {
		return oru01_v_sonido;
	}

	public void setOru01_v_sonido(String oru01_v_sonido) {
		this.oru01_v_sonido = oru01_v_sonido;
	}

	public Date getOru01_dt_fecha_resultado() {
		return oru01_dt_fecha_resultado;
	}

	public void setOru01_dt_fecha_resultado(Date oru01_dt_fecha_resultado) {
		this.oru01_dt_fecha_resultado = oru01_dt_fecha_resultado;
	}

	public String getOru01_b_estado() {
		return oru01_b_estado;
	}

	public void setOru01_b_estado(String oru01_b_estado) {
		this.oru01_b_estado = oru01_b_estado;
	}

	public String getOru01_id_historico() {
		return oru01_id_historico;
	}

	public void setOru01_id_historico(String oru01_id_historico) {
		this.oru01_id_historico = oru01_id_historico;
	}

	public String getOru01_v_ambientes_contaminados() {
		return oru01_v_ambientes_contaminados;
	}

	public void setOru01_v_ambientes_contaminados(String oru01_v_ambientes_contaminados) {
		this.oru01_v_ambientes_contaminados = oru01_v_ambientes_contaminados;
	}

	public String getOru01_v_actividades() {
		return oru01_v_actividades;
	}

	public void setOru01_v_actividades(String oru01_v_actividades) {
		this.oru01_v_actividades = oru01_v_actividades;
	}

	public String getOru01_v_cansancio() {
		return oru01_v_cansancio;
	}

	public void setOru01_v_cansancio(String oru01_v_cansancio) {
		this.oru01_v_cansancio = oru01_v_cansancio;
	}

	public String getOru01_v_ausentismo() {
		return oru01_v_ausentismo;
	}

	public void setOru01_v_ausentismo(String oru01_v_ausentismo) {
		this.oru01_v_ausentismo = oru01_v_ausentismo;
	}

	public String getOru01_v_asma() {
		return oru01_v_asma;
	}

	public void setOru01_v_asma(String oru01_v_asma) {
		this.oru01_v_asma = oru01_v_asma;
	}

	public String getOru01_v_fuma() {
		return oru01_v_fuma;
	}

	public void setOru01_v_fuma(String oru01_v_fuma) {
		this.oru01_v_fuma = oru01_v_fuma;
	}

	public String getOru01_v_alergico() {
		return oru01_v_alergico;
	}

	public void setOru01_v_alergico(String oru01_v_alergico) {
		this.oru01_v_alergico = oru01_v_alergico;
	}

	public String getOru01_v_operaciones() {
		return oru01_v_operaciones;
	}

	public void setOru01_v_operaciones(String oru01_v_operaciones) {
		this.oru01_v_operaciones = oru01_v_operaciones;
	}

	public String getOru01_v_tumores() {
		return oru01_v_tumores;
	}

	public void setOru01_v_tumores(String oru01_v_tumores) {
		this.oru01_v_tumores = oru01_v_tumores;
	}

	public String getOru01_v_antecedentes() {
		return oru01_v_antecedentes;
	}

	public void setOru01_v_antecedentes(String oru01_v_antecedentes) {
		this.oru01_v_antecedentes = oru01_v_antecedentes;
	}

	public String getOru01_v_medicion_actual() {
		return oru01_v_medicion_actual;
	}

	public void setOru01_v_medicion_actual(String oru01_v_medicion_actual) {
		this.oru01_v_medicion_actual = oru01_v_medicion_actual;
	}

	public String getConcentracion_oxigeno() {
		return concentracion_oxigeno;
	}

	public void setConcentracion_oxigeno(String concentracion_oxigeno) {
		this.concentracion_oxigeno = concentracion_oxigeno;
	}

	public String getCvf_capacidad_vital_forsada() {
		return cvf_capacidad_vital_forsada;
	}

	public void setCvf_capacidad_vital_forsada(String cvf_capacidad_vital_forsada) {
		this.cvf_capacidad_vital_forsada = cvf_capacidad_vital_forsada;
	}

	public String getFrecuencia_inspiracion() {
		return frecuencia_inspiracion;
	}

	public void setFrecuencia_inspiracion(String frecuencia_inspiracion) {
		this.frecuencia_inspiracion = frecuencia_inspiracion;
	}

	public String getFrecuencia_expiracion() {
		return frecuencia_expiracion;
	}

	public void setFrecuencia_expiracion(String frecuencia_expiracion) {
		this.frecuencia_expiracion = frecuencia_expiracion;
	}

	public String getOru01_v_inc() {
		return oru01_v_inc;
	}

	public void setOru01_v_inc(String oru01_v_inc) {
		this.oru01_v_inc = oru01_v_inc;
	}

	public String getOru01_v_tos() {
		return oru01_v_tos;
	}

	public void setOru01_v_tos(String oru01_v_tos) {
		this.oru01_v_tos = oru01_v_tos;
	}

	public String getOru01_v_dolor() {
		return oru01_v_dolor;
	}

	public void setOru01_v_dolor(String oru01_v_dolor) {
		this.oru01_v_dolor = oru01_v_dolor;
	}

	public String getOru01_v_sibilancia() {
		return oru01_v_sibilancia;
	}

	public void setOru01_v_sibilancia(String oru01_v_sibilancia) {
		this.oru01_v_sibilancia = oru01_v_sibilancia;
	}

	public String getOru01_v_roncantes() {
		return oru01_v_roncantes;
	}

	public void setOru01_v_roncantes(String oru01_v_roncantes) {
		this.oru01_v_roncantes = oru01_v_roncantes;
	}

	public String getOru01_v_feca() {
		return oru01_v_feca;
	}

	public void setOru01_v_feca(String oru01_v_feca) {
		this.oru01_v_feca = oru01_v_feca;
	}

	public Integer getOru01_b_estado_p() {
		return oru01_b_estado_p;
	}

	public void setOru01_b_estado_p(Integer oru01_b_estado_p) {
		this.oru01_b_estado_p = oru01_b_estado_p;
	}

	public Integer getOru01_b_estado_f() {
		return oru01_b_estado_f;
	}

	public void setOru01_b_estado_f(Integer oru01_b_estado_f) {
		this.oru01_b_estado_f = oru01_b_estado_f;
	}

	public BigDecimal getOru01_porcentaje_epoc() {
		return oru01_porcentaje_epoc;
	}

	public void setOru01_porcentaje_epoc(BigDecimal oru01_porcentaje_epoc) {
		this.oru01_porcentaje_epoc = oru01_porcentaje_epoc;
	}

	@Override
	public String toString() {
		return "EventoORUR01{" +
				"oru01_id=" + oru01_id +
				", pid3_1_id_peticion='" + pid3_1_id_peticion + '\'' +
				", pid3_1_id_seguridad_social='" + pid3_1_id_seguridad_social + '\'' +
				", pid3_1_id_cip_nacional='" + pid3_1_id_cip_nacional + '\'' +
				", pid3_1_id_dni='" + pid3_1_id_dni + '\'' +
				", pid5_1_v_primer_apellido='" + pid5_1_v_primer_apellido + '\'' +
				", pid5_2_v_nombre='" + pid5_2_v_nombre + '\'' +
				", orc2_1_id_peticion='" + orc2_1_id_peticion + '\'' +
				", obx_2_v_tipo_valor='" + obx_2_v_tipo_valor + '\'' +
				", obx_3_1_v_id_observacion='" + obx_3_1_v_id_observacion + '\'' +
				", obx_4_v_sub_id_observacion='" + obx_4_v_sub_id_observacion + '\'' +
				", obx_5_v_valor_observacion='" + obx_5_v_valor_observacion + '\'' +
				", oru01_dt_fecregistro=" + oru01_dt_fecregistro +
				", oru01_id_medicion='" + oru01_id_medicion + '\'' +
				", oru01_v_medico='" + oru01_v_medico + '\'' +
				", oru01_dt_fecha_espirometria=" + oru01_dt_fecha_espirometria +
				", oru01_v_pef='" + oru01_v_pef + '\'' +
				", oru01_v_fev1='" + oru01_v_fev1 + '\'' +
				", oru01_dt_fecha_fonendoscopia=" + oru01_dt_fecha_fonendoscopia +
				", oru01_v_sonido='" + oru01_v_sonido + '\'' +
				", oru01_dt_fecha_resultado=" + oru01_dt_fecha_resultado +
				", oru01_b_estado='" + oru01_b_estado + '\'' +
				", oru01_id_historico='" + oru01_id_historico + '\'' +
				", oru01_v_ambientes_contaminados='" + oru01_v_ambientes_contaminados + '\'' +
				", oru01_v_actividades='" + oru01_v_actividades + '\'' +
				", oru01_v_cansancio='" + oru01_v_cansancio + '\'' +
				", oru01_v_ausentismo='" + oru01_v_ausentismo + '\'' +
				", oru01_v_asma='" + oru01_v_asma + '\'' +
				", oru01_v_fuma='" + oru01_v_fuma + '\'' +
				", oru01_v_alergico='" + oru01_v_alergico + '\'' +
				", oru01_v_operaciones='" + oru01_v_operaciones + '\'' +
				", oru01_v_tumores='" + oru01_v_tumores + '\'' +
				", oru01_v_antecedentes='" + oru01_v_antecedentes + '\'' +
				", oru01_v_medicion_actual='" + oru01_v_medicion_actual + '\'' +
				", concentracion_oxigeno='" + concentracion_oxigeno + '\'' +
				", cvf_capacidad_vital_forsada='" + cvf_capacidad_vital_forsada + '\'' +
				", frecuencia_inspiracion='" + frecuencia_inspiracion + '\'' +
				", frecuencia_expiracion='" + frecuencia_expiracion + '\'' +
				", oru01_v_inc='" + oru01_v_inc + '\'' +
				", oru01_v_tos='" + oru01_v_tos + '\'' +
				", oru01_v_dolor='" + oru01_v_dolor + '\'' +
				", oru01_v_sibilancia='" + oru01_v_sibilancia + '\'' +
				", oru01_v_roncantes='" + oru01_v_roncantes + '\'' +
				", oru01_v_feca='" + oru01_v_feca + '\'' +
				", oru01_b_estado_p=" + oru01_b_estado_p +
				", oru01_b_estado_f=" + oru01_b_estado_f +
				", oru01_porcentaje_epoc=" + oru01_porcentaje_epoc +
				'}';
	}
}