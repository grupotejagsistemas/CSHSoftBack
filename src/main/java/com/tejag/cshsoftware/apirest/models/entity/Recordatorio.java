package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "recordatorios")
public class Recordatorio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_recordatorio;
	
	@Column(name = "descripcion_recordatorio", nullable = false, length = 50)
	private String descripcion_recordatorio;
	
	@Column(name = "fecha", nullable = false, length = 50)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	public Recordatorio() {
		
	}

	public Long getId_recordatorio() {
		return id_recordatorio;
	}

	public void setId_recordatorio(Long id_recordatorio) {
		this.id_recordatorio = id_recordatorio;
	}

	public String getDescripcion_recordatorio() {
		return descripcion_recordatorio;
	}

	public void setDescripcion_recordatorio(String descripcion_recordatorio) {
		this.descripcion_recordatorio = descripcion_recordatorio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
