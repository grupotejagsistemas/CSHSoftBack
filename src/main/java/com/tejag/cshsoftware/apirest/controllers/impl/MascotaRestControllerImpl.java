package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.MascotaRestController;
import com.tejag.cshsoftware.apirest.models.dto.FiltroSexoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.MascotaServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class MascotaRestControllerImpl implements MascotaRestController {

	@Autowired 
	private MascotaServiceDTO serviceDto;

	@Override
	public List<MascotaDTO> getMascotas() {
		return serviceDto.getMascotas();
	}

	@Override
	public MascotaDTO show(Long id) {
		return serviceDto.findById(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void create(MascotaPostDTO mascotaPost) {
		serviceDto.save(mascotaPost);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void update(Long id, MascotaPostDTO mascotaPut) {
		serviceDto.update(id, mascotaPut);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	public void delete(Long id) {
		serviceDto.deleteById(id);
	}


	@Override
	public List<MascotaDTO> findByNombre(String nombre ){
		return serviceDto.findByNombre(nombre);
	}

	@Override
	public List<MascotaDTO> findBySexo(FiltroSexoDTO sexo) {
		return serviceDto.findBySexo(sexo.getSexo());
	}
	
}
