package com.espe.crud.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UZMTVERIREQ", schema="UTIC")
public class verificacion {

	@Id
	private Long UZMTVERIREQ_ID;
	
	private Long UZMTREQPLANM_ID;
	
	private Long UZMTREQMOVSUBM_ID;
	
	private Long PEAEMPL_PIDM;
	
	private Long UZMTVERIREQ_ESTADO;
	
	private String UZMTVERIREQ_COD_SOLIC;
	
	private String UZMTVERIREQ_USUARIO_CREA;
	
	private Date UZMTVERIREQ_FECHA_CREA;
	
	private String UZMTVERIREQ_USUARIO_MOD;
	
	private Date UZMTVERIREQ_FECHA_MOD;

	public Long getUZMTVERIREQ_ID() {
		return UZMTVERIREQ_ID;
	}

	public void setUZMTVERIREQ_ID(Long uZMTVERIREQ_ID) {
		UZMTVERIREQ_ID = uZMTVERIREQ_ID;
	}

	public Long getUZMTREQPLANM_ID() {
		return UZMTREQPLANM_ID;
	}

	public void setUZMTREQPLANM_ID(Long uZMTREQPLANM_ID) {
		UZMTREQPLANM_ID = uZMTREQPLANM_ID;
	}

	public Long getUZMTREQMOVSUBM_ID() {
		return UZMTREQMOVSUBM_ID;
	}

	public void setUZMTREQMOVSUBM_ID(Long uZMTREQMOVSUBM_ID) {
		UZMTREQMOVSUBM_ID = uZMTREQMOVSUBM_ID;
	}

	public Long getPEAEMPL_PIDM() {
		return PEAEMPL_PIDM;
	}

	public void setPEAEMPL_PIDM(Long pEAEMPL_PIDM) {
		PEAEMPL_PIDM = pEAEMPL_PIDM;
	}

	public Long getUZMTVERIREQ_ESTADO() {
		return UZMTVERIREQ_ESTADO;
	}

	public void setUZMTVERIREQ_ESTADO(Long uZMTVERIREQ_ESTADO) {
		UZMTVERIREQ_ESTADO = uZMTVERIREQ_ESTADO;
	}

	public String getUZMTVERIREQ_COD_SOLIC() {
		return UZMTVERIREQ_COD_SOLIC;
	}

	public void setUZMTVERIREQ_COD_SOLIC(String uZMTVERIREQ_COD_SOLIC) {
		UZMTVERIREQ_COD_SOLIC = uZMTVERIREQ_COD_SOLIC;
	}

	public String getUZMTVERIREQ_USUARIO_CREA() {
		return UZMTVERIREQ_USUARIO_CREA;
	}

	public void setUZMTVERIREQ_USUARIO_CREA(String uZMTVERIREQ_USUARIO_CREA) {
		UZMTVERIREQ_USUARIO_CREA = uZMTVERIREQ_USUARIO_CREA;
	}

	public Date getUZMTVERIREQ_FECHA_CREA() {
		return UZMTVERIREQ_FECHA_CREA;
	}

	public void setUZMTVERIREQ_FECHA_CREA(Date uZMTVERIREQ_FECHA_CREA) {
		UZMTVERIREQ_FECHA_CREA = uZMTVERIREQ_FECHA_CREA;
	}

	public String getUZMTVERIREQ_USUARIO_MOD() {
		return UZMTVERIREQ_USUARIO_MOD;
	}

	public void setUZMTVERIREQ_USUARIO_MOD(String uZMTVERIREQ_USUARIO_MOD) {
		UZMTVERIREQ_USUARIO_MOD = uZMTVERIREQ_USUARIO_MOD;
	}

	public Date getUZMTVERIREQ_FECHA_MOD() {
		return UZMTVERIREQ_FECHA_MOD;
	}

	public void setUZMTVERIREQ_FECHA_MOD(Date uZMTVERIREQ_FECHA_MOD) {
		UZMTVERIREQ_FECHA_MOD = uZMTVERIREQ_FECHA_MOD;
	}
	
	
}
