package com.tejag.cshsoftware.apirest.models.service.dto;

import java.text.ParseException;
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
	 * Persiste la mascota en la base de datos
	 * @param mascota
	 * @throws Exception 
	 */
	public MascotaDTO save(MascotaPostDTO mascota) throws Exception;
	
	/**
	 * Obtener mascota por Id
	 * @param id
	 * @return mascotaDTO
	 */
	public MascotaDTO findById(Long id);
	
	/**
	 * Actualizar datos de mascota
	 * @param mascota
	 * @throws ParseException 
	 */
	public void update(Long id, MascotaPostDTO mascota) throws ParseException;
	
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
	
//	public MascotaDTO insertarImagen(MultipartFile file, String id) throws IOException, Exception;
	
	
}
