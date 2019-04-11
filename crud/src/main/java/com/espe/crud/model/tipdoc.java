package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UZMTCARGDOC", schema="UTIC")
public class tipdoc {

	@Id
	@Column(name = "UZMTCARGDOC_ID")
	private Long id;
	
	@Column(name = "UZMTTIPDOC_ID")
	private Long id_tip_doc;
	
	@Column(name = "UZMTFMOVILIDAD_ID")
    private Date id_fmovilidad;
	
	@Column(name = "UZMTEXTERNO_ID")
    private Date id_externo;
	
	@Column(name = "UZMTMGESTINV_ID")
    private Long id_gestinv;
	
	@Column(name = "UZMTESTINTER_ID")
    private Long id_testinter;
	

	@Column(name = "UZMTTIPDOC_RUTA")
    private String tipdoc_ruta;
	

	@Column(name = "UZMTTIPDOC_USUARIO_CREA")
    private String usuario_crea ;
	

	@Column(name = "UZMTTIPDOC_FECHA_CREA")
    private Date fecha_crea;
	
	@Column(name = "UZMTTIPDOC_USUARIO_MOD")
    private String usuario_mod;
	
	@Column(name = "UZMTTIPDOC_FECHA_MOD")
    private Date fecha_mod;

	public tipdoc() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_tip_doc() {
		return id_tip_doc;
	}

	public void setId_tip_doc(Long id_tip_doc) {
		this.id_tip_doc = id_tip_doc;
	}

	public Date getId_fmovilidad() {
		return id_fmovilidad;
	}

	public void setId_fmovilidad(Date id_fmovilidad) {
		this.id_fmovilidad = id_fmovilidad;
	}

	public Date getId_externo() {
		return id_externo;
	}

	public void setId_externo(Date id_externo) {
		this.id_externo = id_externo;
	}

	public Long getId_gestinv() {
		return id_gestinv;
	}

	public void setId_gestinv(Long id_gestinv) {
		this.id_gestinv = id_gestinv;
	}

	public Long getId_testinter() {
		return id_testinter;
	}

	public void setId_testinter(Long id_testinter) {
		this.id_testinter = id_testinter;
	}

	public String getTipdoc_ruta() {
		return tipdoc_ruta;
	}

	public void setTipdoc_ruta(String tipdoc_ruta) {
		this.tipdoc_ruta = tipdoc_ruta;
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
		return "cargdoc [id=" + id + ", id_tip_doc=" + id_tip_doc + ", id_fmovilidad=" + id_fmovilidad + ", id_externo="
				+ id_externo + ", id_gestinv=" + id_gestinv + ", id_testinter=" + id_testinter + ", tipdoc_ruta="
				+ tipdoc_ruta + ", usuario_crea=" + usuario_crea + ", fecha_crea=" + fecha_crea + ", usuario_mod="
				+ usuario_mod + ", fecha_mod=" + fecha_mod + "]";
	}
	
	
	

	
}

