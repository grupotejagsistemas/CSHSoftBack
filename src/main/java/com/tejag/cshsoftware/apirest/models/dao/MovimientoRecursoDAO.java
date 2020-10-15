package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.MovimientoRecurso;

public interface MovimientoRecursoDAO extends CrudRepository<MovimientoRecurso, Long>{

	List<MovimientoRecurso> findAll();
}
