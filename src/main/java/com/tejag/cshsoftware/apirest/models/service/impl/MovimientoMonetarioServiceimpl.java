package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.MovimientoMonetarioDAO;
import com.tejag.cshsoftware.apirest.models.entity.MovimientoMonetario;
import com.tejag.cshsoftware.apirest.models.service.MovimientoMonetarioService;


public class MovimientoMonetarioServiceimpl implements MovimientoMonetarioService {
	@Autowired
	private MovimientoMonetarioDAO movimientomonetarioDao;


	@Override
	@Transactional(readOnly = true)
	public List<MovimientoMonetario> getMovimientoMonetarios() {
		return (List<MovimientoMonetario>) movimientomonetarioDao.findAll();
	}

	@Override
	@Transactional
	public MovimientoMonetario save(MovimientoMonetario movimientomonetario) {
		return movimientomonetarioDao.save(movimientomonetario);
	}

	@Override
	@Transactional(readOnly = true)
	public MovimientoMonetario findById(long idmovimientomonetario) {
		return movimientomonetarioDao.findById(idmovimientomonetario).orElse(null);
	}

}
