package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tejag.cshsoftware.apirest.models.dto.AdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.AdoptantePostDTO;

@RequestMapping("/api")
public interface AdoptanteRestController {

	@PostMapping("/adoptante")
	public void create(@RequestBody AdoptantePostDTO adoptantePost);
	
	@GetMapping("/adoptante/{id}")
	public AdoptanteDTO getById(@PathVariable("id") Long id);
	
	@GetMapping("/adoptante")
	public List<AdoptanteDTO> getAll();
	
	@GetMapping("/adoptante/filtrarNombre")
	public List<AdoptanteDTO> getByNombre(@RequestParam("nombre") String nombreCompleto);
}
