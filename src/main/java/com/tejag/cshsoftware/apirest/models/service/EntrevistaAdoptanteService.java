package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.EntrevistaAdoptante;

public interface EntrevistaAdoptanteService {
	
	public List<EntrevistaAdoptante> getEntrevistaAdoptantes();

	public EntrevistaAdoptante findById(long id);

	public EntrevistaAdoptante save(EntrevistaAdoptante newEntrevistaadoptante);

	public EntrevistaAdoptante update(EntrevistaAdoptante newEntrevistaadoptante);

	public void deleteById(long id);

	public List<EntrevistaAdoptante> findByNombre(String nombrecompleto);

	public void deleteById(Long idEntrevistaadoptante);

	

	

}
