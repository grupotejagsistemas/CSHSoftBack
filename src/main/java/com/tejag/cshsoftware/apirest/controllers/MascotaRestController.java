package com.tejag.cshsoftware.apirest.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaPostDTO;

@RequestMapping("/api")
public interface MascotaRestController {
	
	@GetMapping("/mascotas")
	public List<MascotaDTO> getMascotas();
	
	@GetMapping("/mascotas/{id}")
	public MascotaDTO show(@PathVariable Long id);
	
	@PostMapping("/mascotas")
	public MascotaDTO create(@RequestBody MascotaPostDTO mascotaPost) throws Exception;
	
	@PutMapping("/mascotas/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody MascotaPostDTO mascotaPut) throws ParseException;
	
	@DeleteMapping("/mascotas/{id}")
	public void delete(@PathVariable Long id);
	
	@GetMapping("/mascotas/filtrar")
	public List<MascotaDTO> findByNombre(@RequestParam("nombre") String nombre);
	
	@GetMapping("/mascotas/filtrarSexo")
	public List<MascotaDTO> findBySexo(@RequestParam("sexo") String sexo);
	
//	@Secured("ROLE_ADMIN")
//	@PostMapping(value = "/mascotas/upload")
//	public ResponseEntity<?> insertarImagen(@RequestParam("file") MultipartFile body, String id) throws IOException, Exception;
//
//	@Secured({"ROLE_ADMIN", "ROLE_USER"})
//	@GetMapping("/mascotas/upload/img/{nombreFoto:.+}")
//	public ResponseEntity<Resource> verFoto(@PathVariable String nombreFoto);
	
	
}
