package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.tejag.cshsoftware.apirest.models.dao.EstadoMascotaDAO;
import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;
import com.tejag.cshsoftware.apirest.models.service.EstadoMascotaService;

@Service
public class EstadoMascotaServiceImpl implements EstadoMascotaService {
	
	@Autowired
	private EstadoMascotaDAO estadoMascotaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<MascotaEstado> getMascotas() {
		// TODO Auto-generated method stub
		return (List<MascotaEstado>) estadoMascotaDao.findAll();
	}

}
