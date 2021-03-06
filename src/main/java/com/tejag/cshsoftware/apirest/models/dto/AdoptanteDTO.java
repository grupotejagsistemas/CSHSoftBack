package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;
import java.util.List;

public class AdoptanteDTO {

	private Long id;
	private Long numeroFormulario;
	private String nombreCompleto;
	private Date fechaNacimiento;
	private String domicilio;
	private String barrio;
	private String celular;
	private String email;
	private String facebook;
	private String instagram;
	private String situacionLaboral;
	private List<VeterinariaDTO> idVeterinaria;
	private String observaciones;
	private String idEstadoAdoptante;
	private String idMascota;
	private String estado_adoptante;
	private String mascotaInteresada;

	public AdoptanteDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroFormulario() {
		return numeroFormulario;
	}

	public void setNumeroFormulario(Long numeroFormulario) {
		this.numeroFormulario = numeroFormulario;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getSituacionLaboral() {
		return situacionLaboral;
	}

	public void setSituacionLaboral(String situacionLaboral) {
		this.situacionLaboral = situacionLaboral;
	}

	

	public List<VeterinariaDTO> getIdVeterinaria() {
		return idVeterinaria;
	}

	public void setIdVeterinaria(List<VeterinariaDTO> idVeterinaria) {
		this.idVeterinaria = idVeterinaria;
	}

	public String getIdEstadoAdoptante() {
		return idEstadoAdoptante;
	}

	public void setIdEstadoAdoptante(String idEstadoAdoptante) {
		this.idEstadoAdoptante = idEstadoAdoptante;
	}

	public String getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(String idMascota) {
		this.idMascota = idMascota;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEstado_adoptante() {
		return estado_adoptante;
	}

	public void setEstado_adoptante(String estado_adoptante) {
		this.estado_adoptante = estado_adoptante;
	}

	public String getMascotaInteresada() {
		return mascotaInteresada;
	}

	public void setMascotaInteresada(String mascotaInteresada) {
		this.mascotaInteresada = mascotaInteresada;
	}

}
