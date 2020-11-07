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

import com.tejag.cshsoftware.apirest.controllers.AdoptanteRestController;
import com.tejag.cshsoftware.apirest.models.dto.AdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.AdoptantePostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.AdoptanteDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class AdoptanteRestControllerImpl implements AdoptanteRestController {

	@Autowired
	AdoptanteDTOService adoptanteDtoService;
	
	@Override
	public void create(AdoptantePostDTO adoptantePost) throws ParseException {
		adoptanteDtoService.create(adoptantePost);
	}

	@Override
	public AdoptanteDTO getById(Long id) {
		return adoptanteDtoService.getById(id);
	}

	@Override
	public List<AdoptanteDTO> getAll() {
		return adoptanteDtoService.getAll();
	}

	@Override
	public List<AdoptanteDTO> getByNombre(String nombreCompleto) {
		return adoptanteDtoService.getByNombre(nombreCompleto);
	}

	@Override
	public List<AdoptanteDTO> getByEstado(String estado) {
		return adoptanteDtoService.getByEstado(estado);
	}

	@Override
	public ResponseEntity<?> update(Long id, AdoptantePostDTO adoptante) {
		Map<String, Object> response = new HashMap<>();
		try {
			adoptanteDtoService.update(id, adoptante);
			response.put("mensaje", "Modificación exitosa.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
