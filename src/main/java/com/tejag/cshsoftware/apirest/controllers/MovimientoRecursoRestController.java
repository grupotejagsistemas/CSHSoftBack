package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoPostDTO;

@RequestMapping("/api")
public interface MovimientoRecursoRestController {

	@GetMapping("/movimientorecursos")
	public List<MovimientoRecursoDTO> getMovimientoRecursos();

	@GetMapping("/movimientorecursos/{id}")
	public MovimientoRecursoDTO show(@PathVariable Long id);

	@PostMapping("/movimientorecursos")
	public ResponseEntity<?> create(@RequestBody MovimientoRecursoPostDTO movimientorecursoPost);

}
