package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.ContratoDTO;
import com.tejag.cshsoftware.apirest.models.dto.ContratoPostDTO;

public interface ContratoDTOService {

	public void create(ContratoPostDTO contrato);
	
	public List<ContratoDTO> getContratos();
	
	public List<ContratoDTO> getByNombreMascota(String nombre);
	
}
