package com.tejag.cshsoftware.apirest.models.service.dto;

import java.text.ParseException;
import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioPostDTO;

public interface MovimientoMonetarioDTOService {
	
	public void save(MovimientoMonetarioPostDTO movimientomonetario) throws ParseException;

	public List<MovimientoMonetarioDTO> getMovimientoMonetarios();

	public MovimientoMonetarioDTO findById(Long id);

}
