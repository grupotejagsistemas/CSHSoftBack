package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.TipoMovimientoDTO;
@RequestMapping("/api")
public interface TipoMovimientoRestController {
	@GetMapping("/tipomovimiento")
	public List<TipoMovimientoDTO> getTipoMovimientos();

}
