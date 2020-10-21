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

import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptantePostDTO;

@RequestMapping("/api")
public interface EntrevistaAdoptanteRestController {
	
	@GetMapping("/entrevistaadoptantes")
	public List<EntrevistaAdoptanteDTO> getEntrevistaAdoptantes();
	
	@GetMapping("/entrevistaadoptantes/{id}")
	public EntrevistaAdoptanteDTO show(@PathVariable Long id);
	
	@PostMapping("/entrevistaadoptante")
	public void create(@RequestBody EntrevistaAdoptantePostDTO entrevistaadoptantePost);
	
	@PutMapping("/entrevistaadoptante/{id}")
	public void update(@PathVariable Long id, @RequestBody EntrevistaAdoptantePostDTO entrevistaadoptantePut);
	
	@DeleteMapping("/entrevistaadoptante/{id}")
	public void delete(@PathVariable Long id);
	
	@GetMapping("/entrevistaadoptante/filtrar")
	public List<EntrevistaAdoptanteDTO> findByNombre(@RequestParam("nombre") String nombre);

	

}
