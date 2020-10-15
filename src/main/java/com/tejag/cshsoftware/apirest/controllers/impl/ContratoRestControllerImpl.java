package com.tejag.cshsoftware.apirest.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.models.service.dto.ContratoDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class ContratoRestControllerImpl {

	@Autowired
	private ContratoDTOService contratoDtoService;
	
}
