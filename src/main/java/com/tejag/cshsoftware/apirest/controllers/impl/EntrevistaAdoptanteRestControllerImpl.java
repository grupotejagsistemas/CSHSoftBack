package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.EntrevistaAdoptanteRestController;
import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptantePostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.EntrevistaAdoptanteDTOService;




@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class EntrevistaAdoptanteRestControllerImpl implements EntrevistaAdoptanteRestController {
	
	@Autowired 
	private EntrevistaAdoptanteDTOService entrevistaadoptanteserviceDto;


	@Override
	public List<EntrevistaAdoptanteDTO> getEntrevistaAdoptantes() {
		return entrevistaadoptanteserviceDto.getEntrevistaAdoptantes();
	}

	@Override
	public EntrevistaAdoptanteDTO show(Long id) {
		return entrevistaadoptanteserviceDto.findById(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void create(EntrevistaAdoptantePostDTO entrevistaadoptantePost) {
		entrevistaadoptanteserviceDto.save(entrevistaadoptantePost);
		
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void update(Long id, EntrevistaAdoptantePostDTO entrevistaadoptantePut) {
		entrevistaadoptanteserviceDto.update(id,entrevistaadoptantePut );
		
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	public void delete(Long id) {
		entrevistaadoptanteserviceDto.deleteById(id);
		
	}

	@Override
	public List<EntrevistaAdoptanteDTO> findByNombre(String nombrecompleto) {
		return entrevistaadoptanteserviceDto.findByNombre(nombrecompleto);
	}

}
