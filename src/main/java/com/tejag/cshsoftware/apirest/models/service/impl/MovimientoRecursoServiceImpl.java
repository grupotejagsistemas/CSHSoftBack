package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.tejag.cshsoftware.apirest.models.entity.MovimientoRecurso;
import com.tejag.cshsoftware.apirest.models.service.MovimientoRecursoService;
import com.tejag.cshsoftware.apirest.models.dao.MovimientoRecursoDAO;
public class MovimientoRecursoServiceImpl  implements MovimientoRecursoService
{
	@Autowired
	private MovimientoRecursoDAO movimientorecursoDao;

	@Override
	public MovimientoRecurso save(MovimientoRecurso movimientorecurso) {
		return movimientorecursoDao.save(movimientorecurso);
	}

	@Override
	public List<MovimientoRecurso> getMovimientoRecursos() {
		return (List<MovimientoRecurso>) movimientorecursoDao.findAll();
	}

	@Override
	public MovimientoRecurso findById(long id) {
		return movimientorecursoDao.findById(id).orElse(null);
	}

}
