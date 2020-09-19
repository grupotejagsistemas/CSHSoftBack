package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "veterinaria_cercana")
public class VeterinariaCercana implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeterinariaCercana;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "veterinarias_id")
	private Veterinaria veterinaria_cercana;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voluntarios_id")
	private Voluntario voluntarios;

	public VeterinariaCercana() {

	}

	public Long getIdVeterinariaCercana() {
		return idVeterinariaCercana;
	}

	public void setIdVeterinariaCercana(Long idVeterinariaCercana) {
		this.idVeterinariaCercana = idVeterinariaCercana;
	}

	public Veterinaria getVeterinaria_cercana() {
		return veterinaria_cercana;
	}

	public void setVeterinaria_cercana(Veterinaria veterinaria_cercana) {
		this.veterinaria_cercana = veterinaria_cercana;
	}

	public Voluntario getVoluntarios() {
		return voluntarios;
	}

	public void setVoluntarios(Voluntario voluntarios) {
		this.voluntarios = voluntarios;
	}

}
