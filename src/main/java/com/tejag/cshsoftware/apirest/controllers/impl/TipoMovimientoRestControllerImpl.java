package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.TipoMovimientoRestController;
import com.tejag.cshsoftware.apirest.models.dto.TipoMovimientoDTO;

import com.tejag.cshsoftware.apirest.models.service.dto.TipoMovimientoDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class TipoMovimientoRestControllerImpl implements TipoMovimientoRestController {
	
	@Autowired
	private TipoMovimientoDTOService tipomovimientoDtoService; 
	
	

	@Override
	public List<TipoMovimientoDTO> getTipoMovimientos() {
		return tipomovimientoDtoService.getTipoMovimientos();
	}

	

}
