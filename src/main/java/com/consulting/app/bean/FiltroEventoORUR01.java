package com.consulting.app.bean;

import java.util.Date;

public class FiltroEventoORUR01 {

	private String pid3_1_id_peticion;
	private String pid3_1_id_dni;
	private Date oru01_dt_fecregistro;
	private Date oru01_dt_fecfinregistro;

	public String getPid3_1_id_peticion() {
		return pid3_1_id_peticion;
	}

	public void setPid3_1_id_peticion(String pid3_1_id_peticion) {
		this.pid3_1_id_peticion = pid3_1_id_peticion;
	}

	public String getPid3_1_id_dni() {
		return pid3_1_id_dni;
	}

	public void setPid3_1_id_dni(String pid3_1_id_dni) {
		this.pid3_1_id_dni = pid3_1_id_dni;
	}

	public Date getOru01_dt_fecregistro() {
		return oru01_dt_fecregistro;
	}

	public void setOru01_dt_fecregistro(Date oru01_dt_fecregistro) {
		this.oru01_dt_fecregistro = oru01_dt_fecregistro;
	}

	public Date getOru01_dt_fecfinregistro() {
		return oru01_dt_fecfinregistro;
	}

	public void setOru01_dt_fecfinregistro(Date oru01_dt_fecfinregistro) {
		this.oru01_dt_fecfinregistro = oru01_dt_fecfinregistro;
	}

	@Override
	public String toString() {
		return "FiltroEventoORUR01 [pid3_1_id_peticion=" + pid3_1_id_peticion + ", pid3_1_id_dni=" + pid3_1_id_dni
				+ ", oru01_dt_fecregistro=" + oru01_dt_fecregistro + ", oru01_dt_fecfinregistro="
				+ oru01_dt_fecfinregistro + "]";
	}

}
