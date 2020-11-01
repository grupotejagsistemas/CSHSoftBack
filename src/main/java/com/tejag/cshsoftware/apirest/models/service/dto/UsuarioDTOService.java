package com.tejag.cshsoftware.apirest.models.service.dto;

import com.tejag.cshsoftware.apirest.models.dto.UsuarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;

public interface UsuarioDTOService {
	
	public UsuarioDTO create(UsuarioPostDTO usuario);
	
}
