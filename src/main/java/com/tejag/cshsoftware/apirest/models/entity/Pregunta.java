package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PREGUNTA")
	private Long id_pregunta;
	
	@Column(name = "PREGUNTA", nullable = false, length = 255)
	private String pregunta;

	public Pregunta() {

	}

	public Long getId_pregunta() {
		return id_pregunta;
	}

	public void setId_pregunta(Long id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

}
