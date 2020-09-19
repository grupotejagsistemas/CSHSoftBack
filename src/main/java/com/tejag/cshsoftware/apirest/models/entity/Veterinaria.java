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
@Table(name = "veterinarias")
public class Veterinaria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeterinaria;

	@Column(nullable = false, length = 50)
	private String razonSocial;

	@Column(nullable = false, length = 50)
	private String horarioAtencion;

	@Column(nullable = false, length = 50)
	private String direccion;

	@Column(nullable = false, length = 2)
	private String internacion;

	@Column(nullable = true, length = 50)
	private String observaciones;

	@OneToMany(mappedBy = "veterinarias", cascade = CascadeType.ALL)
	private List<FichaMedica> fichas_medicas = new ArrayList<>();

	@OneToMany(mappedBy = "veterinaria_cercana", cascade = CascadeType.ALL)
	private List<VeterinariaCercana> veterinarias_cercanas = new ArrayList<>();

	public Veterinaria() {

	}

	public Long getIdVeterinaria() {
		return idVeterinaria;
	}

	public void setIdVeterinaria(Long idVeterinaria) {
		this.idVeterinaria = idVeterinaria;
	}

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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<FichaMedica> getFichas_medicas() {
		return fichas_medicas;
	}

	public void setFichas_medicas(List<FichaMedica> fichas_medicas) {
		this.fichas_medicas = fichas_medicas;
	}

	public List<VeterinariaCercana> getVeterinarias_cercanas() {
		return veterinarias_cercanas;
	}

	public void setVeterinarias_cercanas(List<VeterinariaCercana> veterinarias_cercanas) {
		this.veterinarias_cercanas = veterinarias_cercanas;
	}

}
