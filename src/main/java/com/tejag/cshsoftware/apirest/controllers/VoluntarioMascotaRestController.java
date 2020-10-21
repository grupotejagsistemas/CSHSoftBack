package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaPostDTO;

@RequestMapping("/api")
public interface VoluntarioMascotaRestController {

	@PostMapping("/historial")
	public void create(@RequestBody VoluntarioMascotaPostDTO historial);
	
	@PutMapping("/historial/{id}")
	public void update(@RequestBody VoluntarioMascotaPostDTO historial, @PathVariable("id") Long id);
	
	@GetMapping("/historial/{id}")
	public VoluntarioMascotaDTO getById(@PathVariable("id") Long id);
	
	@GetMapping("/historial")
	public List<VoluntarioMascotaDTO> getAll();
	
	@DeleteMapping("/historial/{id}")
	public void deleteById(@PathVariable("id") Long id);
	
	@GetMapping("/historial/filtrar")
	public List<VoluntarioMascotaDTO> getByNombre(@RequestParam("nombre") String nombre);
	
}
