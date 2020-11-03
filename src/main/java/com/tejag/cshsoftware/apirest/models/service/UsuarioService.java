package com.tejag.cshsoftware.apirest.models.service;

import com.tejag.cshsoftware.apirest.models.entity.Usuario;

public interface UsuarioService {

	public Usuario findByUsername(String username);

	public Usuario create(Usuario usuario) throws Exception;

	public Usuario changePassword(String username, String newPass, String oldPass) throws Exception;
	
	public void deleteById(Long id);
	

}
