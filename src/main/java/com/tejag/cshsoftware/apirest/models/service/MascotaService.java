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
	 * Persiste el cliente en la base de datos
	 * @param cliente
	 * @return cliente
	 */
	public Mascota save(Mascota mascota);
	
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
	
}
