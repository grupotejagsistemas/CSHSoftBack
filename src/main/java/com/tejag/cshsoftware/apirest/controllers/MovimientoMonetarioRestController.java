package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioPostDTO;

@RequestMapping("/api")
public interface MovimientoMonetarioRestController {

	@GetMapping("/movimientomonetarios")
	public List<MovimientoMonetarioDTO> getMovimientoMonetarios();

	@GetMapping("/movimientomonetarios/{id}")
	public MovimientoMonetarioDTO show(@PathVariable Long id);

	@PostMapping("/movimientomonetarios")
	public ResponseEntity<?> create(@RequestBody MovimientoMonetarioPostDTO movimientomonetarioPost);

}
