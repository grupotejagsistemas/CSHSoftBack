package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.AuditoriaDTO;
import com.tejag.cshsoftware.apirest.models.dto.AuditoriaPostDTO;

public interface AuditoriaDTOService {
	
public void create(AuditoriaPostDTO auditoria);
	
	public AuditoriaDTO getById(Long id);
	
	public List<AuditoriaDTO> getAll();
	
	public List<AuditoriaDTO> getByNombre(String usuario);

	public void save(AuditoriaPostDTO auditoria);

	public List<AuditoriaDTO> getByFiltroAccionDTO(String accion);

}
