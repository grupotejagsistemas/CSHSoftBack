package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class ContratoPdfDTO {

	private Long id;
	private String especie;
	private String nombreMascota;
	private String nuevoNombre;
	private String particularidadesFisicas;
	private String sexo;
	private Date fechaRescate;
	private Date fechaNacimiento;
	private String nombreAdoptante;
	private String domicilio;
	private String telefono;
	private String correo;
	private String correoEmergencia;

	public ContratoPdfDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getNuevoNombre() {
		return nuevoNombre;
	}

	public void setNuevoNombre(String nuevoNombre) {
		this.nuevoNombre = nuevoNombre;
	}

	public String getParticularidadesFisicas() {
		return particularidadesFisicas;
	}

	public void setParticularidadesFisicas(String particularidadesFisicas) {
		this.particularidadesFisicas = particularidadesFisicas;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechaRescate() {
		return fechaRescate;
	}

	public void setFechaRescate(Date fechaRescate) {
		this.fechaRescate = fechaRescate;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreAdoptante() {
		return nombreAdoptante;
	}

	public void setNombreAdoptante(String nombreAdoptante) {
		this.nombreAdoptante = nombreAdoptante;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreoEmergencia() {
		return correoEmergencia;
	}

	public void setCorreoEmergencia(String correoEmergencia) {
		this.correoEmergencia = correoEmergencia;
	}

}
