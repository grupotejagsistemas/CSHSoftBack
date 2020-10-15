package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoPostDTO;

public interface MovimientoRecursoServiceDTO {
public void save(MovimientoRecursoPostDTO movimientorecurso);
	
	public List<MovimientoRecursoDTO> getMovimientoRecursos();
	
	public MovimientoRecursoDTO findById(Long id);

}
