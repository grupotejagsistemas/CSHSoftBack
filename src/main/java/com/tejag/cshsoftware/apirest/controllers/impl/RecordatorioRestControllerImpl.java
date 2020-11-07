package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> create(RecordatorioPostDTO recordatorio) {

		Map<String, Object> response = new HashMap<>();
		try {
			dtoService.create(recordatorio);
			response.put("mensaje", "Creación exitosa");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public ResponseEntity<?> update(RecordatorioPostDTO recordatorio, Long id) {
		Map<String, Object> response = new HashMap<>();
		try {
			dtoService.update(recordatorio, id);
			response.put("mensaje", "Modificación exitosa");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public RecordatorioDTO getById(Long id) {
		return dtoService.getById(id);
	}

}
