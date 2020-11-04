package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;
import java.util.List;

public class AuditoriaDTO {
	
	private Long id;
	private String accion;
	private String usuario;
	private Date fecha;
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public AuditoriaDTO() {}

}
