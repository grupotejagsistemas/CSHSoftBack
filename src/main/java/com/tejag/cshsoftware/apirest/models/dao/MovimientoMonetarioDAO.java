package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.MovimientoMonetario;


public interface MovimientoMonetarioDAO extends CrudRepository<MovimientoMonetario, Long> {

	List<MovimientoMonetario> findAll();

	
	

	

}
