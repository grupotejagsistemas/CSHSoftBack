package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.TipoMovimiento;

public interface TipoMovimientoService {

	public List<TipoMovimiento> getTipoMovimientos();

	public TipoMovimiento findById(Long id);

}
