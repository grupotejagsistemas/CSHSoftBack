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
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioPostDTO;

@RequestMapping("/api")
public interface VoluntarioRestController {

	@GetMapping("/voluntario")
	public List<VoluntarioDTO> getVoluntarios();

	@GetMapping("/voluntario/{id}")
	public VoluntarioDTO show(@PathVariable Long id);

	@PostMapping("/voluntario")
	public void create(@RequestBody VoluntarioPostDTO voluntarioPost);

	@PutMapping("/voluntario/{id}")
	public void update(@PathVariable Long id, @RequestBody VoluntarioPostDTO VoluntarioPut);

	@DeleteMapping("/voluntario/{id}")
	public void delete(@PathVariable Long id);

	@GetMapping("/voluntario/filtrar")
	public List<VoluntarioDTO> findByNombre(@RequestParam("nombre") String nombre);

	@GetMapping("/voluntario/filtrarvoluntarioptt")
	public List<VoluntarioDTO> findByVoluntarioppt(@RequestParam("filtro") String filtro);

}
