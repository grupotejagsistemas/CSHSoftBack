package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.VeterinariaCercanaDAO;
import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercana;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaCercanaService;

@Service
public class VeterinariaCercanaServiceImpl implements VeterinariaCercanaService {

	@Autowired
	private VeterinariaCercanaDAO veterinariaDao;
	
	@Override
	@Transactional
	public VeterinariaCercana create(VeterinariaCercana veterinaria) {
		return veterinariaDao.save(veterinaria);
	}

	@Override
	@Transactional
	public void deleteByIdVoluntario(Long idVoluntario) {
		veterinariaDao.deleteByIdVoluntario(idVoluntario);
		
	}

}
