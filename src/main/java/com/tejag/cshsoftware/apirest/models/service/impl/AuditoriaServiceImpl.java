package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.AuditoriaDAO;
import com.tejag.cshsoftware.apirest.models.entity.Auditoria;
import com.tejag.cshsoftware.apirest.models.service.AuditoriaService;

@Service
public class AuditoriaServiceImpl implements AuditoriaService {

	@Autowired
	private AuditoriaDAO auditoriaDao;
	
	@Override
	@Transactional
	public Auditoria save(Auditoria auditoria) {
		return auditoriaDao.save(auditoria);
	}

	@Override
	@Transactional(readOnly = true)
	public Auditoria getById(Long id) {
		return auditoriaDao.findById(id).orElseThrow();
	}

	@Override
	@Transactional
	public List<Auditoria> getAll() {
		return (List<Auditoria>) auditoriaDao.findAll();
	}

	@Override
	@Transactional
	public List<Auditoria> findByNombre(String usuario) {
		return auditoriaDao.findByNombre(usuario);
	}

	@Override
	@Transactional
	public Auditoria create(Auditoria newAuditoria) {
		return auditoriaDao.save(newAuditoria);
	}

	@Override
	public List<Auditoria> findByFiltroAccionDTO(String accion) {
		return auditoriaDao.findByFiltroAccionDTO(accion);
	}
	
	

	
}
