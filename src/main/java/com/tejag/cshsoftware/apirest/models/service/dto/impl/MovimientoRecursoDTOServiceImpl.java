package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.MovimientoRecurso;
import com.tejag.cshsoftware.apirest.models.service.MovimientoRecursoService;
import com.tejag.cshsoftware.apirest.models.service.dto.MovimientoRecursoServiceDTO;

public class MovimientoRecursoDTOServiceImpl  implements MovimientoRecursoServiceDTO{

	@Autowired
	private MovimientoRecursoService movimientorecursoService;
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
		}
		return newmovimientorecurso;
	}
		
		public List<MovimientoRecursoDTO> getListaMovimientoRecursoDTO(List<MovimientoRecurso> listamovimientorecurso) {
			List<MovimientoRecursoDTO> listaMovimientorecursosDto = new ArrayList<MovimientoRecursoDTO>();
			for (MovimientoRecurso movimientorecurso : listamovimientorecurso) {
				listaMovimientorecursosDto.add(this.getMovimientoRecursoDTO(movimientorecurso));
			}
			return listaMovimientorecursosDto;}
		
		public void save(MovimientoRecursoPostDTO  movimientorecurso) {
			MovimientoRecurso newmovimientorecurso = new MovimientoRecurso();

			newmovimientorecurso.setFecha(movimientorecurso.getFecha());
			newmovimientorecurso.setDonante(movimientorecurso.getDonante());
			newmovimientorecurso.setDescripcion(movimientorecurso.getDescripcion());
			newmovimientorecurso.setCantidad(movimientorecurso.getCantidad());
		

			movimientorecursoService.save(newmovimientorecurso);
	

	

}
		@Override
		public List<MovimientoRecursoDTO> getMovimientoRecursos() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}