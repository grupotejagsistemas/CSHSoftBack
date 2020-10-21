package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class RecordatorioDTO {

	private Long idRecordatorio;
	private String descripcionRecordatorio;
	private Date fecha;

	public RecordatorioDTO() {

	}

	public Long getIdRecordatorio() {
		return idRecordatorio;
	}

	public void setIdRecordatorio(Long idRecordatorio) {
		this.idRecordatorio = idRecordatorio;
	}

	public String getDescripcionRecordatorio() {
		return descripcionRecordatorio;
	}

	public void setDescripcionRecordatorio(String descripcionRecordatorio) {
		this.descripcionRecordatorio = descripcionRecordatorio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
