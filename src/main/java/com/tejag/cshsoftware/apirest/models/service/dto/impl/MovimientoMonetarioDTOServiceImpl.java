package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioPostDTO;

import com.tejag.cshsoftware.apirest.models.entity.MovimientoMonetario;

import com.tejag.cshsoftware.apirest.models.service.MovimientoMonetarioService;
import com.tejag.cshsoftware.apirest.models.service.dto.MovimientoMonetarioDTOService;


public class MovimientoMonetarioDTOServiceImpl implements MovimientoMonetarioDTOService {
	@Autowired
	private MovimientoMonetarioService movimientoService;

	@Override
	public MovimientoMonetarioDTO findById(Long id) {
		return this.getMovimientoDTO(movimientoService.findById(id));
	}
	
	public MovimientoMonetarioDTO getMovimientoDTO(MovimientoMonetario entity) {
		MovimientoMonetarioDTO newmovimiento = new MovimientoMonetarioDTO();
		if (entity != null) {
			newmovimiento.setId(entity.getId_movimiento_monetario());
			newmovimiento.setMonto(entity.getMonto());
			newmovimiento.setMedio(entity.getMedio());
			newmovimiento.setFecha(entity.getFecha());
			newmovimiento.setAutor(entity.getAutor());
		}
		return newmovimiento;

}
	public List<MovimientoMonetarioDTO> getListaMovimientoMonetarioDTO(List<MovimientoMonetario> listaMovimientoMonetario) {
		List<MovimientoMonetarioDTO> listaMovimientoMonetariosDto = new ArrayList<MovimientoMonetarioDTO>();
		for (MovimientoMonetario movimientomonetario : listaMovimientoMonetario) {
			listaMovimientoMonetariosDto.add(this.getMovimientoDTO(movimientomonetario));
		}
		return listaMovimientoMonetariosDto;
	}
	public void save(MovimientoMonetarioPostDTO  movimientomonetario) {
		MovimientoMonetario newmovimiento = new MovimientoMonetario();

		newmovimiento.setMonto(movimientomonetario.getMonto());
		newmovimiento.setMedio(movimientomonetario.getMedio());
		newmovimiento.setFecha(movimientomonetario.getFecha());
		newmovimiento.setAutor(movimientomonetario.getAutor());
	

		movimientoService.save(newmovimiento);
	}

	@Override
	public List<MovimientoMonetarioDTO> getMovimientoMonetarios() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
