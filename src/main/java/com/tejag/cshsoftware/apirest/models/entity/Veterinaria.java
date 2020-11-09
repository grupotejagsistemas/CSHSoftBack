package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veterinaria")
public class Veterinaria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VETERINARIA")
	private Long idVeterinaria;

	@Column(name = "RAZON_SOCIAL", nullable = false, length = 50)
	private String razonSocial;

	@Column(name = "HORARIO_ATENCION", nullable = false, length = 50)
	private String horarioAtencion;

	@Column(name = "DIRECCION", nullable = false, length = 50)
	private String direccion;

	@Column(name = "INTERNACION", nullable = false, length = 2)
	private String internacion;

	@Column(name = "OBSERVACIONES", nullable = true, length = 50)
	private String observaciones;

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

}
