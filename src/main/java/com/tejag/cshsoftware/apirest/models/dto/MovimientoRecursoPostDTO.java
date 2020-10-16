package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class MovimientoRecursoPostDTO {

	private String descripcion;
	private String donante;
	private String cantidad;
	private Long idTipoMovimiento;
	private Date fecha;

	public MovimientoRecursoPostDTO() {
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

	public Long getIdTipoMovimiento() {
		return idTipoMovimiento;
	}

	public void setIdTipoMovimiento(Long idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}

}
