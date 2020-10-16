package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.TipoMovimientoDAO;
import com.tejag.cshsoftware.apirest.models.entity.TipoMovimiento;
import com.tejag.cshsoftware.apirest.models.service.TipoMovimientoService;

public class TipoMovimientoServiceImpl implements TipoMovimientoService{
	@Autowired
	private TipoMovimientoDAO tipomovimientoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<TipoMovimiento> getTipoMovimientos() {
		// TODO Auto-generated method stub
		return (List<TipoMovimiento>) tipomovimientoDao.findAll();
	}

	@Override
	@Transactional
	public TipoMovimiento findById(Long id) {
		// TODO Auto-generated method stub
		return tipomovimientoDao.findById(id).orElseThrow();
	}
	

}
