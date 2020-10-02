package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPutDTO;
import com.tejag.cshsoftware.apirest.models.entity.FichaMedica;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.service.FichaMedicaService;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaService;
import com.tejag.cshsoftware.apirest.models.service.dto.FichaMedicaServiceDTO;

@Service
public class FichaMedicaServiceDTOImpl implements FichaMedicaServiceDTO {

	@Autowired
	private FichaMedicaService fichaMedicaService;

	@Autowired
	private MascotaService mascotaService;

	@Autowired
	private VeterinariaService veterinariaService;

	@Override
	public void save(FichaMedicaPostDTO fichaMedica) {
		FichaMedica newFicha = new FichaMedica();

		newFicha.setFecha(fichaMedica.getFecha());
		newFicha.setDesparasitacion(fichaMedica.getDesparasitacion());
		newFicha.setProductoDesparasitacion(fichaMedica.getNombreProducto());
		newFicha.setVacuna(fichaMedica.getVacuna());
		newFicha.setNombreVacuna(fichaMedica.getNombreVacuna());
		newFicha.setDiagnostico(fichaMedica.getDiagnostico());
		newFicha.setTratamiento(fichaMedica.getTratamiento());
		newFicha.setDescripcionTratamiento(fichaMedica.getDescripcionTratamiento());
		newFicha.setMascotas(this.findMascotaById((long) fichaMedica.getIdMascota()));
		newFicha.setVeterinarias(this.findVeterinariaById((long) fichaMedica.getIdVeterinaria()));

		fichaMedicaService.save(newFicha);

	}

	/**
	 * Obtener mascotar por Id
	 * 
	 * @param id
	 * @return
	 */
	public Mascota findMascotaById(long id) {
		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(id);
		return mascota;
	}

	/**
	 * Obtener veterinaria por Id
	 * 
	 * @param id
	 * @return
	 */
	public Veterinaria findVeterinariaById(long id) {
		Veterinaria veterinaria = new Veterinaria();
		veterinaria = veterinariaService.findById(id);
		return veterinaria;
	}

	@Override
	public List<FichaMedicaDTO> getFichasMedicas() {
		return this.getFichaMedicaListaDTO(fichaMedicaService.getFichasMedicas());
	}

	@Override
	public FichaMedicaDTO findById(int id) {
		return this.getFichaMedicaDTO(fichaMedicaService.findById((long) id));
	}

	@Override
	public void deleteById(int id) {
		fichaMedicaService.deleteById((long) id);
	}

	@Override
	public void update(int id, FichaMedicaPutDTO fichaMedicaPut) {
		FichaMedica newFicha = new FichaMedica();
		newFicha = fichaMedicaService.findById((long) id);
		if (newFicha != null) {
			newFicha.setId((long) id);
			newFicha.setFecha(fichaMedicaPut.getFecha());
			newFicha.setDesparasitacion(fichaMedicaPut.getDesparasitacion());
			newFicha.setProductoDesparasitacion(fichaMedicaPut.getNombreProducto());
			newFicha.setVacuna(fichaMedicaPut.getVacuna());
			newFicha.setNombreVacuna(fichaMedicaPut.getNombreVacuna());
			newFicha.setDiagnostico(fichaMedicaPut.getDiagnostico());
			newFicha.setTratamiento(fichaMedicaPut.getTratamiento());
			newFicha.setDescripcionTratamiento(fichaMedicaPut.getDescripcionTratamiento());
			newFicha.setMascotas(this.findMascotaById((long) fichaMedicaPut.getIdMascota()));
			newFicha.setVeterinarias(this.findVeterinariaById((long) fichaMedicaPut.getIdVeterinaria()));
		}
		fichaMedicaService.update(newFicha);
	}

	/***********************************************
	 * ************** Transformaciones ENTITY a DTO
	 * *********************************************
	 */

	/**
	 * Tranformación DTO a Entity
	 * 
	 * @param entity
	 * @return
	 */
	public FichaMedicaDTO getFichaMedicaDTO(FichaMedica entity) {
		FichaMedicaDTO ficha = new FichaMedicaDTO();
		if (entity != null) {
			ficha.setId(entity.getId());
			ficha.setFecha(entity.getFecha());
			ficha.setDesparasitacion(entity.getDesparasitacion());
			ficha.setNombreProducto(entity.getProductoDesparasitacion());
			ficha.setVacuna(entity.getVacuna());
			ficha.setNombreVacuna(entity.getNombreVacuna());
			ficha.setDiagnostico(entity.getDiagnostico());
			ficha.setMascota(entity.getMascotas().getNombre());
			ficha.setVeterinaria(entity.getVeterinarias().getRazonSocial());
			ficha.setTratamiento(entity.getTratamiento());
			ficha.setDescripcionTratamiento(entity.getDescripcionTratamiento());

		}

		return ficha;
	}

	/**
	 * Transformación Lista Entity a Lista DTO
	 * 
	 * @param listaFichas - List<FichaMedica>
	 * @return listaFichasDto - List<FichaMedicaDTO>
	 */
	public List<FichaMedicaDTO> getFichaMedicaListaDTO(List<FichaMedica> listaFichas) {
		List<FichaMedicaDTO> listaFichasDto = new ArrayList<FichaMedicaDTO>();
		if (listaFichas != null) {
			for (FichaMedica fichaMedica : listaFichas) {
				listaFichasDto.add(this.getFichaMedicaDTO(fichaMedica));
			}
		}

		return listaFichasDto;
	}

}
