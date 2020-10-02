package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.Voluntario;

public interface VoluntarioService {

	public List<Voluntario> getVoluntarios();

	public Voluntario findById(Long idvoluntario);

	public Voluntario save(Voluntario newVoluntario);

	public Voluntario update(Voluntario newVoluntario);

	public void deleteById(Long idVoluntario);

	public List<Voluntario> findByNombre(String nombrecompleto);
	
	public List<Voluntario> findByVoluntarioppt(String filtrovoluntarioptt);
	
}
