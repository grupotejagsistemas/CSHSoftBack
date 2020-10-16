package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoMonetarioPostDTO;

public interface MovimientoMonetarioDTOService {
	
	public void save(MovimientoMonetarioPostDTO movimientomonetario);

	public List<MovimientoMonetarioDTO> getMovimientoMonetarios();

	public MovimientoMonetarioDTO findById(Long id);

}
