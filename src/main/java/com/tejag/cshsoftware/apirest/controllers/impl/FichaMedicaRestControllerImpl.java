package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.FichaMedicaRestController;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPutDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.FichaMedicaServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class FichaMedicaRestControllerImpl implements FichaMedicaRestController {

	@Autowired
	private FichaMedicaServiceDTO fichaMedicaServiceDto;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void create(FichaMedicaPostDTO fichaMedicaPost) {
		fichaMedicaServiceDto.save(fichaMedicaPost);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	public List<FichaMedicaDTO> getMascotas() {
		return fichaMedicaServiceDto.getFichasMedicas();
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void update(int id, FichaMedicaPutDTO fichaMedicaPut) {
		fichaMedicaServiceDto.update(id, fichaMedicaPut);
		
	}

	@Override
	public void deleteById(int id) {
		fichaMedicaServiceDto.deleteById(id);
		
	}

	@Override
	public FichaMedicaDTO findById(int id) {
		return fichaMedicaServiceDto.findById(id);
	}
	
}
