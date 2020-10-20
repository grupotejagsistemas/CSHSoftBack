package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.FichaMedicaDAO;
import com.tejag.cshsoftware.apirest.models.entity.FichaMedica;
import com.tejag.cshsoftware.apirest.models.service.FichaMedicaService;

@Service
public class FichaMedicaServiceImpl implements FichaMedicaService {

	@Autowired
	private FichaMedicaDAO fichaMedicaDao;

	@Override
	@Transactional
	public FichaMedica save(FichaMedica fichaMedica) {
		return fichaMedicaDao.save(fichaMedica);
	}

	@Override
	@Transactional(readOnly = true)
	public List<FichaMedica> getFichasMedicas() {
		return (List<FichaMedica>) fichaMedicaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public FichaMedica findById(long id) {
		return fichaMedicaDao.findById(id).orElseThrow();
	}

	@Override
	public void deleteById(long id) {
		fichaMedicaDao.deleteById(id);

	}

	@Override
	@Transactional
	public FichaMedica update(FichaMedica fichaMedica) {
		return fichaMedicaDao.save(fichaMedica);
	}

}
