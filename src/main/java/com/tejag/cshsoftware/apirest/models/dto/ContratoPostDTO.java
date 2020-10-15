package com.tejag.cshsoftware.apirest.models.dto;

public class ContratoPostDTO {

	private Long idAdoptante;
	private Long idMascota;
	private String nuevoNombre;

	public ContratoPostDTO() {

	}

	public Long getIdAdoptante() {
		return idAdoptante;
	}

	public void setIdAdoptante(Long idAdoptante) {
		this.idAdoptante = idAdoptante;
	}

	public Long getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Long idMascota) {
		this.idMascota = idMascota;
	}

	public String getNuevoNombre() {
		return nuevoNombre;
	}

	public void setNuevoNombre(String nuevoNombre) {
		this.nuevoNombre = nuevoNombre;
	}

}
