package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.UsuarioRestController;
import com.tejag.cshsoftware.apirest.models.dto.NuevaContrasenaDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.UsuarioDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class UsuarioRestControllerImpl implements UsuarioRestController {

	@Autowired
	private UsuarioDTOService usuarioDtoService;

	@Override
	public ResponseEntity<?> create(UsuarioPostDTO usuario) throws Exception {
		Map<String, Object> response = new HashMap<>();
		try {
			usuarioDtoService.create(usuario);
			response.put("mensaje", "El usuario se creó con éxito.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public ResponseEntity<?> updatePassword(NuevaContrasenaDTO nuevaContrasena) throws Exception {
		Map<String, Object> response = new HashMap<>();
		try {
			usuarioDtoService.updatePassword(nuevaContrasena);
			response.put("mensaje", "La contraseña fue modificada de manera exitosa.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
