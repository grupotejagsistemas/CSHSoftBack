package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.MovimientoRecurso;
import com.tejag.cshsoftware.apirest.models.entity.TipoMovimiento;
import com.tejag.cshsoftware.apirest.models.service.MovimientoRecursoService;
import com.tejag.cshsoftware.apirest.models.service.TipoMovimientoService;
import com.tejag.cshsoftware.apirest.models.service.dto.MovimientoRecursoServiceDTO;

@Service
public class MovimientoRecursoDTOServiceImpl implements MovimientoRecursoServiceDTO {

	@Autowired
	private MovimientoRecursoService movimientorecursoService;
	
	@Autowired
	private TipoMovimientoService tipoMovimientoService;

	public MovimientoRecursoDTO findById(Long id) {
		return this.getMovimientoRecursoDTO(movimientorecursoService.findById(id));
	}

	public MovimientoRecursoDTO getMovimientoRecursoDTO(MovimientoRecurso movimientoRecurso) {
		MovimientoRecursoDTO newmovimientorecurso = new MovimientoRecursoDTO();
		if (movimientoRecurso != null) {
			newmovimientorecurso.setId(movimientoRecurso.getId_movimiento_recurso());
			newmovimientorecurso.setFecha(movimientoRecurso.getFecha());
			newmovimientorecurso.setDonante(movimientoRecurso.getDonante());
			newmovimientorecurso.setDescripcion(movimientoRecurso.getDescripcion());
			newmovimientorecurso.setCantidad(movimientoRecurso.getCantidad());
			newmovimientorecurso.setTipoMovimiento(movimientoRecurso.getTipoMovimiento().getDescripcion());

		}
		return newmovimientorecurso;
	}

	public List<MovimientoRecursoDTO> getListaMovimientoRecursoDTO(List<MovimientoRecurso> listamovimientorecurso) {
		List<MovimientoRecursoDTO> listaMovimientorecursosDto = new ArrayList<MovimientoRecursoDTO>();
		for (MovimientoRecurso movimientorecurso : listamovimientorecurso) {
			listaMovimientorecursosDto.add(this.getMovimientoRecursoDTO(movimientorecurso));
		}
		return listaMovimientorecursosDto;
	}

	public void save(MovimientoRecursoPostDTO movimientorecurso) throws ParseException {
		MovimientoRecurso newmovimientorecurso = new MovimientoRecurso();

		String fecha = movimientorecurso.getFecha();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(fecha);
		newmovimientorecurso.setFecha(date);
		newmovimientorecurso.setDonante(movimientorecurso.getDonante());
		newmovimientorecurso.setDescripcion(movimientorecurso.getDescripcion());
		newmovimientorecurso.setCantidad(movimientorecurso.getCantidad());
		TipoMovimiento tipoMov = new TipoMovimiento();
		tipoMov = tipoMovimientoService.findById(movimientorecurso.getIdTipoMovimiento());
		newmovimientorecurso.setTipoMovimiento(tipoMov);

		movimientorecursoService.save(newmovimientorecurso);

	}

	@Override
	public List<MovimientoRecursoDTO> getMovimientoRecursos() {
		return this.getListaMovimientoRecursoDTO(movimientorecursoService.getMovimientoRecursos());
	}

}