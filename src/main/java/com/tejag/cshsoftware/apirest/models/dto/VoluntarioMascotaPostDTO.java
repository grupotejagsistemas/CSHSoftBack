package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class VoluntarioMascotaPostDTO {

	private Long idVoluntario;
	private Long idMascota;
	private Date fecha;

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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
