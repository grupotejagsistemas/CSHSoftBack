package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaCercanaDTO;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercana;
import com.tejag.cshsoftware.apirest.models.entity.Voluntario;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaCercanaService;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaService;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioService;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaCercanaDTOService;

@Service
public class VeterinariaCercanaDTOServiceImpl implements VeterinariaCercanaDTOService {

	@Autowired
	private VeterinariaCercanaService service;

	@Autowired
	private VeterinariaService serviceVeterinaria;

	@Autowired
	private VoluntarioService voluntarioService;

	@Override
	public void create(VeterinariaCercanaDTO veterinaria) {
		VeterinariaCercana veterinaraCercana = new VeterinariaCercana();

		Veterinaria vet = serviceVeterinaria.findById(veterinaria.getIdVeterinaria());
		veterinaraCercana.setVeterinaria_cercana(vet);
		Voluntario voluntario = voluntarioService.findById(veterinaria.getIdVoluntario());
		veterinaraCercana.setVoluntarios(voluntario);

		service.create(veterinaraCercana);
	}

	@Override
	public void deleteByIdVoluntario(Long idVoluntario) {
		service.deleteByIdVoluntario(idVoluntario);

	}

}
