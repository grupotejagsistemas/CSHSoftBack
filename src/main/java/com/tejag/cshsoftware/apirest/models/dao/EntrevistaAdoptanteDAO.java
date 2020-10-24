package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.EntrevistaAdoptante;

public interface EntrevistaAdoptanteDAO extends CrudRepository<EntrevistaAdoptante, Long> {

	@Query("from EntrevistaAdoptante ea where ea.adoptantes.nombre_completo like %:nombre_completo%")
	public List<EntrevistaAdoptante> findByAdoptantesNombre_completo(String nombre_completo);

}
