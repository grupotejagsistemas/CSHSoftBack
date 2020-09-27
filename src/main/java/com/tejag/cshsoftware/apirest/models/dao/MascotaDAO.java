package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.Mascota;

public interface MascotaDAO extends CrudRepository<Mascota, Long> {

	@Query("from Mascota m where m.nombre like %:nombre%")
	public List<Mascota> findByNombre(String nombre);
	
//	@Query("from Mascota m where m.nombre like %:nombre%")
	public List<Mascota> findBySexo(String sexo);
	
}
