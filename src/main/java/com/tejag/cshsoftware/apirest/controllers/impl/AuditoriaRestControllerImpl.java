package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.AuditoriaRestController;
import com.tejag.cshsoftware.apirest.models.dto.AuditoriaDTO;
import com.tejag.cshsoftware.apirest.models.dto.AuditoriaPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.AuditoriaDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class AuditoriaRestControllerImpl  implements AuditoriaRestController {
	
	@Autowired
	AuditoriaDTOService auditoriaDtoService;

	@Override
	public void create(AuditoriaPostDTO auditoriaPost) {
		auditoriaDtoService.create(auditoriaPost);
		
	}

	@Override
	public AuditoriaDTO getById(Long id) {
		return auditoriaDtoService.getById(id);
	}

	@Override
	public List<AuditoriaDTO> getAll() {
		return auditoriaDtoService.getAll();
	}

	@Override
	public List<AuditoriaDTO> getByFiltroAccionDTO(String accion) {
		return auditoriaDtoService.getByFiltroAccionDTO(accion);
	}
	@Override
	public List<AuditoriaDTO> getByNombre(String usuario) {
		return auditoriaDtoService.getByNombre(usuario);
	}

}
