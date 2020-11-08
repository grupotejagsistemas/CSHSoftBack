package com.tejag.cshsoftware.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.RoleUsuario;


public interface UsuarioRoleDAO extends CrudRepository<RoleUsuario, Long> {
	
	@Query("from RoleUsuario ru where ru.usuario_id = :id")
	public RoleUsuario getById(Long id);
}
