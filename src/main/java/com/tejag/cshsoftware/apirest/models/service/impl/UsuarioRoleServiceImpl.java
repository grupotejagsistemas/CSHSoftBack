package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.UsuarioRoleDAO;
import com.tejag.cshsoftware.apirest.models.entity.RoleUsuario;
import com.tejag.cshsoftware.apirest.models.service.UsuarioRoleService;

@Service
public class UsuarioRoleServiceImpl implements UsuarioRoleService {
	
	@Autowired
	private UsuarioRoleDAO usuarioRoleDao;
	
	@Override
	@Transactional(readOnly = true)
	public RoleUsuario getById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRoleDao.getById(id) ;
	}

}
