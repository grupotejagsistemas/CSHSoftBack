package com.tejag.cshsoftware.apirest.models.dto;

public class TipoMovimientoDTO {
	
	private Long Id;
	private String descripcion;
	
	public TipoMovimientoDTO() {}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
