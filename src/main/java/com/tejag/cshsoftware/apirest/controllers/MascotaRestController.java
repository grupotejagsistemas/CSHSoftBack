package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.FiltroNombreDTO;
import com.tejag.cshsoftware.apirest.models.dto.FiltroSexoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaPostDTO;

@RequestMapping("/api")
public interface MascotaRestController {
	
	@GetMapping("/mascotas")
	public List<MascotaDTO> getMascotas();
	
	@GetMapping("/mascotas/{id}")
	public MascotaDTO show(@PathVariable Long id);
	
	@PostMapping("/mascotas")
	public void create(@RequestBody MascotaPostDTO mascotaPost);
	
	@PutMapping("/mascotas/{id}")
	public void update(@PathVariable Long id, @RequestBody MascotaPostDTO mascotaPut);
	
	@DeleteMapping("/mascotas/{id}")
	public void delete(@PathVariable Long id);
	
	@GetMapping("/mascotas/filtrar")
	public List<MascotaDTO> findByNombre(@RequestBody FiltroNombreDTO nombre);
	
	@GetMapping("/mascotas/filtrarSexo")
	public List<MascotaDTO> findBySexo(@RequestBody FiltroSexoDTO sexo);

}
