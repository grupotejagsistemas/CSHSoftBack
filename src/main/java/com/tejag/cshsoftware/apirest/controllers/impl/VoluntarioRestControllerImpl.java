package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.tejag.cshsoftware.apirest.controllers.VoluntarioRestController;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VoluntarioServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class VoluntarioRestControllerImpl implements VoluntarioRestController {

	@Autowired
	private VoluntarioServiceDTO serviceDto;

	@Override
	public List<VoluntarioDTO> getVoluntarios() {
		return serviceDto.getVoluntario();
	}

	@Override
	public VoluntarioDTO show(Long id) {
		return serviceDto.findById(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void create(VoluntarioPostDTO voluntarioPost) {
		serviceDto.save(voluntarioPost);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void update(Long id, VoluntarioPostDTO voluntarioPut) {
		serviceDto.update(id, voluntarioPut);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	public void delete(Long id) {
		serviceDto.deleteById(id);
	}

	@Override
	public List<VoluntarioDTO> findByNombre(String nombre) {
		return serviceDto.findByNombre(nombre);
	}

	@Override
	public List<VoluntarioDTO> findByVoluntarioppt(String filtro) {
		return serviceDto.findByVoluntarioppt(filtro);
	}

}
