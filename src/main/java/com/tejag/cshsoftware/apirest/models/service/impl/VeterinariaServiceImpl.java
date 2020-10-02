package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.VeterinariaDAO;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaService;

@Service
public class VeterinariaServiceImpl implements VeterinariaService {

	@Autowired
	private VeterinariaDAO veterinariaDao;

	@Override
	@Transactional(readOnly = true)
	public Veterinaria findById(long id) {
		return veterinariaDao.findById(id).orElse(null);
	}

}
