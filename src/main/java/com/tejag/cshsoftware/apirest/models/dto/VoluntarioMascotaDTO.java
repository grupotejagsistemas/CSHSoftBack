package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class VoluntarioMascotaDTO {

	private Long id;
	private String nombreVoluntario;
	private String domicilioVoluntario;
	private String nombreMascota;
	private Date fecha;

	public VoluntarioMascotaDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreVoluntario() {
		return nombreVoluntario;
	}

	public void setNombreVoluntario(String nombreVoluntario) {
		this.nombreVoluntario = nombreVoluntario;
	}

	public String getDomicilioVoluntario() {
		return domicilioVoluntario;
	}

	public void setDomicilioVoluntario(String domicilioVoluntario) {
		this.domicilioVoluntario = domicilioVoluntario;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
