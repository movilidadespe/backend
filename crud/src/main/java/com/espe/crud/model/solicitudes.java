package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "UZMTTIPMOV", schema="UTIC")
public class solicitudes {
	
	@Id

    private Long UZMTIPMOV_ID;
	

    @NotBlank
    private Long UZMTCONVO_ID;
	

    @NotBlank	
    private String UZMTIPMOV_NOMBRE;
	

    @NotBlank
    private String UZMTIPMOV_USUARIO_CREA;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date UZMTIPMOV_FECHA_CREA;
	

    private String UZMTIPMOV_USUARIO_MOD;
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date UZMTIPMOV_FECHA_MOD;


	public solicitudes() {
		
	}
	


	public Long getUZMTTIPMOV_ID() {
		return UZMTIPMOV_ID;
	}


	public void setUZMTTIPMOV_ID(Long uZMTTIPMOV_ID) {
		UZMTIPMOV_ID = uZMTTIPMOV_ID;
	}


	public Long getUZMTCONVO_ID() {
		return UZMTCONVO_ID;
	}


	public void setUZMTCONVO_ID(Long uZMTCONVO_ID) {
		UZMTCONVO_ID = uZMTCONVO_ID;
	}


	public String getUZMTIPMOV_NOMBRE() {
		return UZMTIPMOV_NOMBRE;
	}


	public void setUZMTIPMOV_NOMBRE(String uZMTIPMOV_NOMBRE) {
		UZMTIPMOV_NOMBRE = uZMTIPMOV_NOMBRE;
	}


	public String getUZMTIPMOV_USUARIO_CREA() {
		return UZMTIPMOV_USUARIO_CREA;
	}


	public void setUZMTIPMOV_USUARIO_CREA(String uZMTIPMOV_USUARIO_CREA) {
		UZMTIPMOV_USUARIO_CREA = uZMTIPMOV_USUARIO_CREA;
	}


	public Date getUZMTIPMOV_FECHA_CREA() {
		return UZMTIPMOV_FECHA_CREA;
	}


	public void setUZMTIPMOV_FECHA_CREA(Date uZMTIPMOV_FECHA_CREA) {
		UZMTIPMOV_FECHA_CREA = uZMTIPMOV_FECHA_CREA;
	}


	public String getUZMTTIPMOV_USUARIO_MOD() {
		return UZMTIPMOV_USUARIO_MOD;
	}


	public void setUZMTTIPMOV_USUARIO_MOD(String uZMTTIPMOV_USUARIO_MOD) {
		UZMTIPMOV_USUARIO_MOD = uZMTTIPMOV_USUARIO_MOD;
	}


	public Date getUZMTIPMOV_FECHA_MOD() {
		return UZMTIPMOV_FECHA_MOD;
	}


	public void setUZMTIPMOV_FECHA_MOD(Date uZMTIPMOV_FECHA_MOD) {
		UZMTIPMOV_FECHA_MOD = uZMTIPMOV_FECHA_MOD;
	}





	
	
	
	
	
	
	
	

}
