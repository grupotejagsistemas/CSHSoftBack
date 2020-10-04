package com.tejag.cshsoftware.apirest.models.service.dto;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaCercanaDTO;

public interface VeterinariaCercanaDTOService {

	public void create(VeterinariaCercanaDTO veterinaria);
	
	public void deleteByIdVoluntario(Long idVoluntario);
	
}
