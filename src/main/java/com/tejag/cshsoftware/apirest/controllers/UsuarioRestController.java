package com.tejag.cshsoftware.apirest.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;

@RequestMapping("/admin")
public interface UsuarioRestController {

	@PostMapping("/usuario")
	public void create(@RequestBody UsuarioPostDTO usuario);
	
}
