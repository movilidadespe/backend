package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UZMTTIPCONVE", schema="UTIC")
public class tipoconve {
	

@Id
@Column(name = "UZMTTIPCONVE_ID")
private Long id;

@Column(name = "UZMTTIPCONVE_NOM")
private String nombre;

@Column(name = "UZMTTIPCONVE_USUARIO_CREA")
private String usuario_crea;

@Column(name = "UZMTTIPCONVE_FECHA_CREA")
private Date fecha_crea;

@Column(name = "UZMTTIPCONVE_USUARIO_MOD")
private String usuario_mod;

@Column(name = "UZMTTIPCONVE_FECHA_MOD")
private Date fecha_mod;



public tipoconve() {
	
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
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
	return "tipoconve [id=" + id + ", nombre=" + nombre + ", usuario_crea=" + usuario_crea + ", fecha_crea="
			+ fecha_crea + ", usuario_mod=" + usuario_mod + ", fecha_mod=" + fecha_mod + "]";
}



}

