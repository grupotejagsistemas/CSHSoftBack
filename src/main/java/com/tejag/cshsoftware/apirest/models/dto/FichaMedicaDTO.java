package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class FichaMedicaDTO {

	private Long id;
	private Date fecha;
	private String desparasitacion;
	private String nombreProducto;
	private String vacuna;
	private String nombreVacuna;
	private String diagnostico;
	private String idMascota;
	private String mascota;
	private String IdVeterinaria;
	private String veterinaria;
	private String tratamiento;
	private String descripcionTratamiento;

	public FichaMedicaDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDesparasitacion() {
		return desparasitacion;
	}

	public void setDesparasitacion(String desparasitacion) {
		this.desparasitacion = desparasitacion;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getVacuna() {
		return vacuna;
	}

	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}

	public String getNombreVacuna() {
		return nombreVacuna;
	}

	public void setNombreVacuna(String nombreVacuna) {
		this.nombreVacuna = nombreVacuna;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getDescripcionTratamiento() {
		return descripcionTratamiento;
	}

	public void setDescripcionTratamiento(String descripcionTratamiento) {
		this.descripcionTratamiento = descripcionTratamiento;
	}

	
	
	public String getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(String idMascota) {
		this.idMascota = idMascota;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}

	
	public String getIdVeterinaria() {
		return IdVeterinaria;
	}

	public void setIdVeterinaria(String idVeterinaria) {
		IdVeterinaria = idVeterinaria;
	}

	public String getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(String veterinaria) {
		this.veterinaria = veterinaria;
	}

}
