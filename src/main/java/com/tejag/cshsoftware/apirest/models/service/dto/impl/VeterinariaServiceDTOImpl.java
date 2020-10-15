package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaService;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaServiceDTO;

@Service
public class VeterinariaServiceDTOImpl implements VeterinariaServiceDTO {

	@Autowired
	private VeterinariaService veterinariaService;

	@Override
	public VeterinariaDTO findById(Long id) {
		return this.getVeterinariaDTO(veterinariaService.findById(id));
	}

	public VeterinariaDTO getVeterinariaDTO(Veterinaria entity) {
		VeterinariaDTO newveterinaria = new VeterinariaDTO();
		if (entity != null) {
			newveterinaria.setId(entity.getIdVeterinaria());
			newveterinaria.setRazonSocial(entity.getRazonSocial());
			newveterinaria.setHorarioAtencion(entity.getHorarioAtencion());
			newveterinaria.setDireccion(entity.getDireccion());
			newveterinaria.setInternacion(entity.getInternacion());
			newveterinaria.setObservacion(entity.getObservaciones());
		}

		return newveterinaria;
	}

	public List<VeterinariaDTO> getListaVeterinariaDTO(List<Veterinaria> listaVeterinarias) {
		List<VeterinariaDTO> listaVeterinariasDto = new ArrayList<VeterinariaDTO>();
		for (Veterinaria veterinaria : listaVeterinarias) {
			listaVeterinariasDto.add(this.getVeterinariaDTO(veterinaria));
		}
		return listaVeterinariasDto;
	}

	@Override
	public void save(VeterinariaPostDTO veterinaria) {
		Veterinaria newveterinaria = new Veterinaria();

		newveterinaria.setRazonSocial(veterinaria.getRazonSocial());
		newveterinaria.setHorarioAtencion(veterinaria.getHorarioAtencion());
		newveterinaria.setDireccion(veterinaria.getDireccion());
		newveterinaria.setInternacion(veterinaria.getInternacion());
		newveterinaria.setObservaciones(veterinaria.getObservacion());

		veterinariaService.save(newveterinaria);

	}

	@Override
	public void update(Long id, VeterinariaPostDTO veterinaria) {
		Veterinaria newVeterinaria = new Veterinaria();

		newVeterinaria.setIdVeterinaria(id);
		newVeterinaria.setRazonSocial(veterinaria.getRazonSocial());
		newVeterinaria.setHorarioAtencion(veterinaria.getHorarioAtencion());
		newVeterinaria.setDireccion(veterinaria.getDireccion());
		newVeterinaria.setInternacion(veterinaria.getInternacion());
		newVeterinaria.setObservaciones(veterinaria.getObservacion());

		veterinariaService.update(newVeterinaria);

	}

	@Override
	public void deleteById(Long id) {
		veterinariaService.deleteById(id);

	}

	@Override
	public List<VeterinariaDTO> findByInternacion(String internacion) {
		return this.getListaVeterinariaDTO(veterinariaService.findByInternacion(internacion));
	}

	@Override
	public List<VeterinariaDTO> getVeterinarias() {
		return this.getListaVeterinariaDTO(veterinariaService.getVeterinarias());
	}

	@Override
	public List<VeterinariaDTO> findByRazonSocial(String razonsocial) {
		return this.getListaVeterinariaDTO(veterinariaService.findByRazonSocial(razonsocial));
	}

}
