package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.EstadoAdoptanteDAO;
import com.tejag.cshsoftware.apirest.models.entity.EstadoAdoptante;
import com.tejag.cshsoftware.apirest.models.service.EstadoAdoptanteService;

@Service
public class EstadoAdoptanteServiceImpl implements EstadoAdoptanteService {

	@Autowired
	private EstadoAdoptanteDAO estadoAdoptanteDao;

	@Transactional(readOnly = true)
	public EstadoAdoptante getEstadoAdoptanteById(Long id) {

		EstadoAdoptante estado = new EstadoAdoptante();
		estado = estadoAdoptanteDao.findById(id).orElseThrow();

		return estado;
	}

}
