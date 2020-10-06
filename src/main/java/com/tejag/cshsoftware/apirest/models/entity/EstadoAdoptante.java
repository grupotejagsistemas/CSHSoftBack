package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

public class EstadoAdoptante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id_estado_adoptante;
	private String descripcion;
	
	public EstadoAdoptante() {
		
	}

	public Long getId_estado_adoptante() {
		return id_estado_adoptante;
	}

	public void setId_estado_adoptante(Long id_estado_adoptante) {
		this.id_estado_adoptante = id_estado_adoptante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
