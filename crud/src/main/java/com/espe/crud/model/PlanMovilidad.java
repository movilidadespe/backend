package com.espe.crud.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UZMTPLANMOV", schema="UTIC")
public class PlanMovilidad {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long UZMTPLANMOV_ID;
	
	private Long UZMTIPMOV_ID;
	
	private String UZMTPLANMOV_NOMBRE;
	
	private String UZMTPLANMOV_USUARIO_CREA;
	

	private Date UZMTPLANMOV_FECHA_CREA;
		
	private String UZMTPLANMOV_USUARIO_MOD;	

    private Date UZMTPLANMOV_FECHA_MOD;
    
    

	public PlanMovilidad() {
		
	}

	public Long getUZMTPLANMOV_ID() {
		return UZMTPLANMOV_ID;
	}

	public void setUZMTPLANMOV_ID(Long uZMTPLANMOV_ID) {
		UZMTPLANMOV_ID = uZMTPLANMOV_ID;
	}

	public Long getUZMTIPMOV_ID() {
		return UZMTIPMOV_ID;
	}

	public void setUZMTIPMOV_ID(Long uZMTIPMOV_ID) {
		UZMTIPMOV_ID = uZMTIPMOV_ID;
	}

	public String getUZMTPLANMOV_NOMBRE() {
		return UZMTPLANMOV_NOMBRE;
	}

	public void setUZMTPLANMOV_NOMBRE(String uZMTPLANMOV_NOMBRE) {
		UZMTPLANMOV_NOMBRE = uZMTPLANMOV_NOMBRE;
	}

	public String getUZMTPLANMOV_USUARIO_CREA() {
		return UZMTPLANMOV_USUARIO_CREA;
	}

	public void setUZMTPLANMOV_USUARIO_CREA(String uZMTPLANMOV_USUARIO_CREA) {
		UZMTPLANMOV_USUARIO_CREA = uZMTPLANMOV_USUARIO_CREA;
	}

	public Date getUZMTPLANMOV_FECHA_CREA() {
		return UZMTPLANMOV_FECHA_CREA;
	}

	public void setUZMTPLANMOV_FECHA_CREA(Date uZMTPLANMOV_FECHA_CREA) {
		UZMTPLANMOV_FECHA_CREA = uZMTPLANMOV_FECHA_CREA;
	}

	public String getUZMTPLANMOV_USUARIO_MOD() {
		return UZMTPLANMOV_USUARIO_MOD;
	}

	public void setUZMTPLANMOV_USUARIO_MOD(String uZMTPLANMOV_USUARIO_MOD) {
		UZMTPLANMOV_USUARIO_MOD = uZMTPLANMOV_USUARIO_MOD;
	}

	public Date getUZMTPLANMOV_FECHA_MOD() {
		return UZMTPLANMOV_FECHA_MOD;
	}

	public void setUZMTPLANMOV_FECHA_MOD(Date uZMTPLANMOV_FECHA_MOD) {
		UZMTPLANMOV_FECHA_MOD = uZMTPLANMOV_FECHA_MOD;
	}
    
    
	
}
