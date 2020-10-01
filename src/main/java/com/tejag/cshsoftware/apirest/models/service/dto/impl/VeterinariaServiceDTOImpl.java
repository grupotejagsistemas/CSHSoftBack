package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaService;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaServiceDTO;

@Service
public class VeterinariaServiceDTOImpl implements VeterinariaServiceDTO {

	@Autowired
	private VeterinariaService veterinariaService;

	@Override
	public VeterinariaDTO findById(int id) {
		return this.getVeterinariaDTO(veterinariaService.findById((long) id));
	}

	public VeterinariaDTO getVeterinariaDTO(Veterinaria entity) {
		VeterinariaDTO veterinaria = new VeterinariaDTO();
		if (entity != null) {
			veterinaria.setId(entity.getIdVeterinaria());
			veterinaria.setRazonSocial(entity.getRazonSocial());
			veterinaria.setHorarioAtencion(entity.getHorarioAtencion());
			veterinaria.setDireccion(entity.getDireccion());
			veterinaria.setInternacion(entity.getInternacion());
			veterinaria.setObservacion(entity.getObservaciones());
		}

		return veterinaria;
	}

}
