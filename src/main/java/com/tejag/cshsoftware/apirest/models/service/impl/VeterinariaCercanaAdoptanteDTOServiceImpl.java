package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaCercanaAdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.entity.Adoptante;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercanaAdoptante;
import com.tejag.cshsoftware.apirest.models.service.AdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaCercanaAdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaService;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaCercanaAdoptanteDTOService;

@Service
public class VeterinariaCercanaAdoptanteDTOServiceImpl implements VeterinariaCercanaAdoptanteDTOService {

	@Autowired
	private VeterinariaCercanaAdoptanteService vetService;

	@Autowired
	private VeterinariaService veterinariaService;

	@Autowired
	private AdoptanteService adoptanteService;

	@Override
	public void create(VeterinariaCercanaAdoptanteDTO vetCerca) {
		VeterinariaCercanaAdoptante veterinaria = new VeterinariaCercanaAdoptante();

		Veterinaria vete = veterinariaService.findById(vetCerca.getIdVeterinaria());
		veterinaria.setVeterinaria_cercana_adoptante(vete);
		Adoptante adop = adoptanteService.getById(vetCerca.getIdAdoptante());
		veterinaria.setAdoptantes(adop);

		vetService.create(veterinaria);

	}

	@Override
	public void deleteByIdAdoptante(Long id) {
		vetService.deleteByIdAdoptante(id);

	}

}
