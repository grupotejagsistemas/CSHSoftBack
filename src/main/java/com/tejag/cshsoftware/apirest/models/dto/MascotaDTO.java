package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class MascotaDTO {

	private Long id;
	private String nombre;
	private Date fechaNacimiento;
	private String particularidadesFisicas;
	private String sexo;
	private String fotoMascota;
	private Date fechaRescate;
	private String lugarRescate;
	private String descripcionRescate;
	private String especie;
	private MascotaEstadoDTO estado;

	public MascotaDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	public String getFotoMascota() {
		return fotoMascota;
	}

	public void setFotoMascota(String fotoMascota) {
		this.fotoMascota = fotoMascota;
	}

	public Date getFechaRescate() {
		return fechaRescate;
	}

	public void setFechaRescate(Date fechaRescate) {
		this.fechaRescate = fechaRescate;
	}

	public String getLugarRescate() {
		return lugarRescate;
	}

	public void setLugarRescate(String lugarRescate) {
		this.lugarRescate = lugarRescate;
	}

	public String getDescripcionRescate() {
		return descripcionRescate;
	}

	public void setDescripcionRescate(String descripcionRescate) {
		this.descripcionRescate = descripcionRescate;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public MascotaEstadoDTO getEstado() {
		return estado;
	}

	public void setEstado(MascotaEstadoDTO estado) {
		this.estado = estado;
	}

}
