package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

public class Adoptante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id_adoptante;
	private Long id_mascota;
	private Long numeroFormulario;
	private String nombre_completo;
	private Date fecha_nacimiento;
	private String domicilio;
	private String barrio;
	private String telefono;
	private String email;
	private String facebook;
	private String instagram;
	private String situacionLaboral;
	private String observaciones;
	private Long id_estado_adoptante;

	public Adoptante() {

	}

	public Long getId_adoptante() {
		return id_adoptante;
	}

	public void setId_adoptante(Long id_adoptante) {
		this.id_adoptante = id_adoptante;
	}

	public Long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}

	public Long getNumeroFormulario() {
		return numeroFormulario;
	}

	public void setNumeroFormulario(Long numeroFormulario) {
		this.numeroFormulario = numeroFormulario;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getId_estado_adoptante() {
		return id_estado_adoptante;
	}

	public void setId_estado_adoptante(Long id_estado_adoptante) {
		this.id_estado_adoptante = id_estado_adoptante;
	}

}
