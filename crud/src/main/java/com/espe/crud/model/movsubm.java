package com.espe.crud.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UZMTMOVSUBM", schema="UTIC")
public class movsubm {
	@Id
	@Column(name="UZMTMOVSUBM_ID")
	private Long id;
	
	@Column(name="UZMTIPMOV_ID")
	private Long tipmov_id;
	
	@Column(name="UZMTMOVSUBM_NOM")
	private String nombre;
	
	@Column(name="UZMTMOVSUBM_USUARIO_CREA")
	private String usuario_crea;
	
	@Column(name="UZMTMOVSUBM_FECHA_CREA")
	private Date fecha_crea;
	
	@Column(name="UZMTMOVSUBM_USUARIO_MOD")
	private String usuario_mod;
	
	@Column(name="UZMTMOVSUBM_FECHA_MOD")
	private Date fecha_mod;

	public Long getId() {
		return id;
	}

	public movsubm() {
		
	}

	
	public movsubm(Long id, Long tipmov_id, String nombre, String usuario_crea, Date fecha_crea, String usuario_mod,
			Date fecha_mod) {
		super();
		this.id = id;
		this.tipmov_id = tipmov_id;
		this.nombre = nombre;
		this.usuario_crea = usuario_crea;
		this.fecha_crea = fecha_crea;
		this.usuario_mod = usuario_mod;
		this.fecha_mod = fecha_mod;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipmov_id() {
		return tipmov_id;
	}

	public void setTipmov_id(Long tipmov_id) {
		this.tipmov_id = tipmov_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario_crea() {
		return usuario_crea;
	}

	public void setUsuario_crea(String usuario_crea) {
		this.usuario_crea = usuario_crea;
	}

	public Date getfecha_crea() {
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
		return "movsubm [id=" + id + ", tipmov_id=" + tipmov_id + ", nombre=" + nombre + ", usuario_crea="
				+ usuario_crea + ", fecha_crea=" + fecha_crea + ", usuario_mod=" + usuario_mod + ", fecha_mod="
				+ fecha_mod + "]";
	}


		
	
	
}
