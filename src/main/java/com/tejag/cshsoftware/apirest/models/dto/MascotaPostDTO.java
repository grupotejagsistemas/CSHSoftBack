package com.tejag.cshsoftware.apirest.models.dto;

public class MascotaPostDTO {

	private String nombre;
	private String fechaNacimiento;
	private String particularidadesFisicas;
	private String sexo;
	private String fotoMascota;
	private String fechaRescate;
	private String lugarRescate;
	private String descripcionRescate;
	private String especie;
	private int estado;

	public MascotaPostDTO() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaRescate() {
		return fechaRescate;
	}

	public void setFechaRescate(String fechaRescate) {
		this.fechaRescate = fechaRescate;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
