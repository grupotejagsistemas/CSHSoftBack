package com.tejag.cshsoftware.apirest.models.service;

import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercana;

public interface VeterinariaCercanaService {

	public VeterinariaCercana create(VeterinariaCercana veterinaria);
	
	public void deleteByIdVoluntario(Long idVoluntario);
	
}
