package com.tejag.cshsoftware.apirest.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.UsuarioRestController;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.UsuarioDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class UsuarioRestControllerImpl implements UsuarioRestController {

	@Autowired
	private UsuarioDTOService usuarioDtoService;

	@Override
	public void create(UsuarioPostDTO usuario) {
		usuarioDtoService.create(usuario);
	}

}
