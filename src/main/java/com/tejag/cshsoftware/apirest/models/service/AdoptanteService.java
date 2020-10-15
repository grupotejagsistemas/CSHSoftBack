package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.Adoptante;

public interface AdoptanteService {

	public Adoptante save(Adoptante adoptante);
	
	public Adoptante getById(Long id);
	
	public List<Adoptante> getAll();
	
	public List<Adoptante> findByNombreCompleto(String nombreCompleto);
}
