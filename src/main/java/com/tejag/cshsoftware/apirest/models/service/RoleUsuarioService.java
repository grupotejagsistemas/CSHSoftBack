package com.tejag.cshsoftware.apirest.models.service;

public interface RoleUsuarioService {

	public void create(Long idUsuario, Long idRole);

	public void update(Long idUsuario, Long idRole) throws Exception;
	
	public void deleteByIdUsuario(Long id);

}
