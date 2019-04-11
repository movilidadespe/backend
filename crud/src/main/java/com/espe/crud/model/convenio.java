package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UZMTCONVENIO", schema="UTIC")
public class convenio {

	@Id
	@Column(name = "UZMTCONVENIO_ID")
	private Long id;
	
	@Column(name = "UZMTTIPCONVE_ID")
	private Long id_tip_conve;
	
	@Column(name = "UZMTCONVENIO_FECH_INI")
    private Date fecha_ini;
	
	@Column(name = "UZMTCONVENIO_FECH_FIN")
    private Date fecha_fin;
	
	@Column(name = "UZMTCONVENIO_ESTADO")
    private Long estado;
	
	@Column(name = "STUSBGI_CODE")
    private Long code;
	

	@Column(name = "UZMTTIPCONVE_USER_CREA")
    private String user_crea;
	

	@Column(name = "UZMTTIPCONVE_FECHA_CREA")
    private Date fecha_crea;
	

	@Column(name = "UZMTTIPCONVE_USUARIO_MOD")
    private String usuario_mod;
	
	@Column(name = "UZMTTIPCONVE_FECHA_MOD")
    private Date fecha_mod;
	

	public convenio() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getId_tip_conve() {
		return id_tip_conve;
	}


	public void setId_tip_conve(Long id_tip_conve) {
		this.id_tip_conve = id_tip_conve;
	}


	public Date getFecha_ini() {
		return fecha_ini;
	}


	public void setFecha_ini(Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}


	public Date getFecha_fin() {
		return fecha_fin;
	}


	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}


	public Long getEstado() {
		return estado;
	}


	public void setEstado(Long estado) {
		this.estado = estado;
	}


	public Long getCode() {
		return code;
	}


	public void setCode(Long code) {
		this.code = code;
	}


	public String getUser_crea() {
		return user_crea;
	}


	public void setUser_crea(String user_crea) {
		this.user_crea = user_crea;
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
		return "convenio [id=" + id + ", id_tip_conve=" + id_tip_conve + ", fecha_ini=" + fecha_ini + ", fecha_fin="
				+ fecha_fin + ", estado=" + estado + ", code=" + code + ", user_crea=" + user_crea + ", fecha_crea="
				+ fecha_crea + ", usuario_mod=" + usuario_mod + ", fecha_mod=" + fecha_mod + "]";
	}



	
}

