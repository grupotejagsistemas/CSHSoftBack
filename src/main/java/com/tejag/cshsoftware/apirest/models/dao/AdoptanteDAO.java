package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.Adoptante;

public interface AdoptanteDAO extends CrudRepository<Adoptante, Long>{

	@Query("from Adoptante a where a.nombre_completo like %:nombreCompleto%")
	public List<Adoptante> findByNombreCompleto(String nombreCompleto);
	
}
