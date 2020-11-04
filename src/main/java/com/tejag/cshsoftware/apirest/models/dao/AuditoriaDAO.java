package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.tejag.cshsoftware.apirest.models.entity.Auditoria;

public interface AuditoriaDAO extends CrudRepository<Auditoria, Long> {
	
	@Query("from Auditoria a where a.usuario like %:usuario%")
	public List<Auditoria> findByNombre(String usuario);
	
	public List<Auditoria> findByFiltroAccionDTO(String accion);


	
	
	

}
