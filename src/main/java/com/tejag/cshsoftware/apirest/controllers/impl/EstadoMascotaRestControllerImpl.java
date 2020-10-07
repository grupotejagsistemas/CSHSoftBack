package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.tejag.cshsoftware.apirest.controllers.EstadoMascotaRestController;
import com.tejag.cshsoftware.apirest.models.dto.MascotaEstadoDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.EstadoMascotaDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController

public class EstadoMascotaRestControllerImpl implements EstadoMascotaRestController {
	
	@Autowired
	private EstadoMascotaDTOService estadoMascotaDtoService; 
	
	@Override
	public List<MascotaEstadoDTO> getEstadosMascota() {
		// TODO Auto-generated method stub
		return estadoMascotaDtoService.getEstadosMascotas();
	}

}
