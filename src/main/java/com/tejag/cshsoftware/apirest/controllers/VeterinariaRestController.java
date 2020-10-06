package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tejag.cshsoftware.apirest.models.dto.FiltroInternacionDTO;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaPostDTO;


@RequestMapping("/api")
public interface VeterinariaRestController {

	@GetMapping("/veterinaria/{id}")
	public VeterinariaDTO findById(@PathParam("id") int id);
	@GetMapping("/veterinaria")
	public List<VeterinariaDTO> getVeterinarias();
	
	@PostMapping("/veterinaria")
	public void create(@RequestBody VeterinariaPostDTO veterinariaPost);
	
	@PutMapping("/veterinaria/{id}")
	public void update(@PathVariable Long id, @RequestBody VeterinariaPostDTO veterinariaPut);
	
	@DeleteMapping("/veterinaria/{id}")
	public void delete(@PathVariable Long id);
	
	@GetMapping("/veterinaria/filtrar")
	public List<VeterinariaDTO> findByRazonSocial(@RequestParam("razonSocial") String razonSocial);
	VeterinariaDTO show(Long id);

	@GetMapping("/veterinaria/filtrarInternacion")
	public List<VeterinariaDTO> findByInternacion(@RequestBody FiltroInternacionDTO internacion);
}
