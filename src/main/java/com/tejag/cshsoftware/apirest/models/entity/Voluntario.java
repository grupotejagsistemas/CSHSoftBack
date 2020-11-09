package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "voluntario")
public class Voluntario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VOLUNTARIO")
	private Long idVoluntario;

	@Column(name = "NOMBRE_COMPLETO", nullable = false, length = 50)
	private String nombreCompleto;

	@Column(name = "TELEFONO", nullable = false, length = 50)
	private String telefono;

	@Column(name = "DIRECCION", nullable = false, length = 50)
	private String direccion;

	@OneToMany(mappedBy = "voluntarios", cascade = CascadeType.ALL)
	private List<VeterinariaCercana> veterinarias_cercanas = new ArrayList<>();

	@Column(name = "ZONA", nullable = false, length = 50)
	private String localidad;

	@Column(name = "TRANSITO", nullable = false, length = 2)
	private String transito;

	@Column(name = "TRASLADO", nullable = false, length = 2)
	private String traslado;

	@Column(name = "PRESENCIAL", nullable = false, length = 2)
	private String presencial;


	public Voluntario() {

	}

	public Long getIdVoluntario() {
		return idVoluntario;
	}

	public void setIdVoluntario(Long idVoluntario) {
		this.idVoluntario = idVoluntario;
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

	public List<VeterinariaCercana> getVeterinarias_cercanas() {
		return veterinarias_cercanas;
	}

	public void setVeterinarias_cercanas(List<VeterinariaCercana> veterinarias_cercanas) {
		this.veterinarias_cercanas = veterinarias_cercanas;
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
