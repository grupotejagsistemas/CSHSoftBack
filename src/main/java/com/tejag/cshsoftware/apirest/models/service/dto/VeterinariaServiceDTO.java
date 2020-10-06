package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;


public interface VeterinariaServiceDTO {

	public VeterinariaDTO findById(int id);
	/**
	 * Obtener listado de veterinarias
	 * @return
	 */
	public List<VeterinariaDTO> getVeterinarias();
	
	/**
	 * Persiste la veterinaria en la base de datos
	 * @param veterinaria
	 */
	public void save(VeterinariaPostDTO veterinaria);
	
	/**
	 * Obtener veterinaria por Id
	 * @param id
	 * @return veterinariaDTO
	 */
	public VeterinariaDTO findById(Long id);
	
	/**
	 * Actualizar datos de veterinaria
	 * @param veterinaria
	 */
	public void update(Long id, VeterinariaPostDTO veterinaria);
	
	/**
	 * Eliminación por Id
	 * @param id
	 */
	public void deleteById(Long id);
	
	/** Filtrar veterinaria por nombre
	 * @param nombre
	 * @return veterinarias
	 */
	public List<VeterinariaDTO> findByRazonSocial(String razonsocial);
	VeterinariaDTO getListaVeterinariaDTO(Veterinaria veterinaria2);
	List<VeterinariaDTO> getListaVeterinariaDTO(List<Veterinaria> listaVeterinarias);
	public List<VeterinariaDTO> findByInternacion(String internacion);
	
	
	
}
