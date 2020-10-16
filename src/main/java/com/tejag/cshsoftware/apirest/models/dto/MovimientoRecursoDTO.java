package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class MovimientoRecursoDTO {

	private Long id;
	private String descripcion;
	private String cantidad;
	private String donante;
	private String tipoMovimiento;
	private Date fecha;

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

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

}
