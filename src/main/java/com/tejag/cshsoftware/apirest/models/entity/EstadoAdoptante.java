package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estadoadoptante")
public class EstadoAdoptante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTADO_ADOPTANTE")
	private Long id_estado_adoptante;
	
	@Column(name = "DESCRIPCION", nullable = false, length = 50)
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
