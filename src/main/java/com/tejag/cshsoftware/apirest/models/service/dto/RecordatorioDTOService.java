package com.tejag.cshsoftware.apirest.models.service.dto;

import java.text.ParseException;
import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.RecordatorioDTO;
import com.tejag.cshsoftware.apirest.models.dto.RecordatorioPostDTO;

public interface RecordatorioDTOService {

	public List<RecordatorioDTO> getAll();
	
	public void create(RecordatorioPostDTO recordatorio) throws ParseException;
	
	public void update(RecordatorioPostDTO recordatorio, Long id) throws ParseException;
	
	public RecordatorioDTO getById(Long id);
	
}
