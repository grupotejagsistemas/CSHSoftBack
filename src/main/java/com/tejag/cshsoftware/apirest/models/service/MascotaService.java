package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.Mascota;

public interface MascotaService {

	/**
	 * Obtener listado de mascotas
	 * @return
	 */
	public List<Mascota> getMascotas();
	
	/**
	 * Persiste la mascota en la base de datos
	 * @param cliente
	 * @throws Exception 
	 */
	public Mascota save(Mascota mascota) throws Exception;
	
	/**
	 * Obtener mascota por Id
	 * @param id
	 * @return mascota
	 */
	public Mascota findById(Long id);
	
	/**
	 * Actualiza datos de mascota
	 * @param mascota
	 * @return mascota
	 */
	public Mascota update(Mascota mascota);
	
	/**
	 * Eliminación por Id
	 * @param id
	 */
	public void deleteById(Long id);
	
	/** Filtrar mascotas por nombre
	 * @param nombre
	 * @return mascotas
	 */
	public List<Mascota> findByNombre(String nombre);
	
	/** Filtrar mascotas por nombre
	 * @param nombre
	 * @return mascotas
	 */
	public List<Mascota> findBySexo(String sexo);
	
	public Mascota updatePath(Long id, String nuevaRuta);
}
