package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	public void create(VoluntarioMascotaPostDTO historial) throws ParseException {
		VoluntarioMascota newVoluntarioMascota = new VoluntarioMascota();
		
		String fecha = historial.getFecha();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(fecha);
		newVoluntarioMascota.setFecha(date);
		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(historial.getIdMascota());
		newVoluntarioMascota.setMascotas(mascota);

		Voluntario voluntario = new Voluntario();
		voluntario = voluntarioService.findById(historial.getIdVoluntario());
		newVoluntarioMascota.setVoluntarios(voluntario);

		voluntarioMascotaService.create(newVoluntarioMascota);
	}

	@Override
	public void update(VoluntarioMascotaPostDTO historial, Long id) throws ParseException {
		VoluntarioMascota newVoluntarioMascota = new VoluntarioMascota();
		newVoluntarioMascota.setIdVoluntarioMascota(id);
		String fecha = historial.getFecha();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(fecha);
		newVoluntarioMascota.setFecha(date);

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
			voluntarioMascotaDto.setIdMascota(entity.getMascotas().getId().toString());
			voluntarioMascotaDto.setNombreMascota(entity.getMascotas().getNombre());
			voluntarioMascotaDto.setNombreVoluntario(entity.getVoluntarios().getNombreCompleto());
			voluntarioMascotaDto.setIdVoluntario(entity.getVoluntarios().getIdVoluntario().toString());
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
