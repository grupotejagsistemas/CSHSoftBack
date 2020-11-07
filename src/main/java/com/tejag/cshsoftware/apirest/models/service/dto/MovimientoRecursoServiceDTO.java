package com.tejag.cshsoftware.apirest.models.service.dto;

import java.text.ParseException;
import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoPostDTO;

public interface MovimientoRecursoServiceDTO {
public void save(MovimientoRecursoPostDTO movimientorecurso) throws ParseException;
	
	public List<MovimientoRecursoDTO> getMovimientoRecursos();
	
	public MovimientoRecursoDTO findById(Long id);

}
