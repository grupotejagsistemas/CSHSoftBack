package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "auditoria")
public class Auditoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ACCION_USUARIO")
	private Long id_accionusuario;
	
	@Column(name = "ACCION", nullable = false, length = 50)
	private String accion;
	
	@Column(name = "USUARIO",nullable = false, length = 50)
	private String usuario;
	
	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	public Auditoria() {}

	public Long getId_accionusuario() {
		return id_accionusuario;
	}

	public void setId_accionusuario(Long id_accionusuario) {
		this.id_accionusuario = id_accionusuario;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	

	
	}
	
	
	
	


