package com.tejag.cshsoftware.apirest.controllers.impl;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.VoluntarioMascotaRestController;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VoluntarioMascotaDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class VoluntarioMascotaRestControllerImpl implements VoluntarioMascotaRestController {

	@Autowired
	private VoluntarioMascotaDTOService voluntarioMascotaDtoService;

	@Override
	public ResponseEntity<?> create(VoluntarioMascotaPostDTO historial) {
		Map<String, Object> response = new HashMap<>();
		try {
			voluntarioMascotaDtoService.create(historial);
			response.put("mensaje", "La mascota fue actualizada correctamente.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		} catch (ParseException e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<?> update(VoluntarioMascotaPostDTO historial, Long id) {
		Map<String, Object> response = new HashMap<>();
		try {
			voluntarioMascotaDtoService.update(historial, id);
			response.put("mensaje", "La mascota fue actualizada correctamente.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		} catch (ParseException e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public VoluntarioMascotaDTO getById(Long id) {
		return voluntarioMascotaDtoService.getById(id);
	}

	@Override
	public List<VoluntarioMascotaDTO> getAll() {
		return voluntarioMascotaDtoService.getAll();
	}

	@Override
	public void deleteById(Long id) {
		voluntarioMascotaDtoService.deleteById(id);

	}

	@Override
	public List<VoluntarioMascotaDTO> getByNombre(String nombre) {
		return voluntarioMascotaDtoService.getByNombre(nombre);
	}

}
