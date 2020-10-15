package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.AdoptanteDAO;
import com.tejag.cshsoftware.apirest.models.entity.Adoptante;
import com.tejag.cshsoftware.apirest.models.service.AdoptanteService;

@Service
public class AdoptanteServiceImpl implements AdoptanteService {

	@Autowired
	private AdoptanteDAO adoptanteDao;

	@Override
	@Transactional
	public Adoptante save(Adoptante adoptante) {
		return adoptanteDao.save(adoptante);
	}

	@Override
	@Transactional(readOnly = true)
	public Adoptante getById(Long id) {
		return adoptanteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Adoptante> getAll() {
		return (List<Adoptante>) adoptanteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Adoptante> findByNombreCompleto(String nombreCompleto) {
		return adoptanteDao.findByNombreCompleto(nombreCompleto);
	}

}