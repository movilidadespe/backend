package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UZMTCONVO", schema="UTIC")
public class convocatoria {
	
	@Id
	@Column(name = "UZMTCONVO_ID")
	private Long id;
	
	@Column(name = "UZMTCONVO_DESCRIP")
    private String descrpcion;
	
	@Column(name = "UZMTCONVO_FECHA_FIN")
    private Date fecha_fin;
	
	@Column(name = "UZMTCONVO_FECHA_INICIO")
    private Date fecha_inicio;

	
	@Column(name = "UZMTCONVO_ESTADO")
    private Long estado;
	


	public convocatoria() {
		
	}
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescrpcion() {
		return descrpcion;
	}



	public void setDescrpcion(String descrpcion) {
		this.descrpcion = descrpcion;
	}



	public Date getFecha_fin() {
		return fecha_fin;
	}



	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}



	public Date getFecha_inicio() {
		return fecha_inicio;
	}



	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}



	public Long getEstado() {
		return estado;
	}



	public void setEstado(Long estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "convocatoria [id=" + id + ", descrpcion=" + descrpcion + ", fecha_fin=" + fecha_fin + ", fecha_inicio="
				+ fecha_inicio + ", estado=" + estado + "]";
	}







	

	
	
	
	
	
	
	
	

}
