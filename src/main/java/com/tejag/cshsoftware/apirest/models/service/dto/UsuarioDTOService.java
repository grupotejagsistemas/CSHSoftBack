package com.tejag.cshsoftware.apirest.models.service.dto;

import com.tejag.cshsoftware.apirest.models.dto.NuevaContrasenaDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPutDTO;

public interface UsuarioDTOService {

	public UsuarioDTO create(UsuarioPostDTO usuario) throws Exception;

	public void updatePassword(NuevaContrasenaDTO newPass) throws Exception;

	public void deleteById(Long id);
	
	public void updateRole(UsuarioPutDTO usuario) throws Exception;
}
