package com.tejag.cshsoftware.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Long> {

	public Usuario findByUsername(String username);

}
