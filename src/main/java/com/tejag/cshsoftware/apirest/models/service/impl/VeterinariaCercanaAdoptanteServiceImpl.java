package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.VeterinariaCercanaAdoptanteDAO;
import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercanaAdoptante;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaCercanaAdoptanteService;

@Service
public class VeterinariaCercanaAdoptanteServiceImpl implements VeterinariaCercanaAdoptanteService {

	@Autowired
	private VeterinariaCercanaAdoptanteDAO daoInstance;

	@Override
	@Transactional
	public void create(VeterinariaCercanaAdoptante vetCercAdop) {
		daoInstance.save(vetCercAdop);

	}

}
