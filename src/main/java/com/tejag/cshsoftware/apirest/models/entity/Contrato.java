package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

public class Contrato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id_contrato;
	private Long id_adoptante;
	private Long id_mascota;
	private String nuevo_nombre;

	public Contrato() {

	}

	public Long getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Long id_contrato) {
		this.id_contrato = id_contrato;
	}

	public Long getId_adoptante() {
		return id_adoptante;
	}

	public void setId_adoptante(Long id_adoptante) {
		this.id_adoptante = id_adoptante;
	}

	public Long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}

	public String getNuevo_nombre() {
		return nuevo_nombre;
	}

	public void setNuevo_nombre(String nuevo_nombre) {
		this.nuevo_nombre = nuevo_nombre;
	}

}
