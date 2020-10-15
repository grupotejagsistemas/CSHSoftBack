package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tejag.cshsoftware.apirest.models.dto.ContratoDTO;
import com.tejag.cshsoftware.apirest.models.dto.ContratoPostDTO;

@RequestMapping("/api")
public interface ContratoRestController {

	@PostMapping("/contrato")
	public void create(@RequestBody ContratoPostDTO contrato);
	
	@GetMapping("/contrato")
	public List<ContratoDTO> getContratos();
	
	@GetMapping("/contrato/filtrar")
	public List<ContratoDTO> getContratoByMascota(@RequestParam("nombreMascota") String nombre);
	
}
