package com.tejag.cshsoftware.apirest.models.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercanaAdoptante;

public interface VeterinariaCercanaAdoptanteDAO extends CrudRepository<VeterinariaCercanaAdoptante, Long> {

	@Modifying
	@Query(nativeQuery = true, value = "delete from veterinariacercanaadoptante where ID_ADOPTANTE=:idAdoptante")
	public void deleteByIdAdoptante(Long idAdoptante);
	
}
