package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.NuevaContrasenaDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioGetDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.UsuarioPutDTO;

public interface UsuarioDTOService {

	public UsuarioDTO create(UsuarioPostDTO usuario) throws Exception;

	public void updatePassword(NuevaContrasenaDTO newPass) throws Exception;

	public void deleteById(Long id);
	
	public void updateRole(UsuarioPutDTO usuario) throws Exception;
	
	public List<UsuarioGetDTO> getAll();
	
	public UsuarioGetDTO getById(Long id);
}
