package com.tejag.cshsoftware.apirest.controllers.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.tejag.cshsoftware.apirest.controllers.MovimientoRecursoRestController;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MovimientoRecursoPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.MovimientoRecursoServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class MovimientoRecursoRestControllerImpl implements MovimientoRecursoRestController {

	@Autowired
	private MovimientoRecursoServiceDTO movimientorecursoServiceDto;

	@Override
	public List<MovimientoRecursoDTO> getMovimientoRecursos() {
		return movimientorecursoServiceDto.getMovimientoRecursos();
	}

	@Override
	public MovimientoRecursoDTO show(Long id) {
		return movimientorecursoServiceDto.findById(id);
	}

	@Override
	public void create(MovimientoRecursoPostDTO movimientorecursoPost) {
		movimientorecursoServiceDto.save(movimientorecursoPost);
	}

}
