package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;
import java.util.List;

public class AdoptanteDTO {

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
	private List<VeterinariaDTO> veterinaria_cercana;
	private String observaciones;
//	private EstadoAdoptanteDTO estado_adoptante;
//	private MascotaDTO mascotaInteresada;
	private String estado_adoptante;
	private String mascotaInteresada;

	public AdoptanteDTO() {

	}

//	public MascotaDTO getMascotaInteresada() {
//		return mascotaInteresada;
//	}
//
//	public void setMascotaInteresada(MascotaDTO mascotaInteresada) {
//		this.mascotaInteresada = mascotaInteresada;
//	}

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

	public List<VeterinariaDTO> getVeterinaria_cercana() {
		return veterinaria_cercana;
	}

	public void setVeterinaria_cercana(List<VeterinariaDTO> veterinaria_cercana) {
		this.veterinaria_cercana = veterinaria_cercana;
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

//	public EstadoAdoptanteDTO getEstado_adoptante() {
//		return estado_adoptante;
//	}
//
//	public void setEstado_adoptante(EstadoAdoptanteDTO estado_adoptante) {
//		this.estado_adoptante = estado_adoptante;
//	}

}
