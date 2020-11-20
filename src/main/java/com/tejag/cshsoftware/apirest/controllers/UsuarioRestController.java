package com.tejag.cshsoftware.apirest.controllers;

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

import com.tejag.cshsoftware.apirest.models.dto.NuevaContrasenaDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioGetDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPutDTO;

@RequestMapping("/admin")
public interface UsuarioRestController {

	@Secured("ROLE_ADMIN")
	@PostMapping("/usuario")
	public ResponseEntity<?> create(@RequestBody UsuarioPostDTO usuario) throws Exception;

	@PutMapping("/usuario")
	public ResponseEntity<?> updatePassword(@RequestBody NuevaContrasenaDTO nuevaContrasena) throws Exception;

	@Secured("ROLE_ADMIN")
	@DeleteMapping("/usuario/{id}")
	public void deleteById(@PathVariable("id") Long id);

	@Secured("ROLE_ADMIN")
	@PutMapping("/usuario/put")
	public ResponseEntity<?> updateRole(@RequestBody UsuarioPutDTO usuario) throws Exception;

	@Secured("ROLE_ADMIN")
	@GetMapping("/usuario")
	public List<UsuarioGetDTO> getAll();

	@Secured("ROLE_ADMIN")
	@GetMapping("/usuario/{id}")
	public UsuarioGetDTO getById(@PathVariable("id") Long id);

}
