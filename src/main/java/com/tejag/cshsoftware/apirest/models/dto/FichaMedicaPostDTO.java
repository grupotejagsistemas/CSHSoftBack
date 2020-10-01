package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class FichaMedicaPostDTO {

	private Date fecha;
	private String desparasitacion;
	private String nombreProducto;
	private String vacuna;
	private String nombreVacuna;
	private String diagnostico;
	private int idMascota;
	private int idVeterinaria;
	private String tratamiento;
	private String descripcionTratamiento;

	public FichaMedicaPostDTO() {

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

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public int getIdVeterinaria() {
		return idVeterinaria;
	}

	public void setIdVeterinaria(int idVeterinaria) {
		this.idVeterinaria = idVeterinaria;
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

}
