package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioMascotaPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.entity.Voluntario;
import com.tejag.cshsoftware.apirest.models.entity.VoluntarioMascota;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioMascotaService;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioService;
import com.tejag.cshsoftware.apirest.models.service.dto.VoluntarioMascotaDTOService;

@Service
public class VoluntarioMascotaDTOServiceImpl implements VoluntarioMascotaDTOService {

	@Autowired
	private VoluntarioMascotaService voluntarioMascotaService;

	@Autowired
	private MascotaService mascotaService;

	@Autowired
	private VoluntarioService voluntarioService;

	@Override
	public void create(VoluntarioMascotaPostDTO historial) {
		VoluntarioMascota newVoluntarioMascota = new VoluntarioMascota();
		newVoluntarioMascota.setFecha(historial.getFecha());

		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(historial.getIdMascota());
		newVoluntarioMascota.setMascotas(mascota);

		Voluntario voluntario = new Voluntario();
		voluntario = voluntarioService.findById(historial.getIdVoluntario());
		newVoluntarioMascota.setVoluntarios(voluntario);

		voluntarioMascotaService.create(newVoluntarioMascota);
	}

	@Override
	public void update(VoluntarioMascotaPostDTO historial, Long id) {
		VoluntarioMascota newVoluntarioMascota = new VoluntarioMascota();
		newVoluntarioMascota.setIdVoluntarioMascota(id);
		newVoluntarioMascota.setFecha(historial.getFecha());

		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(historial.getIdMascota());
		newVoluntarioMascota.setMascotas(mascota);

		Voluntario voluntario = new Voluntario();
		voluntario = voluntarioService.findById(historial.getIdVoluntario());
		newVoluntarioMascota.setVoluntarios(voluntario);

		voluntarioMascotaService.update(newVoluntarioMascota);

	}

	@Override
	public VoluntarioMascotaDTO getById(Long id) {
		return this.getVoluntarioMascotaDTO(voluntarioMascotaService.getById(id));
	}

	@Override
	public List<VoluntarioMascotaDTO> getAll() {
		return this.getListaVoluntarioMascotaDTO(voluntarioMascotaService.getAll());
	}

	@Override
	public void deleteById(Long id) {
		voluntarioMascotaService.deleteById(id);
	}
	
	@Override
	public List<VoluntarioMascotaDTO> getByNombre(String nombre) {
		return this.getListaVoluntarioMascotaDTO(voluntarioMascotaService.getByNombre(nombre));
	}
	
	// ********************************************************************************************
	// *************** Transformación Entity a DTO
	// ************************************************
	// ********************************************************************************************
	public VoluntarioMascotaDTO getVoluntarioMascotaDTO(VoluntarioMascota entity) {
		VoluntarioMascotaDTO voluntarioMascotaDto = new VoluntarioMascotaDTO();
		if (entity != null) {
			voluntarioMascotaDto.setId(entity.getIdVoluntarioMascota());
			voluntarioMascotaDto.setFecha(entity.getFecha());
			voluntarioMascotaDto.setNombreMascota(entity.getMascotas().getNombre());
			voluntarioMascotaDto.setNombreVoluntario(entity.getVoluntarios().getNombreCompleto());
			voluntarioMascotaDto.setDomicilioVoluntario(entity.getVoluntarios().getDireccion());
		}
		return voluntarioMascotaDto;
	}

	public List<VoluntarioMascotaDTO> getListaVoluntarioMascotaDTO(List<VoluntarioMascota> listaHistorial) {
		List<VoluntarioMascotaDTO> listaHistorialDto = new ArrayList<VoluntarioMascotaDTO>();
		if (listaHistorial != null) {
			for (VoluntarioMascota historial : listaHistorial) {
				listaHistorialDto.add(this.getVoluntarioMascotaDTO(historial));
			}
		}

		return listaHistorialDto;
	}

}
