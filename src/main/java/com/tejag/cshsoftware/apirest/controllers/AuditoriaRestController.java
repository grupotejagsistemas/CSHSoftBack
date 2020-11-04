package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tejag.cshsoftware.apirest.models.dto.AuditoriaDTO;
import com.tejag.cshsoftware.apirest.models.dto.AuditoriaPostDTO;

@RequestMapping("/api")
public interface AuditoriaRestController {
	
	@PostMapping("/auditoria")
	public void create(@RequestBody AuditoriaPostDTO auditoriaPost);
	
	@GetMapping("/auditoria/{id}")
	public AuditoriaDTO getById(@PathVariable("id") Long id);
	
	@GetMapping("/auditoria")
	public List<AuditoriaDTO> getAll();
	
	@GetMapping("/auditoria/filtraraccion")
	public List<AuditoriaDTO> getByFiltroAccionDTO(@RequestParam("accion") String accion);

	@GetMapping("/auditoria/filtronombre")
	public List<AuditoriaDTO> getByNombre(@RequestParam("usuario") String usuario);
	
	

}
