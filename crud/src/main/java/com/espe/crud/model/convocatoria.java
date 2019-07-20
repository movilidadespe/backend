package com.espe.crud.model;

import java.sql.Date;

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
    private String descripcion;
	
	@Column(name = "UZMTCONVO_FECHA_FIN")
    private Date fecha_fin;
	
	@Column(name = "UZMTCONVO_FECHA_INICIO")
    private Date fecha_inicio;

	
	@Column(name = "UZMTCONVO_ESTADO")
    private Boolean estado;
	


	public convocatoria() {
		
	}



	public convocatoria(Long id, String descripcion, Date fecha_fin, Date fecha_inicio, Boolean estado) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fecha_fin = fecha_fin;
		this.fecha_inicio = fecha_inicio;
		this.estado = estado;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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



	public Boolean getEstado() {
		return estado;
	}



	public void setEstado(Boolean estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "convocatoria [id=" + id + ", descripcion=" + descripcion + ", fecha_fin=" + fecha_fin
				+ ", fecha_inicio=" + fecha_inicio + ", estado=" + estado + "]";
	}

}