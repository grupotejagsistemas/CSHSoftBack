package com.tejag.cshsoftware.apirest.models.dto;

public class ContratoDTO {

	private Long idContrato;
	private String adoptante;
	private String mascota;
	private String nuevoNombre;

	public ContratoDTO() {

	}

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public String getAdoptante() {
		return adoptante;
	}

	public void setAdoptante(String adoptante) {
		this.adoptante = adoptante;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	public String getNuevoNombre() {
		return nuevoNombre;
	}

	public void setNuevoNombre(String nuevoNombre) {
		this.nuevoNombre = nuevoNombre;
	}

}
