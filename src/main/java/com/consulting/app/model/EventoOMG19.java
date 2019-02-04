package com.consulting.app.model;

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
@Table(name = "EVENTO_OMG19")
public class EventoOMG19 implements Serializable {

    @Id
    @Column(name = "OMG19_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int omg19_id;

    @Column(name = "MSH5_1_APP_SOLICITUD")
    private String msh5_1_app_solicitud;

    @Column(name = "PID3_1_ID_PETICION")
    private String pid3_1_id_peticion;

    @Column(name = "PID3_1_ID_SEGURIDAD_SOCIAL")
    private String pid3_1_id_seguridad_social;

    @Column(name = "PID3_1_ID_CIP_NACIONAL")
    private String pid3_1_id_cip_nacional;

    @Column(name = "PID3_1_ID_DNI")
    private String pid3_1_id_dni;

    @Column(name = "PID4_1_ID_PETICION_ALTERNATIVO")
    private String pid4_1_id_peticion_alternativo;

    @Column(name = "PID5_1_V_PRIMER_APELLIDO")
    private String pid5_1_v_primer_apellido;

    @Column(name = "PID5_2_V_NOMBRE")
    private String pid5_2_v_nombre;

    @Column(name = "PID6_1_V_SEGUNDO_APELLIDO")
    private String pid6_1_v_segundo_apellido;

    @Temporal(TemporalType.DATE)
    @Column(name = "PID7_1_D_FECHA_NACIMIENTO")
    private Date pid7_1_d_fecha_nacimiento;

    @Column(name = "PID8_1_V_GENERO")
    private String pid8_1_v_genero;

    @Column(name = "PID11_1_V_DIRECCION")
    private String pid11_1_v_direccion;

    @Column(name = "PID11_3_V_CIUDAD")
    private String pid11_3_v_ciudad;

    @Column(name = "PID11_4_V_PROVINCIA")
    private String pid11_4_v_provincia;

    @Column(name = "PID13_1_V_TELEFONO")
    private String pid13_1_v_telefono;

    @Column(name = "PID14_1_V_TELEFONO2")
    private String pid14_1_v_telefono2;

    @Column(name = "PID12_1_V_PAIS")
    private String pid12_1_v_pais;

    @Temporal(TemporalType.DATE)
    @Column(name = "PID29_1_D_FECHA_EXITUS")
    private Date pid29_1_d_fecha_exitus;

    @Column(name = "PV1_19_1_ID_PROCESO_CLINICO")
    private String pv1_19_1_id_proceso_clinico;

    @Column(name = "ORC2_1_ID_PETICION")
    private String orc2_1_id_peticion;

    @Column(name = "OBR16_1_V_CODIGO_OBSERVACION")
    private String obr16_1_v_codigo_observacion;

    @Column(name = "OBR16_2_V_OBSERVACION")
    private String obr16_2_v_observacion;

    public int getOmg19_id() {
        return omg19_id;
    }

    public void setOmg19_id(int omg19_id) {
        this.omg19_id = omg19_id;
    }

    public String getMsh5_1_app_solicitud() {
        return msh5_1_app_solicitud;
    }

    public void setMsh5_1_app_solicitud(String msh5_1_app_solicitud) {
        this.msh5_1_app_solicitud = msh5_1_app_solicitud;
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

    public String getPid4_1_id_peticion_alternativo() {
        return pid4_1_id_peticion_alternativo;
    }

    public void setPid4_1_id_peticion_alternativo(String pid4_1_id_peticion_alternativo) {
        this.pid4_1_id_peticion_alternativo = pid4_1_id_peticion_alternativo;
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

    public String getPid6_1_v_segundo_apellido() {
        return pid6_1_v_segundo_apellido;
    }

    public void setPid6_1_v_segundo_apellido(String pid6_1_v_segundo_apellido) {
        this.pid6_1_v_segundo_apellido = pid6_1_v_segundo_apellido;
    }

    public Date getPid7_1_d_fecha_nacimiento() {
        return pid7_1_d_fecha_nacimiento;
    }

    public void setPid7_1_d_fecha_nacimiento(Date pid7_1_d_fecha_nacimiento) {
        this.pid7_1_d_fecha_nacimiento = pid7_1_d_fecha_nacimiento;
    }

    public String getPid8_1_v_genero() {
        return pid8_1_v_genero;
    }

    public void setPid8_1_v_genero(String pid8_1_v_genero) {
        this.pid8_1_v_genero = pid8_1_v_genero;
    }

    public String getPid11_1_v_direccion() {
        return pid11_1_v_direccion;
    }

    public void setPid11_1_v_direccion(String pid11_1_v_direccion) {
        this.pid11_1_v_direccion = pid11_1_v_direccion;
    }

    public String getPid11_3_v_ciudad() {
        return pid11_3_v_ciudad;
    }

    public void setPid11_3_v_ciudad(String pid11_3_v_ciudad) {
        this.pid11_3_v_ciudad = pid11_3_v_ciudad;
    }

    public String getPid11_4_v_provincia() {
        return pid11_4_v_provincia;
    }

    public void setPid11_4_v_provincia(String pid11_4_v_provincia) {
        this.pid11_4_v_provincia = pid11_4_v_provincia;
    }

    public String getPid13_1_v_telefono() {
        return pid13_1_v_telefono;
    }

    public void setPid13_1_v_telefono(String pid13_1_v_telefono) {
        this.pid13_1_v_telefono = pid13_1_v_telefono;
    }

    public String getPid14_1_v_telefono2() {
        return pid14_1_v_telefono2;
    }

    public void setPid14_1_v_telefono2(String pid14_1_v_telefono2) {
        this.pid14_1_v_telefono2 = pid14_1_v_telefono2;
    }

    public String getPid12_1_v_pais() {
        return pid12_1_v_pais;
    }

    public void setPid12_1_v_pais(String pid12_1_v_pais) {
        this.pid12_1_v_pais = pid12_1_v_pais;
    }

    public Date getPid29_1_d_fecha_exitus() {
        return pid29_1_d_fecha_exitus;
    }

    public void setPid29_1_d_fecha_exitus(Date pid29_1_d_fecha_exitus) {
        this.pid29_1_d_fecha_exitus = pid29_1_d_fecha_exitus;
    }

    public String getPv1_19_1_id_proceso_clinico() {
        return pv1_19_1_id_proceso_clinico;
    }

    public void setPv1_19_1_id_proceso_clinico(String pv1_19_1_id_proceso_clinico) {
        this.pv1_19_1_id_proceso_clinico = pv1_19_1_id_proceso_clinico;
    }

    public String getOrc2_1_id_peticion() {
        return orc2_1_id_peticion;
    }

    public void setOrc2_1_id_peticion(String orc2_1_id_peticion) {
        this.orc2_1_id_peticion = orc2_1_id_peticion;
    }

    public String getObr16_1_v_codigo_observacion() {
        return obr16_1_v_codigo_observacion;
    }

    public void setObr16_1_v_codigo_observacion(String obr16_1_v_codigo_observacion) {
        this.obr16_1_v_codigo_observacion = obr16_1_v_codigo_observacion;
    }

    public String getObr16_2_v_observacion() {
        return obr16_2_v_observacion;
    }

    public void setObr16_2_v_observacion(String obr16_2_v_observacion) {
        this.obr16_2_v_observacion = obr16_2_v_observacion;
    }

    public Object[] valirCampos() {
        String msg = "";
        boolean estado = false;
        if (pid3_1_id_peticion.isEmpty() || pid3_1_id_peticion == null) {
            msg = "Ingresar idPeticion. \n";
        }
        if (pid3_1_id_dni.isEmpty() || pid3_1_id_dni == null) {
            msg += "Ingresar documento de indentidad. \n";
        }
        if (pid5_1_v_primer_apellido.isEmpty() || pid5_1_v_primer_apellido == null) {
            msg += "Ingresar el primer apellido. \n";
        }
        if (pid5_2_v_nombre.isEmpty() || pid5_2_v_nombre == null) {
            msg += "Ingresar nombre del paciente. \n";
        }
        if (pid6_1_v_segundo_apellido.isEmpty() || pid6_1_v_segundo_apellido == null) {
            msg += "Ingresar el segundo apellido. \n";
        }
        if (pid7_1_d_fecha_nacimiento == null) {
            msg += "Ingresar la fecha de nacimiento. \n";
        }
       /* if (pid8_1_v_genero.isEmpty() || pid8_1_v_genero == null) {
            msg += "Ingresar el genero del paciente. \n";
        }
        if (pid12_1_v_pais.isEmpty() || pid12_1_v_pais == null) {
            msg += "Ingresar un país. \n";
        }
        if (pid11_3_v_ciudad.isEmpty() || pid12_1_v_pais == null) {
            msg += "Ingrese una ciudad.  \n";
        }
        if (pid11_4_v_provincia.isEmpty() || pid11_4_v_provincia == null) {
            msg += "Ingrese una provincia. \n";
        }*/

        if (msg.trim().length() > 0) {
            estado = false;
        } else {
            estado = true;
        }
        return new Object[]{estado, msg};
    }

    @Override
    public String toString() {
        return "EventoOMG19{" +
                "omg19_id=" + omg19_id +
                ", msh5_1_app_solicitud='" + msh5_1_app_solicitud + '\'' +
                ", pid3_1_id_peticion='" + pid3_1_id_peticion + '\'' +
                ", pid3_1_id_seguridad_social='" + pid3_1_id_seguridad_social + '\'' +
                ", pid3_1_id_cip_nacional='" + pid3_1_id_cip_nacional + '\'' +
                ", pid3_1_id_dni='" + pid3_1_id_dni + '\'' +
                ", pid4_1_id_peticion_alternativo='" + pid4_1_id_peticion_alternativo + '\'' +
                ", pid5_1_v_primer_apellido='" + pid5_1_v_primer_apellido + '\'' +
                ", pid5_2_v_nombre='" + pid5_2_v_nombre + '\'' +
                ", pid6_1_v_segundo_apellido='" + pid6_1_v_segundo_apellido + '\'' +
                ", pid7_1_d_fecha_nacimiento=" + pid7_1_d_fecha_nacimiento +
                ", pid8_1_v_genero='" + pid8_1_v_genero + '\'' +
                ", pid11_1_v_direccion='" + pid11_1_v_direccion + '\'' +
                ", pid11_3_v_ciudad='" + pid11_3_v_ciudad + '\'' +
                ", pid11_4_v_provincia='" + pid11_4_v_provincia + '\'' +
                ", pid13_1_v_telefono='" + pid13_1_v_telefono + '\'' +
                ", pid14_1_v_telefono2='" + pid14_1_v_telefono2 + '\'' +
                ", pid12_1_v_pais='" + pid12_1_v_pais + '\'' +
                ", pid29_1_d_fecha_exitus=" + pid29_1_d_fecha_exitus +
                ", pv1_19_1_id_proceso_clinico='" + pv1_19_1_id_proceso_clinico + '\'' +
                ", orc2_1_id_peticion='" + orc2_1_id_peticion + '\'' +
                ", obr16_1_v_codigo_observacion='" + obr16_1_v_codigo_observacion + '\'' +
                ", obr16_2_v_observacion='" + obr16_2_v_observacion + '\'' +
                '}';
    }
}
