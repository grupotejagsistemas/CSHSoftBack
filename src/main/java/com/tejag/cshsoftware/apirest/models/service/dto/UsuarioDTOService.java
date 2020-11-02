package com.tejag.cshsoftware.apirest.models.service.dto;

import com.tejag.cshsoftware.apirest.models.dto.NuevaContrasenaDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;

public interface UsuarioDTOService {
	
	public UsuarioDTO create(UsuarioPostDTO usuario) throws Exception;
	
	public void updatePassword(NuevaContrasenaDTO newPass) throws Exception;
	
}
