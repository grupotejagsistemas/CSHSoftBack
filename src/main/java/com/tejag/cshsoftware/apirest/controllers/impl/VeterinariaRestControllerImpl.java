package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.VeterinariaRestController;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class VeterinariaRestControllerImpl implements VeterinariaRestController {

	@Autowired
	private VeterinariaServiceDTO serviceDto;

	@Override
	public List<VeterinariaDTO> getVeterinarias() {
		return serviceDto.getVeterinarias();
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void create(VeterinariaPostDTO veterinariaPost) {
		serviceDto.save(veterinariaPost);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void update(Long id, VeterinariaPostDTO veterinariaPut) {
		serviceDto.update(id, veterinariaPut);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	public void delete(Long id) {
		serviceDto.deleteById(id);
	}

	@Override
	public List<VeterinariaDTO> findByRazonSocial(String razonSocial) {
		return serviceDto.findByRazonSocial(razonSocial);
	}

	@Override
	public List<VeterinariaDTO> findByInternacion(String internacion) {
		return serviceDto.findByInternacion(internacion);
	}

	@Override
	public VeterinariaDTO findById(int id) {
		return serviceDto.findById((long) id);
	}

}
