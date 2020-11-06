package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class VoluntarioMascotaDTO {

	private Long id;
	private String idVoluntario;
	private String nombreVoluntario;
	private String domicilioVoluntario;
	private String idMascota;
	private String nombreMascota;
	private Date fecha;

	public VoluntarioMascotaDTO() {

	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
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

	public String getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(String idMascota) {
		this.idMascota = idMascota;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIdVoluntario() {
		return idVoluntario;
	}

	public void setIdVoluntario(String idVoluntario) {
		this.idVoluntario = idVoluntario;
	}

}
