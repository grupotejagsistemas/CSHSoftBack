package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class MovimientoRecursoDTO {

	private Long id;
	private Date fecha;
	private String donante;
	private String descripcion;
	private String cantidad;
	

	public MovimientoRecursoDTO() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getDonante() {
		return donante;
	}


	public void setDonante(String donante) {
		this.donante = donante;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCantidad() {
		return cantidad;
	}


	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
}