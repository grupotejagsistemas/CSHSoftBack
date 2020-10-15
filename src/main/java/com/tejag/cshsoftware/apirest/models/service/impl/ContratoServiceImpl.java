package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.ContratoDAO;
import com.tejag.cshsoftware.apirest.models.entity.Contrato;
import com.tejag.cshsoftware.apirest.models.service.ContratoService;

@Service
public class ContratoServiceImpl implements ContratoService {

	@Autowired
	private ContratoDAO contratoDao;

	@Override
	@Transactional
	public Contrato create(Contrato contrato) {
		return contratoDao.save(contrato);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Contrato> getContratos() {
		return (List<Contrato>) contratoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Contrato> findByNombreMascota(String nombre) {
		return contratoDao.findByMascotasNombre(nombre);
	}

}
