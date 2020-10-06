package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.Voluntario;

public interface VoluntarioDAO extends CrudRepository<Voluntario, Long> {

	public List<Voluntario> findByNombreCompletoIgnoreCaseLike(String nombre);
	
	@Query("from Voluntario v where v.transito=s")
	public List<Voluntario> filtrarTransito(); //filtro = Transito - Presencial - Traslado
	@Query("from Voluntario v where v.presencial=s")
	public List<Voluntario> filtrarPresencial();
	@Query("from Voluntario v where v.traslado=s")
	public List<Voluntario> filtrarTraslado();
	
}
