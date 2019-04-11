package com.espe.crud.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UZMTFINAN", schema="UTIC")
public class financiamiento {
	@Id
	private Long UZMTFINAN_ID;
	
	private Long UZMTMGESTINV_ID;
	
	private Long UZMTFMOVILIDAD_ID;
	
	private Long UZMTESTINTER_ID;
	
	private Long UZMTEXTERNO_ID;
	
	private String UZMTFINAN_PASAJE;
	
	private String UZMTFINAN_VIATICO;
	
	private String UZMTFINAN_OTROS;
	
	private String UZMTFINAN_TOTAL;
	
	private String UZMTFINAN_USUARIO_CREA;
	
	private Date UZMTFINAN_FECHA_CREA;
	
	private String UZMTFINAN_USUARIO_MOD;
	
	private Date UZMTFINAN_FECHA__MOD;

	public Long getUZMTFINAN_ID() {
		return UZMTFINAN_ID;
	}

	public void setUZMTFINAN_ID(Long uZMTFINAN_ID) {
		UZMTFINAN_ID = uZMTFINAN_ID;
	}

	public Long getUZMTMGESTINV_ID() {
		return UZMTMGESTINV_ID;
	}

	public void setUZMTMGESTINV_ID(Long uZMTMGESTINV_ID) {
		UZMTMGESTINV_ID = uZMTMGESTINV_ID;
	}

	public Long getUZMTFMOVILIDAD_ID() {
		return UZMTFMOVILIDAD_ID;
	}

	public void setUZMTFMOVILIDAD_ID(Long uZMTFMOVILIDAD_ID) {
		UZMTFMOVILIDAD_ID = uZMTFMOVILIDAD_ID;
	}

	public Long getUZMTESTINTER_ID() {
		return UZMTESTINTER_ID;
	}

	public void setUZMTESTINTER_ID(Long uZMTESTINTER_ID) {
		UZMTESTINTER_ID = uZMTESTINTER_ID;
	}

	public Long getUZMTEXTERNO_ID() {
		return UZMTEXTERNO_ID;
	}

	public void setUZMTEXTERNO_ID(Long uZMTEXTERNO_ID) {
		UZMTEXTERNO_ID = uZMTEXTERNO_ID;
	}

	public String getUZMTFINAN_PASAJE() {
		return UZMTFINAN_PASAJE;
	}

	public void setUZMTFINAN_PASAJE(String uZMTFINAN_PASAJE) {
		UZMTFINAN_PASAJE = uZMTFINAN_PASAJE;
	}

	public String getUZMTFINAN_VIATICO() {
		return UZMTFINAN_VIATICO;
	}

	public void setUZMTFINAN_VIATICO(String uZMTFINAN_VIATICO) {
		UZMTFINAN_VIATICO = uZMTFINAN_VIATICO;
	}

	public String getUZMTFINAN_OTROS() {
		return UZMTFINAN_OTROS;
	}

	public void setUZMTFINAN_OTROS(String uZMTFINAN_OTROS) {
		UZMTFINAN_OTROS = uZMTFINAN_OTROS;
	}

	public String getUZMTFINAN_TOTAL() {
		return UZMTFINAN_TOTAL;
	}

	public void setUZMTFINAN_TOTAL(String uZMTFINAN_TOTAL) {
		UZMTFINAN_TOTAL = uZMTFINAN_TOTAL;
	}

	public String getUZMTFINAN_USUARIO_CREA() {
		return UZMTFINAN_USUARIO_CREA;
	}

	public void setUZMTFINAN_USUARIO_CREA(String uZMTFINAN_USUARIO_CREA) {
		UZMTFINAN_USUARIO_CREA = uZMTFINAN_USUARIO_CREA;
	}

	public Date getUZMTFINAN_FECHA_CREA() {
		return UZMTFINAN_FECHA_CREA;
	}

	public void setUZMTFINAN_FECHA_CREA(Date uZMTFINAN_FECHA_CREA) {
		UZMTFINAN_FECHA_CREA = uZMTFINAN_FECHA_CREA;
	}

	public String getUZMTFINAN_USUARIO_MOD() {
		return UZMTFINAN_USUARIO_MOD;
	}

	public void setUZMTFINAN_USUARIO_MOD(String uZMTFINAN_USUARIO_MOD) {
		UZMTFINAN_USUARIO_MOD = uZMTFINAN_USUARIO_MOD;
	}

	public Date getUZMTFINAN_FECHA__MOD() {
		return UZMTFINAN_FECHA__MOD;
	}

	public void setUZMTFINAN_FECHA__MOD(Date uZMTFINAN_FECHA__MOD) {
		UZMTFINAN_FECHA__MOD = uZMTFINAN_FECHA__MOD;
	}
	
	
	

}
