package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;

public interface VeterinariaDAO extends CrudRepository<Veterinaria, Long> {
	
	@Query("from Veterinaria v where v.razonSocial like %:razonsocial%")
	public List<Veterinaria> findByRazonSocial(String razonsocial);
	
	public List<Veterinaria> findByInternacion(String internacion);

	
}
