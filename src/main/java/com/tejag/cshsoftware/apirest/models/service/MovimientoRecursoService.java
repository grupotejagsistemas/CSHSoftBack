package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.MovimientoRecurso;

public interface MovimientoRecursoService {
	public MovimientoRecurso save(MovimientoRecurso movimientorecurso);

	public List<MovimientoRecurso> getMovimientoRecursos();

	public MovimientoRecurso findById(long id);

}
