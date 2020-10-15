package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.AdoptanteRestController;
import com.tejag.cshsoftware.apirest.models.dto.AdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.AdoptantePostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.AdoptanteDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class AdoptanteRestControllerImpl implements AdoptanteRestController {

	@Autowired
	AdoptanteDTOService adoptanteDtoService;
	
	@Override
	public void create(AdoptantePostDTO adoptantePost) {
		adoptanteDtoService.create(adoptantePost);
	}

	@Override
	public AdoptanteDTO getById(Long id) {
		return adoptanteDtoService.getById(id);
	}

	@Override
	public List<AdoptanteDTO> getAll() {
		return adoptanteDtoService.getAll();
	}

	@Override
	public List<AdoptanteDTO> getByNombre(String nombreCompleto) {
		return adoptanteDtoService.getByNombre(nombreCompleto);
	}

	@Override
	public List<AdoptanteDTO> getByEstado(String estado) {
		return adoptanteDtoService.getByEstado(estado);
	}

	@Override
	public void update(Long id, AdoptantePostDTO adoptante) {
		adoptanteDtoService.update(id, adoptante);
		
	}

}
