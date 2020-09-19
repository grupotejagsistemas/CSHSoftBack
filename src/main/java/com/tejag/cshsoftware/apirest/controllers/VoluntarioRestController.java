package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.entity.Voluntario;


@RequestMapping("/api")
public interface VoluntarioRestController {

	@GetMapping("/voluntarios")
	public List<Voluntario> getVoluntarios();

}
