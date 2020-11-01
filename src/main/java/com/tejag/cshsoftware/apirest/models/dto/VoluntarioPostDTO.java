package com.tejag.cshsoftware.apirest.models.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.service.dto.IdVeterinariaDTO;

public class VoluntarioPostDTO {

	private String nombreCompleto;
	private String telefono;
	private String direccion;
	private List<IdVeterinariaDTO> idveterinarias;
	private String localidad;
	private String transito;
	private String traslado;
	private String presencial;

	public VoluntarioPostDTO() {

	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
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

	public List<IdVeterinariaDTO> getIdveterinarias() {
		return idveterinarias;
	}

	public void setIdveterinarias(List<IdVeterinariaDTO> idveterinarias) {
		this.idveterinarias = idveterinarias;
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

	public String getTraslado() {
		return traslado;
	}

	public void setTraslado(String traslado) {
		this.traslado = traslado;
	}

	public String getPresencial() {
		return presencial;
	}

	public void setPresencial(String presencial) {
		this.presencial = presencial;
	}

}