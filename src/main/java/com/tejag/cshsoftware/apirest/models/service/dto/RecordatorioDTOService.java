package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.RecordatorioDTO;
import com.tejag.cshsoftware.apirest.models.dto.RecordatorioPostDTO;

public interface RecordatorioDTOService {

	public List<RecordatorioDTO> getAll();
	
	public void create(RecordatorioPostDTO recordatorio);
	
	public void update(RecordatorioPostDTO recordatorio, Long id);
	
	public RecordatorioDTO getById(Long id);
	
}
