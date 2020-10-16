package com.tejag.cshsoftware.apirest.models.dto;

public class VeterinariaPostDTO {
	private String razonSocial;
	private String horarioAtencion;
	private String direccion;
	private String internacion;
	private String observacion;

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getHorarioAtencion() {
		return horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getInternacion() {
		return internacion;
	}

	public void setInternacion(String internacion) {
		this.internacion = internacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
