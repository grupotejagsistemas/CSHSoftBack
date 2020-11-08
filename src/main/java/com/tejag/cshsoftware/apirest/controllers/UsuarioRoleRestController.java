package com.tejag.cshsoftware.apirest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.UsuarioRoleDTO;

@RequestMapping("/api")
public interface UsuarioRoleRestController {
	
	@GetMapping("/usuario/role/{id}")
	public UsuarioRoleDTO getById(@PathVariable("id") Long id);

}
