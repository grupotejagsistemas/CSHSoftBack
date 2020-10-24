package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptantePostDTO;


public interface EntrevistaAdoptanteDTOService {

	
	public void save(EntrevistaAdoptantePostDTO entrevistaadoptante);
	
	public List<EntrevistaAdoptanteDTO> getEntrevistaAdoptantes();
	
	public EntrevistaAdoptanteDTO findById(long id);
	
	public void deleteById(long id);
	
	public void update(long id, EntrevistaAdoptantePostDTO entrevistaadoptantepost);

	public List<EntrevistaAdoptanteDTO> findByNombre(String nombrecompleto);
	
	public List<EntrevistaAdoptanteDTO> getEntrevistasId_NombreAdoptante();
	
}
