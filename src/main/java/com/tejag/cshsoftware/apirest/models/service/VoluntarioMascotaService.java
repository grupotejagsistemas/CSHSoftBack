package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.VoluntarioMascota;

public interface VoluntarioMascotaService {

	public VoluntarioMascota create(VoluntarioMascota voluntarioMascota);
	
	public void update(VoluntarioMascota voluntarioMascota);
	
	public VoluntarioMascota getById(Long id);
	
	public List<VoluntarioMascota> getAll();
	
	public void deleteById(Long id);
	
	public List<VoluntarioMascota> getByNombre(String nombre);
	
}
