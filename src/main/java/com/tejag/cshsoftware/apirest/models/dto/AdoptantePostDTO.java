package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;
import java.util.List;

import com.tejag.cshsoftware.apirest.models.service.dto.IdVeterinariaDTO;

public class AdoptantePostDTO {

	private Long idMascota;
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
	private List<IdVeterinariaDTO> idVeterinaria;
	private String observaciones;
	private int idEstadoAdoptante;

	public AdoptantePostDTO() {

	}

	public Long getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Long idMascota) {
		this.idMascota = idMascota;
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

	public List<IdVeterinariaDTO> getIdVeterinaria() {
		return idVeterinaria;
	}

	public void setIdVeterinaria(List<IdVeterinariaDTO> idVeterinaria) {
		this.idVeterinaria = idVeterinaria;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getIdEstadoAdoptante() {
		return idEstadoAdoptante;
	}

	public void setIdEstadoAdoptante(int idEstadoAdoptante) {
		this.idEstadoAdoptante = idEstadoAdoptante;
	}

}
