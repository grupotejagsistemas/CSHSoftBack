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
@Table(name = "veterinaria_cercana_adoptante")
public class VeterinariaCercanaAdoptante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeterinariaCercanaAdoptante;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "veterinarias_id")
	private Veterinaria veterinaria_cercana_adoptante;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adoptantes_id")
	private Adoptante adoptantes;

	public VeterinariaCercanaAdoptante() {

	}

	public Long getIdVeterinariaCercanaAdoptante() {
		return idVeterinariaCercanaAdoptante;
	}

	public void setIdVeterinariaCercanaAdoptante(Long idVeterinariaCercanaAdoptante) {
		this.idVeterinariaCercanaAdoptante = idVeterinariaCercanaAdoptante;
	}

	public Veterinaria getVeterinaria_cercana_adoptante() {
		return veterinaria_cercana_adoptante;
	}

	public void setVeterinaria_cercana_adoptante(Veterinaria veterinaria_cercana_adoptante) {
		this.veterinaria_cercana_adoptante = veterinaria_cercana_adoptante;
	}

	public Adoptante getAdoptantes() {
		return adoptantes;
	}

	public void setAdoptantes(Adoptante adoptantes) {
		this.adoptantes = adoptantes;
	}

}
