package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.MascotaEstadoDTO;
import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;
import com.tejag.cshsoftware.apirest.models.service.EstadoMascotaService;
import com.tejag.cshsoftware.apirest.models.service.dto.EstadoMascotaDTOService;

@Service
public class EstadoMascotaDTOServiceImpl implements EstadoMascotaDTOService {

	@Autowired
	private EstadoMascotaService estadoMascotaService;

	@Override
	public List<MascotaEstadoDTO> getEstadosMascotas() {
		// TODO Auto-generated method stub
		return this.getListaEstadosMascotasDTO(estadoMascotaService.getMascotas());
	}

	public MascotaEstadoDTO getEstadoMascotaDTO(MascotaEstado entity) {
		MascotaEstadoDTO mascota = new MascotaEstadoDTO();
		if (entity != null) {
			mascota.setId(entity.getId());
			mascota.setDescripcion(entity.getDescripcion());
		}

		return mascota;
	}

	public List<MascotaEstadoDTO> getListaEstadosMascotasDTO(List<MascotaEstado> listaMascotas) {
		List<MascotaEstadoDTO> listaMascotasDTO = new ArrayList<MascotaEstadoDTO>();

		if (listaMascotas != null) {
			for (MascotaEstado estado : listaMascotas) {
				listaMascotasDTO.add(this.getEstadoMascotaDTO(estado));
			}
		}

		return listaMascotasDTO;
	}

}
