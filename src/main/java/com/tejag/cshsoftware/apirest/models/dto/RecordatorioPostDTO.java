package com.tejag.cshsoftware.apirest.models.dto;

import java.util.Date;

public class RecordatorioPostDTO {

	private String descripcionRecordatorio;
	private Date fecha;

	public RecordatorioPostDTO() {

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
