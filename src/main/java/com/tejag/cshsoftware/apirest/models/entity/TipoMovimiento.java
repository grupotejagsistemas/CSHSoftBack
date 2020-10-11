package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_movimientos")
public class TipoMovimiento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo_movimiento;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;

	public TipoMovimiento() {

	}

	public Long getId_tipo_movimiento() {
		return id_tipo_movimiento;
	}

	public void setId_tipo_movimiento(Long id_tipo_movimiento) {
		this.id_tipo_movimiento = id_tipo_movimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
