package com.tejag.cshsoftware.apirest.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.VeterinariaRestController;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class VeterinariaRestControllerImpl implements VeterinariaRestController {

	@Autowired
	private VeterinariaServiceDTO veterinaServiceDto;

	@Override
	public VeterinariaDTO findById(int id) {
		return veterinaServiceDto.findById(id);
	}

}
