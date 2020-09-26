package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mascotas")
public class Mascota implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 50)
	private String nombre;

	@Column(name = "fecha_nacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(name = "particularidad_fisica", nullable = false, length = 255)
	private String particularidadesFisica;

	@Column(nullable = false, length = 7)
	// macho o hembra
	private String sexo;

	@Column(name = "foto_mascota", nullable = false, length = 255)
	private String fotoMascota;

	@Column(name = "fecha_rescate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaRescate;

	@Column(name = "lugar_rescate", nullable = false, length = 50)
	private String lugarRescate;

	@Column(name = "descripcion_rescate", nullable = false, length = 50)
	private String descripcionRescate;

	@Column(nullable = false, length = 50)
	// canino o felino
	private String especie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estado_mascota_id")
	private MascotaEstado estado_mascota;

	@OneToMany(mappedBy = "mascotas", cascade = CascadeType.ALL)
	private List<FichaMedica> fichas_medicas = new ArrayList<>();

	@OneToMany(mappedBy = "mascotas", cascade = CascadeType.ALL)
	private List<VoluntarioMascota> voluntarios_mascotas = new ArrayList<>();

	public Mascota() {

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

	public Date getFechaNacimieto() {
		return fechaNacimiento;
	}

	public void setFechaNacimieto(Date fechaNacimieto) {
		this.fechaNacimiento = fechaNacimieto;
	}

	public String getParticularidadesFisica() {
		return particularidadesFisica;
	}

	public void setParticularidadesFisica(String particularidadesFisica) {
		this.particularidadesFisica = particularidadesFisica;
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

	public MascotaEstado getEstado_mascota() {
		return estado_mascota;
	}

	public void setEstado_mascota(MascotaEstado estado_mascota) {
		this.estado_mascota = estado_mascota;
	}

	public List<FichaMedica> getFichas_medicas() {
		return fichas_medicas;
	}

	public void setFichas_medicas(List<FichaMedica> fichas_medicas) {
		this.fichas_medicas = fichas_medicas;
	}

	public List<VoluntarioMascota> getVoluntarios_mascotas() {
		return voluntarios_mascotas;
	}

	public void setVoluntarios_mascotas(List<VoluntarioMascota> voluntarios_mascotas) {
		this.voluntarios_mascotas = voluntarios_mascotas;
	}

}
