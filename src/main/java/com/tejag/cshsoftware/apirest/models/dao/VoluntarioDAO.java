package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.Voluntario;

public interface VoluntarioDAO extends CrudRepository<Voluntario, Long> {

	@Query("from Voluntario v where v.nombre like %:nombre%")
	public List<Voluntario> findByNombre(String nombre);
	
//	@Query("from Mascota m where m.nombre like %:nombre%")
	public List<Voluntario> findByTransitoOrPresencialOrTraslado(String filtro);

	public List<Voluntario> findByVoluntarioppt(String filtrovoluntarioptt);
	
}
