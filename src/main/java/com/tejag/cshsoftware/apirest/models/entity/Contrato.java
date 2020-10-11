package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contratos")
public class Contrato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contrato;

	@OneToOne
	@JoinColumn(name = "adoptantes_id")
	private Adoptante adoptantes;

	@OneToOne
	@JoinColumn(name = "mascotas_id")
	private Mascota mascotas;

	@Column(nullable = false, length = 50)
	private String nuevo_nombre;

	public Contrato() {

	}

	public Long getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(Long id_contrato) {
		this.id_contrato = id_contrato;
	}

	public Adoptante getAdoptantes() {
		return adoptantes;
	}

	public void setAdoptantes(Adoptante adoptantes) {
		this.adoptantes = adoptantes;
	}

	public Mascota getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota mascotas) {
		this.mascotas = mascotas;
	}

	public String getNuevo_nombre() {
		return nuevo_nombre;
	}

	public void setNuevo_nombre(String nuevo_nombre) {
		this.nuevo_nombre = nuevo_nombre;
	}

}
