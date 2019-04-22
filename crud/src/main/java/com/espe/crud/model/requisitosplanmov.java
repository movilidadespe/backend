package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UZMTREQPLANM", schema="UTIC")
public class requisitosplanmov {
	
	@Id
	@Column(name = "UZMTREQPLANM_ID")
	private Long id;
	
	@Column(name = "UZMTREQPLANM_USUARIO_CREA")
    private String usuario_crea;
	
	@Column(name = "UZMTREQPLANM_FECHA_CREA")
    private Date fecha_crea;
	
	@Column(name = "UZMTREQPLANM_USUARIO_MOD")
    private String usuario_mod;
	
	@Column(name = "UZMTREQPLANM_FECHA_MOD")
    private Date fecha_mod;
	
	@Column(name = "UZMTREQUISITO_ID")
    private Long requisito;
	
	@Column(name = "UZMTPLANMOV_ID")
    private Long id_plan_id;
	

	
	public requisitosplanmov() {
		
	}

	
	public requisitosplanmov(Long id,String usuario_crea,Date fecha_crea, String usuario_mod,Date fecha_mod,
			Long requisito, Long id_plan_id) {
		
		super();
		this.id = id;
		this.usuario_crea = usuario_crea;
		this.fecha_crea = fecha_crea;
    	this.usuario_mod = usuario_mod;
    	this.fecha_mod = fecha_mod;
    	this.requisito = requisito;
    	this.id_plan_id = id_plan_id;
    	
		
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public Long getRequisito() {
		return requisito;
	}



	public void setRequisito(Long requisito) {
		this.requisito = requisito;
	}



	public Long getId_plan_id() {
		return id_plan_id;
	}



	public void setId_plan_id(Long id_plan_id) {
		this.id_plan_id = id_plan_id;
	}



	@Override
	public String toString() {
		return "requisitosplanmov [id=" + id + ", usuario_crea=" + usuario_crea + ", fecha_crea=" + fecha_crea
				+ ", usuario_mod=" + usuario_mod + ", fecha_mod=" + fecha_mod + ", requisito=" + requisito
				+ ", id_plan_id=" + id_plan_id + "]";
	}
	
	

}