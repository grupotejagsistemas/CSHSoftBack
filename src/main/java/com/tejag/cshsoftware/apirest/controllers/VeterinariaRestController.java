package com.tejag.cshsoftware.apirest.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;

@RequestMapping("/api")
public interface VeterinariaRestController {

	@GetMapping("/veterinaria/{id}")
	public VeterinariaDTO findById(@PathParam("id") int id);

}
