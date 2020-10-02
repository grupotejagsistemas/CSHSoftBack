package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.VoluntarioDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioPostDTO;

public interface VoluntarioServiceDTO {

	/**
	 * Obtener listado de Voluntarios
	 * @return
	 */
	public List<VoluntarioDTO> getVoluntario();
	
	/**
	 * Persiste el cliente en la base de datos
	 * @param cliente
	 * @return VoluntarioDto
	 */
	public void save(VoluntarioPostDTO voluntario);
	
	/**
	 * Obtener Voluntario por Id
	 * @param id
	 * @return voluntarioDTO
	 */
	public VoluntarioDTO findById(Long id);
	
	/**
	 * Actualizar datos de voluntarios
	 * @param voluntarios
	 */
	public void update(Long id, VoluntarioPostDTO voluntario);
	
	/**
	 * Eliminación por Id
	 * @param id
	 */
	public void deleteById(Long id);
	
	/** Filtrar voluntarios por nombre
	 * @param nombrecompleto
	 * @return voluntarios
	 */
	public List<VoluntarioDTO> findByNombre(String nombre);
	
	/** Filtrar Voluntario por 
	 * @param traslado
	 * @param presencial
	 * @param transito
	 * @return voluntario
	 */
	public List<VoluntarioDTO> findByVoluntarioppt(String filtrovoluntarioptt);
	
}

