package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "voluntarios_mascotas")
public class VoluntarioMascota implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoluntarioMascota;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mascotas_id")
	private Mascota mascotas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voluntarios_id")
	private Voluntario voluntarios;

	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;

	public VoluntarioMascota() {

	}

	public Long getIdVoluntarioMascota() {
		return idVoluntarioMascota;
	}

	public void setIdVoluntarioMascota(Long idVoluntarioMascota) {
		this.idVoluntarioMascota = idVoluntarioMascota;
	}

	public Mascota getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota mascotas) {
		this.mascotas = mascotas;
	}

	public Voluntario getVoluntarios() {
		return voluntarios;
	}

	public void setVoluntarios(Voluntario voluntarios) {
		this.voluntarios = voluntarios;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
