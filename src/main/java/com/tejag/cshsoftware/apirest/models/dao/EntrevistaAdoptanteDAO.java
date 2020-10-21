package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.EntrevistaAdoptante;


public interface EntrevistaAdoptanteDAO extends CrudRepository<EntrevistaAdoptante, Long> {
	
	@Query("from EntrevistaAdoptante m where m.nombre like %:nombre%")
	
	public List<EntrevistaAdoptante> findById(int id);

	public List<EntrevistaAdoptante> findByNombre(long idAdoptante);

}
