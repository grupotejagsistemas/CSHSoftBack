package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.VoluntarioRestController;
import com.tejag.cshsoftware.apirest.models.entity.Voluntario;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class VoluntarioRestControllerImpl implements VoluntarioRestController {

	@Autowired
	private VoluntarioService service;

	@Override
	public List<Voluntario> getVoluntarios() {
		return service.findAll();
	}

}
