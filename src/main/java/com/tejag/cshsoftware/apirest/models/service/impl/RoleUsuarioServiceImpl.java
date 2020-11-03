package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.RoleUsuarioDAO;
import com.tejag.cshsoftware.apirest.models.entity.RoleUsuario;
import com.tejag.cshsoftware.apirest.models.service.RoleUsuarioService;

@Service
public class RoleUsuarioServiceImpl implements RoleUsuarioService {

	@Autowired
	private RoleUsuarioDAO roleUsuarioDao;

	@Override
	@Transactional
	public void create(Long idUsuario, Long idRole) {
		RoleUsuario roleUser = new RoleUsuario();
		roleUser.setRole_id(idRole);
		roleUser.setUsuario_id(idUsuario);

		roleUsuarioDao.save(roleUser);
	}

	@Override
	@Transactional
	public void update(Long idUsuario, Long idRole) throws Exception {
		RoleUsuario roleUser = roleUsuarioDao.findByUsuario_id(idUsuario);
		if (roleUser != null) {
			roleUsuarioDao.update(idRole, roleUser.getId());
		} else {
			throw new Exception("Error al actualizar los permisos.");
		}

	}

	@Override
	@Transactional
	public void deleteByIdUsuario(Long id) {
		roleUsuarioDao.deleteByIdUsuario(id);

	}

}
