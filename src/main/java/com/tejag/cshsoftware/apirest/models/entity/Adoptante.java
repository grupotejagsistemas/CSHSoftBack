package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "adoptante")
public class Adoptante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ADOPTANTE")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ID_MASCOTA")
	private Mascota mascotas;

	@Column(name = "NUMERO_FORMULARIO", nullable = false)
	private Long numeroFormulario;

	@Column(name = "NOMBRE_COMPLETO", nullable = false, length = 50)
	private String nombre_completo;

	@Column(name = "FECHA_NACIMIENTO", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;

	@Column(name = "DOMICILIO", nullable = false, length = 50)
	private String domicilio;

	@Column(name = "BARRIO", nullable = false, length = 50)
	private String barrio;

	@Column(name = "CELULAR", nullable = false, length = 50)
	private String telefono;

	@Column(name = "EMAIL", nullable = false, length = 50)
	private String email;

	@Column(name = "FACEBOOK", nullable = false, length = 50)
	private String facebook;

	@Column(name = "INSTAGRAM", nullable = false, length = 50)
	private String instagram;

	@Column(name = "SITUACION_LABORAL", nullable = false, length = 100)
	private String situacionLaboral;

	@Column(name = "OBSERVACIONES", nullable = false, length = 100)
	private String observaciones;

	@ManyToOne
	@JoinColumn(name = "ID_ESTADO_ADOPTANTE")
	private EstadoAdoptante estado_adoptantes;

	@OneToMany(mappedBy = "adoptantes", cascade = CascadeType.ALL)
	private List<VeterinariaCercanaAdoptante> veterinarias_cercanas_adoptantes = new ArrayList<>();

	public Adoptante() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mascota getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota mascotas) {
		this.mascotas = mascotas;
	}

	public EstadoAdoptante getEstado_adoptantes() {
		return estado_adoptantes;
	}

	public void setEstado_adoptantes(EstadoAdoptante estado_adoptantes) {
		this.estado_adoptantes = estado_adoptantes;
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

	public List<VeterinariaCercanaAdoptante> getVeterinarias_cercanas_adoptantes() {
		return veterinarias_cercanas_adoptantes;
	}

	public void setVeterinarias_cercanas_adoptantes(
			List<VeterinariaCercanaAdoptante> veterinarias_cercanas_adoptantes) {
		this.veterinarias_cercanas_adoptantes = veterinarias_cercanas_adoptantes;
	}

}
