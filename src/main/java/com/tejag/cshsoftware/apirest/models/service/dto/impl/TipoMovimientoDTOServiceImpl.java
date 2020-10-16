package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tejag.cshsoftware.apirest.models.dto.TipoMovimientoDTO;
import com.tejag.cshsoftware.apirest.models.entity.TipoMovimiento;
import com.tejag.cshsoftware.apirest.models.service.TipoMovimientoService;
import com.tejag.cshsoftware.apirest.models.service.dto.TipoMovimientoDTOService;

public class TipoMovimientoDTOServiceImpl implements TipoMovimientoDTOService{
	@Autowired
	private TipoMovimientoService TipoMovimientoService;

	@Override
	public List<TipoMovimientoDTO> getTipoMovimientos() {
		
		return this.getListaTipoMovimientoDTO(TipoMovimientoService.getTipoMovimientos());
	}

	public TipoMovimientoDTO getTipoMovimientoDTO(TipoMovimiento entity) {
		TipoMovimientoDTO tipomovimiento = new TipoMovimientoDTO();
		if (entity != null) {
			tipomovimiento.setId(entity.getId_tipo_movimiento());
			tipomovimiento.setDescripcion(entity.getDescripcion());
		}

		return tipomovimiento;
	}

	public List<TipoMovimientoDTO> getListaTipoMovimientoDTO(List<TipoMovimiento> listaTipoMovimientos) {
		List<TipoMovimientoDTO> listaTipoMovimientosDTO = new ArrayList<TipoMovimientoDTO>();

		if (listaTipoMovimientos != null) {
			for (TipoMovimiento tipomovimiento : listaTipoMovimientos) {
				listaTipoMovimientosDTO.add(this.getTipoMovimientoDTO(tipomovimiento));
			}
		}

		return listaTipoMovimientosDTO;
	}

}


