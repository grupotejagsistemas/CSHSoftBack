package com.tejag.cshsoftware.apirest.models.dto;


public class VoluntarioPostDTO {

	private Long id;
	private String nombrecompleto;
	private String telefono;
	private String direccion;
	private Long veterinariacercana;
	private String localidad;
	private String transito;
	private String traslado;
	private String Presencial;
	//private MascotaEstadoDTO estado;

	public VoluntarioPostDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombre(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getVeterinariacercana() {
		return veterinariacercana;
	}

	public void setveterinariacercana(Long veterinariacercana) {
		this.veterinariacercana = veterinariacercana;
	}

	public String getLocalidad() {
	return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTransito() {
		return transito;
	}

	public void setTransito(String transito) {
		this.transito = transito;
	}

	public String getPresencial() {
		return Presencial;
	}

	public void setPresencial(String presencial) {
		Presencial = presencial;
	}

	public void setVeterinariacercana(Long veterinariacercana) {
		this.veterinariacercana = veterinariacercana;
	}

	public void setTraslado(String traslado) {
		this.traslado = traslado;
	}

	public String getTraslado() {
		return traslado;
	}

	public void setTranslado(String traslado) {
		this.traslado = traslado;
	}


	

}