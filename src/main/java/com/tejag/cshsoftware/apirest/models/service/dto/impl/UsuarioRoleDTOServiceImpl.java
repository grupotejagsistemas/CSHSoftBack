package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.UsuarioRoleDTO;
import com.tejag.cshsoftware.apirest.models.entity.RoleUsuario;
import com.tejag.cshsoftware.apirest.models.entity.Usuario;
import com.tejag.cshsoftware.apirest.models.service.UsuarioRoleService;
import com.tejag.cshsoftware.apirest.models.service.UsuarioService;
import com.tejag.cshsoftware.apirest.models.service.dto.UsuarioRoleDTOService;

@Service
public class UsuarioRoleDTOServiceImpl implements UsuarioRoleDTOService {

	@Autowired
	private UsuarioRoleService usuarioRoleService;
	
	@Autowired
	private UsuarioService usuarioService;
	@Override
	public UsuarioRoleDTO getById(Long id) {
		// TODO Auto-generated method stub
		return this.getUsuarioRoleDTO(usuarioRoleService.getById(id));
	}
	
	
	public UsuarioRoleDTO getUsuarioRoleDTO(RoleUsuario entity) { 
		
		UsuarioRoleDTO usuarioRoleDto = new UsuarioRoleDTO();
		if(entity != null) {
			usuarioRoleDto.setId(entity.getId());
			Usuario usuario = new Usuario();
			usuario = usuarioService.getById(entity.getUsuario_id());
			usuarioRoleDto.setUsername(usuario.getUsername());
			usuarioRoleDto.setIdRole(entity.getRole_id());
			
		}
		
		return usuarioRoleDto;
		
	
	}
	
}
