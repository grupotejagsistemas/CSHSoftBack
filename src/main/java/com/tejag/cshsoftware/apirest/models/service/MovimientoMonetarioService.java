package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.MovimientoMonetario;

public interface MovimientoMonetarioService {
	public MovimientoMonetario save(MovimientoMonetario movimientomonetario);

	public List<MovimientoMonetario> getMovimientoMonetarios();

	public MovimientoMonetario findById(long id);

}
