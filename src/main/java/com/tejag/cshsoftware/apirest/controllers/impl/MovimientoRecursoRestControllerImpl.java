package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.MovimientoRecursoRestController;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.MovimientoRecursoServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class MovimientoRecursoRestControllerImpl implements MovimientoRecursoRestController {

	@Autowired
	private MovimientoRecursoServiceDTO movimientorecursoServiceDto;

	@Override
	public List<MovimientoRecursoDTO> getMovimientoRecursos() {
		return movimientorecursoServiceDto.getMovimientoRecursos();
	}

	@Override
	public MovimientoRecursoDTO show(Long id) {
		return movimientorecursoServiceDto.findById(id);
	}

	@Override
	public ResponseEntity<?> create(MovimientoRecursoPostDTO movimientorecursoPost) {
		Map<String, Object> response = new HashMap<>();
		try {
			movimientorecursoServiceDto.save(movimientorecursoPost);
			response.put("mensaje", "Creación exitosa.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
