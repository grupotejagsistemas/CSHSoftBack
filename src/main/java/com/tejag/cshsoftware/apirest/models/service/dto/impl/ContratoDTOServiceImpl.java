package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.ContratoDTO;
import com.tejag.cshsoftware.apirest.models.dto.ContratoPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Adoptante;
import com.tejag.cshsoftware.apirest.models.entity.Contrato;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.service.AdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.ContratoService;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;
import com.tejag.cshsoftware.apirest.models.service.dto.ContratoDTOService;

@Service
public class ContratoDTOServiceImpl implements ContratoDTOService {

	@Autowired
	private ContratoService contratoService;

	@Autowired
	private MascotaService mascotaService;

	@Autowired
	private AdoptanteService adoptanteService;

	@Override
	public void create(ContratoPostDTO contrato) {
		Contrato newContrato = new Contrato();

		Adoptante adoptante = new Adoptante();
		adoptante = adoptanteService.getById(contrato.getIdAdoptante());
		newContrato.setAdoptantes(adoptante);
		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(contrato.getIdMascota());
		newContrato.setMascotas(mascota);
		newContrato.setNuevo_nombre(contrato.getNuevoNombre());

		contratoService.create(newContrato);
	}

	@Override
	public List<ContratoDTO> getContratos() {
		return this.getListaContratoDTO(contratoService.getContratos());
	}
	
	@Override
	public List<ContratoDTO> getByNombreMascota(String nombre) {
		return this.getListaContratoDTO(contratoService.findByNombreMascota(nombre));
	}
	

	// *********************************************************************************
	// ******************** Transformación Entity a DTO ********************************
	// *********************************************************************************

	public ContratoDTO getContratoDTO(Contrato contrato) {
		ContratoDTO contratoDto = new ContratoDTO();

		if (contrato != null) {
			contratoDto.setIdContrato(contrato.getId_contrato());
			contratoDto.setMascota(contrato.getMascotas().getNombre());
			contratoDto.setAdoptante(contrato.getAdoptantes().getNombre_completo());
			contratoDto.setNuevoNombre(contrato.getNuevo_nombre());
		}

		return contratoDto;
	}

	public List<ContratoDTO> getListaContratoDTO(List<Contrato> listaContratos) {
		List<ContratoDTO> listaContratosDto = new ArrayList<ContratoDTO>();
		if (listaContratos != null) {
			for (Contrato contrato : listaContratos) {
				listaContratosDto.add(this.getContratoDTO(contrato));
			}
		}

		return listaContratosDto;
	}

}
