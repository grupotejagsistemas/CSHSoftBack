package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaEstadoDTO;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;
import com.tejag.cshsoftware.apirest.models.service.dto.MascotaServiceDTO;

@Service
public class MascotaServiceDTOImpl implements MascotaServiceDTO {

	@Autowired
	private MascotaService service;

	@Override
	public List<MascotaDTO> getMascotas() {
		return this.getListaMascotaDTO(service.getMascotas());
	}

	public MascotaDTO getMascotaDto(Mascota entity) {
		MascotaDTO mascotaDto = new MascotaDTO();
		if (entity != null) {
			mascotaDto.setId(entity.getId());
			mascotaDto.setNombre(entity.getNombre());
			mascotaDto.setFechaNacimieto(entity.getFechaNacimieto());
			mascotaDto.setParticularidadesFisica(entity.getParticularidadesFisica());
			mascotaDto.setSexo(entity.getSexo());
			mascotaDto.setFotoMascota(entity.getFotoMascota());
			mascotaDto.setFechaRescate(entity.getFechaRescate());
			mascotaDto.setLugarRescate(entity.getLugarRescate());
			mascotaDto.setDescripcionRescate(entity.getDescripcionRescate());
			mascotaDto.setEspecie(entity.getEspecie());
			mascotaDto.setEstado(this.getEstadoMascotaDTO(entity.getEstado_mascota()));
		}
		return mascotaDto;
	}

	public List<MascotaDTO> getListaMascotaDTO(List<Mascota> listaMascotas) {
		List<MascotaDTO> listaMascotasDto = new ArrayList<MascotaDTO>();
		for (Mascota mascota : listaMascotas) {
			listaMascotasDto.add(this.getMascotaDto(mascota));
		}
		return listaMascotasDto;
	}

	public MascotaEstadoDTO getEstadoMascotaDTO(MascotaEstado entity) {
		MascotaEstadoDTO estadoDto = new MascotaEstadoDTO();
		if (entity != null) {
			estadoDto.setId(entity.getId());
			estadoDto.setDescrpcion(entity.getDescripcion());
		}
		return estadoDto;
	}

}
