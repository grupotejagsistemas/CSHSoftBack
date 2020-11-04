package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.Usuario;

public interface UsuarioService {

	public Usuario findByUsername(String username);

	public Usuario create(Usuario usuario) throws Exception;

	public Usuario changePassword(String username, String newPass, String oldPass) throws Exception;
	
	public void deleteById(Long id);
	
	public Usuario getById(Long id);
	
	public List<Usuario> getAll();

}
