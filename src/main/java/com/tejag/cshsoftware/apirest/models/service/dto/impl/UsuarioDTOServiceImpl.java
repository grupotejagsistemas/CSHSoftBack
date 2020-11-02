package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.NuevaContrasenaDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Usuario;
import com.tejag.cshsoftware.apirest.models.service.RoleUsuarioService;
import com.tejag.cshsoftware.apirest.models.service.UsuarioService;
import com.tejag.cshsoftware.apirest.models.service.dto.UsuarioDTOService;

@Service
public class UsuarioDTOServiceImpl implements UsuarioDTOService {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private RoleUsuarioService roleUsuarioService;

	@Override
	public UsuarioDTO create(UsuarioPostDTO usuario) throws Exception {

		Usuario newUsuario = new Usuario();
		newUsuario.setUsername(usuario.getNombreUsuario());
		newUsuario.setPassword(usuario.getContrasena());
		Boolean activo;
		if (usuario.getActivo() == 1) {
			activo = true;
			newUsuario.setEnabled(activo);
		} else {
			activo = false;
			newUsuario.setEnabled(activo);
		}
		newUsuario.setNombre(usuario.getNombre());
		newUsuario.setApellido(usuario.getApellido());
		newUsuario.setApellido(usuario.getApellido());
		Usuario usuarioCreado = null;
		usuarioCreado = usuarioService.create(newUsuario);
		if (usuarioCreado != null) {
			roleUsuarioService.create(usuarioCreado.getId(), usuario.getIdRole());
		}

		return this.getUsuarioDTO(usuarioCreado);

	}

	public UsuarioDTO getUsuarioDTO(Usuario entity) {
		UsuarioDTO usuarioDto = new UsuarioDTO();
		if (entity != null) {
			usuarioDto.setId(entity.getId());
			usuarioDto.setNombreUsuario(entity.getUsername());
			usuarioDto.setContrasena(entity.getPassword());
			usuarioDto.setEmail(entity.getEmail());
			Boolean activo = entity.getEnabled();
			if (activo == true) {
				usuarioDto.setActivo(1);
			} else {
				usuarioDto.setActivo(0);
			}
			usuarioDto.setNombre(entity.getNombre());
			usuarioDto.setApellido(entity.getApellido());
		}
		return usuarioDto;
	}

	@Override
	public void updatePassword(NuevaContrasenaDTO newPass) throws Exception {
		usuarioService.changePassword(newPass.getUsername(), newPass.getNewPass(), newPass.getOldPass());

	}
}
