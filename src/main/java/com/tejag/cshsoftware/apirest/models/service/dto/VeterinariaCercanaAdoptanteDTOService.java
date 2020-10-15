package com.tejag.cshsoftware.apirest.models.service.dto;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaCercanaAdoptanteDTO;

public interface VeterinariaCercanaAdoptanteDTOService {

	public void create(VeterinariaCercanaAdoptanteDTO vetCerca);
	
	public void deleteByIdAdoptante(Long id);
	
}
