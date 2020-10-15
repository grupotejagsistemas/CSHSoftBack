package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.Contrato;

public interface ContratoService {

	public Contrato create(Contrato contrato);
	
	public List<Contrato> getContratos();
	
	public List<Contrato> findByNombreMascota(String nombre);
	
}
