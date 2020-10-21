package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaPostDTO;

public interface VoluntarioMascotaDTOService {

	public void create(VoluntarioMascotaPostDTO historial);

	public void update(VoluntarioMascotaPostDTO historial, Long id);

	public VoluntarioMascotaDTO getById(Long id);

	public List<VoluntarioMascotaDTO> getAll();

	public void deleteById(Long id);
	
	public List<VoluntarioMascotaDTO> getByNombre(String nombre);

}
