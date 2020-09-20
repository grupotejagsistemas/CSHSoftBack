package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.MascotaRestController;
import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
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
	
}
