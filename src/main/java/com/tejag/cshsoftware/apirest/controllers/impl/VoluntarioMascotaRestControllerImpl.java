package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.VoluntarioMascotaRestController;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VoluntarioMascotaDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class VoluntarioMascotaRestControllerImpl implements VoluntarioMascotaRestController {

	@Autowired
	private VoluntarioMascotaDTOService voluntarioMascotaDtoService;

	@Override
	public void create(VoluntarioMascotaPostDTO historial) {
		voluntarioMascotaDtoService.create(historial);
	}

	@Override
	public void update(VoluntarioMascotaPostDTO historial, Long id) {
		voluntarioMascotaDtoService.update(historial, id);
	}

	@Override
	public VoluntarioMascotaDTO getById(Long id) {
		return voluntarioMascotaDtoService.getById(id);
	}

	@Override
	public List<VoluntarioMascotaDTO> getAll() {
		return voluntarioMascotaDtoService.getAll();
	}

	@Override
	public void deleteById(Long id) {
		voluntarioMascotaDtoService.deleteById(id);
		
	}

	@Override
	public List<VoluntarioMascotaDTO> getByNombre(String nombre) {
		return voluntarioMascotaDtoService.getByNombre(nombre);
	}

}
