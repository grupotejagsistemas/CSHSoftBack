package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.MovimientoMonetarioRestController;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.MovimientoMonetarioDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class MovimientoMonetarioRestControllerImpl implements MovimientoMonetarioRestController {

	@Autowired
	private MovimientoMonetarioDTOService movimientomonetarioServiceDto;

	@Override
	public List<MovimientoMonetarioDTO> getMovimientoMonetarios() {
		return movimientomonetarioServiceDto.getMovimientoMonetarios();
	}

	@Override
	public MovimientoMonetarioDTO show(Long id) {
		return movimientomonetarioServiceDto.findById(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> create(MovimientoMonetarioPostDTO movimientomonetarioPost) {
		Map<String, Object> response = new HashMap<>();
		try {
			movimientomonetarioServiceDto.save(movimientomonetarioPost);
			response.put("mensaje", "Creación exitosa.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
