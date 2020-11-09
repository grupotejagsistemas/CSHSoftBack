package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipomovimiento")
public class TipoMovimiento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_MOVIMIENTO")
	private Long id_tipo_movimiento;
	
	@Column(name = "Descripcion", nullable = false)
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
