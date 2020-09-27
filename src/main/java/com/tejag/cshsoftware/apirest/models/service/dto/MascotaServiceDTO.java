package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaPostDTO;

public interface MascotaServiceDTO {

	/**
	 * Obtener listado de mascotas
	 * @return
	 */
	public List<MascotaDTO> getMascotas();
	
	/**
	 * Persiste el cliente en la base de datos
	 * @param cliente
	 * @return mascotaDto
	 */
	public void save(MascotaPostDTO mascota);
	
	/**
	 * Obtener mascota por Id
	 * @param id
	 * @return mascotaDTO
	 */
	public MascotaDTO findById(Long id);
	
	/**
	 * Actualizar datos de mascota
	 * @param mascota
	 */
	public void update(Long id, MascotaPostDTO mascota);
	
	/**
	 * Eliminación por Id
	 * @param id
	 */
	public void deleteById(Long id);
	
	/** Filtrar mascotas por nombre
	 * @param nombre
	 * @return mascotas
	 */
	public List<MascotaDTO> findByNombre(String nombre);
	
	/** Filtrar mascotas por sexo
	 * @param nombre
	 * @return mascotas
	 */
	public List<MascotaDTO> findBySexo(String sexo);
	
}
