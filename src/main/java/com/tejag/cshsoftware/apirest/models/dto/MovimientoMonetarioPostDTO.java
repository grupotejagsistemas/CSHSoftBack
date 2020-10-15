package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class MovimientoMonetarioPostDTO {
	private String tipoMovimiento;
	private Double monto;
	private String medio;
	private String autor;
	private Date fecha;
	
	public MovimientoMonetarioPostDTO() {

	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
