package com.tejag.cshsoftware.apirest.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.UsuarioRoleRestController;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioRoleDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.UsuarioRoleDTOService;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class UsuarioRoleRestControllerImpl implements UsuarioRoleRestController {

	
	@Autowired
	private UsuarioRoleDTOService usuarioRoleDtoService;
	
	@Override
	public UsuarioRoleDTO getById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRoleDtoService.getById(id);
	}

}
