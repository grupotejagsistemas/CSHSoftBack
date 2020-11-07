package com.tejag.cshsoftware.apirest.models.service.dto;

import java.text.ParseException;
import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.AdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.AdoptantePostDTO;

public interface AdoptanteDTOService {

	public void create(AdoptantePostDTO adoptante) throws ParseException;
	
	public AdoptanteDTO getById(Long id);
	
	public List<AdoptanteDTO> getAll();
	
	public List<AdoptanteDTO> getByNombre(String nombreCompleto);
	
	public List<AdoptanteDTO> getByEstado(String estado);
	
	public void update(Long id, AdoptantePostDTO adoptante) throws ParseException;
	
}
