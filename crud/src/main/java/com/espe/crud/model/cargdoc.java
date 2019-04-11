package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UZMTIPDOC", schema="UTIC")
public class cargdoc {

	@Id
	@Column(name = "UZMTIPDOC_ID")
	private Long id;
	
	@Column(name = "UZMTIPDOC_NOM_DOC")
	private String nom_doc;
	
	@Column(name = "UZMTIPDOC_EST")
    private Long estado;
	
	@Column(name = "UZMTIPDOC_USUARIO_CREA")
    private String usuario_crea;
	
	@Column(name = "UZMTIPDOC_FECHA_CREA")
    private Date fecha_crea;
	
	@Column(name = "UZMTESTINTER_USUARIO_MOD")
    private String usuario_mod;
	

	@Column(name = "UZMTIPDOC_FECHA_MOD")
    private Date fecha_mod;
	

	public cargdoc() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom_doc() {
		return nom_doc;
	}


	public void setNom_doc(String nom_doc) {
		this.nom_doc = nom_doc;
	}


	public Long getEstado() {
		return estado;
	}


	public void setEstado(Long estado) {
		this.estado = estado;
	}


	public String getUsuario_crea() {
		return usuario_crea;
	}


	public void setUsuario_crea(String usuario_crea) {
		this.usuario_crea = usuario_crea;
	}


	public Date getFecha_crea() {
		return fecha_crea;
	}


	public void setFecha_crea(Date fecha_crea) {
		this.fecha_crea = fecha_crea;
	}


	public String getUsuario_mod() {
		return usuario_mod;
	}


	public void setUsuario_mod(String usuario_mod) {
		this.usuario_mod = usuario_mod;
	}


	public Date getFecha_mod() {
		return fecha_mod;
	}


	public void setFecha_mod(Date fecha_mod) {
		this.fecha_mod = fecha_mod;
	}


	@Override
	public String toString() {
		return "cargdoc [id=" + id + ", nom_doc=" + nom_doc + ", estado=" + estado + ", usuario_crea=" + usuario_crea
				+ ", fecha_crea=" + fecha_crea + ", usuario_mod=" + usuario_mod + ", fecha_mod=" + fecha_mod + "]";
	}

	
}

