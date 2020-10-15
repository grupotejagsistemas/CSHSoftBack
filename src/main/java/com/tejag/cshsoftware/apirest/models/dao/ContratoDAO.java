package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.Contrato;

public interface ContratoDAO extends CrudRepository<Contrato, Long> {

	public List<Contrato> findByMascotasNombre(String nombre);
	
}
