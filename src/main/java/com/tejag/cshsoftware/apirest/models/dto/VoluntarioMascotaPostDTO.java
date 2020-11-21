package com.tejag.cshsoftware.apirest.models.dto;

public class VoluntarioMascotaPostDTO {

	private Long idVoluntario;
	private Long idMascota;
	private String fecha;

	public VoluntarioMascotaPostDTO() {

	}

	public Long getIdVoluntario() {
		return idVoluntario;
	}

	public void setIdVoluntario(Long idVoluntario) {
		this.idVoluntario = idVoluntario;
	}

	public Long getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Long idMascota) {
		this.idMascota = idMascota;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
