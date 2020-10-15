package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.ContratoRestController;
import com.tejag.cshsoftware.apirest.models.dto.ContratoDTO;
import com.tejag.cshsoftware.apirest.models.dto.ContratoPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.ContratoDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class ContratoRestControllerImpl implements ContratoRestController {

	@Autowired
	private ContratoDTOService contratoDtoService;

	@Override
	public void create(ContratoPostDTO contrato) {
		contratoDtoService.create(contrato);

	}

	@Override
	public List<ContratoDTO> getContratos() {
		return contratoDtoService.getContratos();
	}

	@Override
	public List<ContratoDTO> getContratoByMascota(String nombre) {
		return contratoDtoService.getByNombreMascota(nombre);
	}

}
