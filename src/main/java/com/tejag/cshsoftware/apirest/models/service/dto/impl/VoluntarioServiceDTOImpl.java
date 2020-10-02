package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.VoluntarioDTO;
//import com.tejag.cshsoftware.apirest.models.dto.MascotaEstadoDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Voluntario;
//import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioService;
import com.tejag.cshsoftware.apirest.models.service.dto.VoluntarioServiceDTO;

@Service
public class VoluntarioServiceDTOImpl implements VoluntarioServiceDTO {

	@Autowired
	private VoluntarioService service;

	@Override
	public List<VoluntarioDTO> getVoluntario() {
		return this.getListaVoluntarioDTO(service.getVoluntarios());
	}

	public VoluntarioDTO getVoluntarioDto(Voluntario entity) {
		VoluntarioDTO voluntarioDto = new VoluntarioDTO();
		if (entity != null) {
			voluntarioDto.setId(entity.getIdVoluntario());
			voluntarioDto.setNombre(entity.getNombreCompleto());
			voluntarioDto.setTelefono(entity.getTelefono());
			voluntarioDto.setDireccion(entity.getDireccion());
			voluntarioDto.setLocalidad(entity.getLocalidad());
			voluntarioDto.setTransito(entity.getTransito());
			voluntarioDto.setTranslado(entity.getTraslado());
			voluntarioDto.setPresencial(entity.getPresencial());
			
		}
		return 			voluntarioDto;
	}

	public List<VoluntarioDTO> getListaVoluntarioDTO(List<Voluntario> listaVoluntario) {
		List<VoluntarioDTO> listaVoluntarioDto = new ArrayList<VoluntarioDTO>();
		for (Voluntario voluntario : listaVoluntario) {
			listaVoluntarioDto.add(this.getVoluntarioDto(voluntario));
		}
		return listaVoluntarioDto;
	}

	@Override
	public VoluntarioDTO findById(Long idvoluntario) {
		return this.getVoluntarioDto(service.findById(idvoluntario));
	}

	@Override
	public void save(VoluntarioPostDTO voluntario) {
		Voluntario newVoluntario = new Voluntario();

		newVoluntario.setNombreCompleto(voluntario.getNombreCompleto());
		newVoluntario.setTelefono(voluntario.getTelefono());
		newVoluntario.setDireccion(voluntario.getDireccion());
		newVoluntario.setLocalidad(voluntario.getLocalidad());
//		newVoluntario.setVeterinarias_cercanas([]);
		newVoluntario.setTransito(voluntario.getTransito());
		newVoluntario.setTraslado(voluntario.getTraslado());
		newVoluntario.setPresencial(voluntario.getPresencial());
		

		service.save(newVoluntario);

	}

	@Override
	public void update(Long idVoluntario, VoluntarioPostDTO voluntario) {
		Voluntario newVoluntario = new Voluntario();
		
		newVoluntario.setNombreCompleto(voluntario.getNombreCompleto());
		newVoluntario.setTelefono(voluntario.getTelefono());
		newVoluntario.setDireccion(voluntario.getDireccion());
		newVoluntario.setLocalidad(voluntario.getLocalidad());
		newVoluntario.setTransito(voluntario.getTransito());
		newVoluntario.setTraslado(voluntario.getTraslado());
		newVoluntario.setPresencial(voluntario.getPresencial());
		

		service.update(newVoluntario);

	}

	@Override
	public void deleteById(Long idVoluntario) {
		service.deleteById(idVoluntario);
	}

	@Override
	public List<VoluntarioDTO> findByNombre(String nombre) {
		return this.getListaVoluntarioDTO(service.findByNombre(nombre));
	}

	@Override
	public List<VoluntarioDTO> findByVoluntarioppt (String filtrovoluntarioptt) {
		return this.getListaVoluntarioDTO(service.findByVoluntarioppt(filtrovoluntarioptt));
	}

	

}
