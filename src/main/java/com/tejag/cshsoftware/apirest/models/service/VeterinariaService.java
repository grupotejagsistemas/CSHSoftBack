package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;


import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;

public interface VeterinariaService {
	
	
	/**
	 * Obtener listado de veterinaria
	 * @return
	 */
	public List<Veterinaria> getVeterinarias();
	
	/**
	 * Persiste la veterinaria en la base de datos
	 * @param cliente
	 */
	public Veterinaria save(Veterinaria veterinaria);
	
	/**
	 * Obtener veterinaria por Id
	 * @param id
	 * @return veterinaria
	 */
	public Veterinaria findById(Long id);
	
	/**
	 * Actualiza datos de veterinaria
	 * @param veterinaria
	 * @return veterinaria
	 */
	public Veterinaria update(Veterinaria veterinaria);
	
	/**
	 * Eliminación por Id
	 * @param id
	 */
	public void deleteById(Long id);
	
	/** Filtrar veterinaria por nombre
	 * @param nombre
	 * @return veterinarias
	 */
	public List<Veterinaria> findByRazonSocial(String razonsocial);
	
	
	/** Filtrar veterinarias por razonsocial
	 * @param razonsocial
	 * @return veterinarias
	 */
	
	public List<Veterinaria> findByInternacion(String internacion);

}
