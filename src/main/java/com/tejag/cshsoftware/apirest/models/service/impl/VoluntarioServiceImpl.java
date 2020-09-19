package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.VoluntarioDAO;
import com.tejag.cshsoftware.apirest.models.entity.Voluntario;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioService;

@Service
public class VoluntarioServiceImpl implements VoluntarioService {

	@Autowired
	private VoluntarioDAO voluntarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Voluntario> findAll() {

		return (List<Voluntario>) voluntarioDao.findAll();
	}

}
