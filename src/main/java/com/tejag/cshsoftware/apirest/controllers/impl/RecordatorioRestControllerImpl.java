package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.RecordatorioRestController;
import com.tejag.cshsoftware.apirest.models.dto.RecordatorioDTO;
import com.tejag.cshsoftware.apirest.models.dto.RecordatorioPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.RecordatorioDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class RecordatorioRestControllerImpl implements RecordatorioRestController {

	@Autowired
	private RecordatorioDTOService dtoService;
	
	@Override
	public List<RecordatorioDTO> getAll() {
		return dtoService.getAll();
	}

	@Override
	public void create(RecordatorioPostDTO recordatorio) {
		dtoService.create(recordatorio);
		
	}

	@Override
	public void update(RecordatorioPostDTO recordatorio, Long id) {
		dtoService.update(recordatorio, id);
		
	}

	@Override
	public RecordatorioDTO getById(Long id) {
		return dtoService.getById(id);
	}

}
