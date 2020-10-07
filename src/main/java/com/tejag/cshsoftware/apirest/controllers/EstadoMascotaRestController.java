package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.MascotaEstadoDTO;


@RequestMapping("/api")
public interface EstadoMascotaRestController {
	@GetMapping("/estadoMascota")
	public List<MascotaEstadoDTO> getEstadosMascota();
	
	
}
