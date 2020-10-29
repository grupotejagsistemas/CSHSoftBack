package com.tejag.cshsoftware.apirest.models.service;

import com.tejag.cshsoftware.apirest.models.entity.Usuario;

public interface UsuarioService {

	public Usuario findByUsername(String username);
	
}
