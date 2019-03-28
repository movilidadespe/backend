package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "UZMTCONVO", schema="UTIC")
public class convocatoria {
	
	@Id
 
	private Long UZMTCONVO_ID;
	

    private String UZMTCONVO_DESCRIP;
	

    private Date UZMTCONVO_FECHA_FIN;

    private Date UZMTCONVO_FECHA_INICIO;

	

    private Long UZMTCONVO_ESTADO;
	


	public convocatoria() {
		
	}



	public Long getUZMTCONVO_ID() {
		return UZMTCONVO_ID;
	}



	public void setUZMTCONVO_ID(Long uZMTCONVO_ID) {
		UZMTCONVO_ID = uZMTCONVO_ID;
	}



	public String getUZMTCONVO_DESCRIP() {
		return UZMTCONVO_DESCRIP;
	}



	public void setUZMTCONVO_DESCRIP(String uZMTCONVO_DESCRIP) {
		UZMTCONVO_DESCRIP = uZMTCONVO_DESCRIP;
	}



	public Date getUZMTCONVO_FECHA_FIN() {
		return UZMTCONVO_FECHA_FIN;
	}



	public void setUZMTCONVO_FECHA_FIN(Date uZMTCONVO_FECHA_FIN) {
		UZMTCONVO_FECHA_FIN = uZMTCONVO_FECHA_FIN;
	}



	public Date getUZMTCONVO_FECHA_INICIO() {
		return UZMTCONVO_FECHA_INICIO;
	}



	public void setUZMTCONVO_FECHA_INICIO(Date uZMTCONVO_FECHA_INICIO) {
		UZMTCONVO_FECHA_INICIO = uZMTCONVO_FECHA_INICIO;
	}



	public Long getUZMTCONVO_ESTADO() {
		return UZMTCONVO_ESTADO;
	}



	public void setUZMTCONVO_ESTADO(Long uZMTCONVO_ESTADO) {
		UZMTCONVO_ESTADO = uZMTCONVO_ESTADO;
	}


	
	
	
	
	
	
	
	

}
