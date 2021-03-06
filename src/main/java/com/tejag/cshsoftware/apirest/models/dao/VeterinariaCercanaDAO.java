package com.tejag.cshsoftware.apirest.models.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercana;

public interface VeterinariaCercanaDAO extends CrudRepository<VeterinariaCercana, Long> {

	@Modifying
	@Query(nativeQuery = true, value = "delete from veterinariacercana where ID_VOLUNTARIO=:idVoluntario")
	public void deleteByIdVoluntario(Long idVoluntario);
	
}
