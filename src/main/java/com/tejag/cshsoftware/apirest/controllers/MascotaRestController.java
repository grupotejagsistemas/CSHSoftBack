package com.tejag.cshsoftware.apirest.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
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
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/mascotas")
	public List<MascotaDTO> getMascotas();
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/mascotas/{id}")
	public MascotaDTO show(@PathVariable Long id);
	
	@Secured("ROLE_ADMIN")
	@PostMapping("/mascotas")
	public MascotaDTO create(@RequestBody MascotaPostDTO mascotaPost) throws Exception;
	
	@Secured("ROLE_ADMIN")
	@PutMapping("/mascotas/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody MascotaPostDTO mascotaPut) throws ParseException;
	
	@Secured("ROLE_ADMIN")
	@DeleteMapping("/mascotas/{id}")
	public void delete(@PathVariable Long id);
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/mascotas/filtrar")
	public List<MascotaDTO> findByNombre(@RequestParam("nombre") String nombre);
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
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
