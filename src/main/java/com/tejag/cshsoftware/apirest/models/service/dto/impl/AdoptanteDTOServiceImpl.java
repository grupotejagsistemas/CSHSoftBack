package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.AdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.AdoptantePostDTO;
import com.tejag.cshsoftware.apirest.models.dto.EstadoAdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaCercanaAdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.entity.Adoptante;
import com.tejag.cshsoftware.apirest.models.entity.EstadoAdoptante;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercanaAdoptante;
import com.tejag.cshsoftware.apirest.models.service.AdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.EstadoAdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;
import com.tejag.cshsoftware.apirest.models.service.dto.AdoptanteDTOService;
import com.tejag.cshsoftware.apirest.models.service.dto.IdVeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaCercanaAdoptanteDTOService;

@Service
public class AdoptanteDTOServiceImpl implements AdoptanteDTOService {

	@Autowired
	private AdoptanteService adoptanteService;

	@Autowired
	private EstadoAdoptanteService estadoAdoptanteService;

	@Autowired
	private VeterinariaCercanaAdoptanteDTOService serviceVet;

	@Autowired
	private MascotaService mascotaService;

	@Override
	public void create(AdoptantePostDTO adoptante) {
		Adoptante newAdoptante = new Adoptante();
		newAdoptante.setNumeroFormulario(adoptante.getNumeroFormulario());
		newAdoptante.setNombre_completo(adoptante.getNombreCompleto());
//		newAdoptante.setFecha_nacimiento(adoptante.getFechaNacimiento());
		newAdoptante.setDomicilio(adoptante.getDomicilio());
		newAdoptante.setBarrio(adoptante.getBarrio());
		newAdoptante.setTelefono(adoptante.getCelular());
		newAdoptante.setEmail(adoptante.getEmail());
		newAdoptante.setFacebook(adoptante.getFacebook());
		newAdoptante.setInstagram(adoptante.getInstagram());
		newAdoptante.setSituacionLaboral(adoptante.getSituacionLaboral());
		newAdoptante.setObservaciones(adoptante.getObservaciones());
		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(adoptante.getIdMascota());
		newAdoptante.setMascotas(mascota);
		EstadoAdoptante estado = new EstadoAdoptante();
		estado = estadoAdoptanteService.getEstadoAdoptanteById((long) adoptante.getIdEstadoAdoptante());
		newAdoptante.setEstado_adoptantes(estado);

		Adoptante adoptanteCreado = adoptanteService.save(newAdoptante);

		List<IdVeterinariaDTO> lista = adoptante.getIdVeterinaria();

		if (lista.isEmpty() == false || lista != null) {
			for (IdVeterinariaDTO idVet : lista) {
				VeterinariaCercanaAdoptanteDTO vetCercana = new VeterinariaCercanaAdoptanteDTO();
				vetCercana.setIdVeterinaria(idVet.getId());
				vetCercana.setIdAdoptante(adoptanteCreado.getId_adoptante());
				serviceVet.create(vetCercana);
			}
		}

	}

	@Override
	public List<AdoptanteDTO> getAll() {
		return this.getListaAdoptanteDTO(adoptanteService.getAll());
	}

	@Override
	public AdoptanteDTO getById(Long id) {
		return this.getAdoptanteDTO(adoptanteService.getById(id));
	}

	@Override
	public List<AdoptanteDTO> getByNombre(String nombreCompleto) {
		return this.getListaAdoptanteDTO(adoptanteService.findByNombreCompleto(nombreCompleto));
	}

	@Override
	public List<AdoptanteDTO> getByEstado(String estado) {
		return this.getListaAdoptanteDTO(adoptanteService.findByEstado(estado));
	}

	@Override
	public void update(Long id, AdoptantePostDTO adoptante) {

		Adoptante newAdoptante = new Adoptante();

		newAdoptante.setId_adoptante(id);
		newAdoptante.setNumeroFormulario(adoptante.getNumeroFormulario());
		newAdoptante.setNombre_completo(adoptante.getNombreCompleto());
//		newAdoptante.setFecha_nacimiento(adoptante.getFechaNacimiento());
		newAdoptante.setDomicilio(adoptante.getDomicilio());
		newAdoptante.setBarrio(adoptante.getBarrio());
		newAdoptante.setTelefono(adoptante.getCelular());
		newAdoptante.setEmail(adoptante.getEmail());
		newAdoptante.setFacebook(adoptante.getFacebook());
		newAdoptante.setInstagram(adoptante.getInstagram());
		newAdoptante.setSituacionLaboral(adoptante.getSituacionLaboral());
		newAdoptante.setObservaciones(adoptante.getObservaciones());
		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(adoptante.getIdMascota());
		newAdoptante.setMascotas(mascota);

		EstadoAdoptante estado = new EstadoAdoptante();
		estado = estadoAdoptanteService.getEstadoAdoptanteById((long) adoptante.getIdEstadoAdoptante());
		newAdoptante.setEstado_adoptantes(estado);

		Adoptante adoptanteModificado = new Adoptante();
		adoptanteModificado = adoptanteService.update(newAdoptante);
		if (adoptanteModificado.getId_adoptante() != null) {

			serviceVet.deleteByIdAdoptante(id);

			List<IdVeterinariaDTO> lista = adoptante.getIdVeterinaria();

			if (lista.isEmpty() == false || lista != null) {
				for (IdVeterinariaDTO idVet : lista) {
					VeterinariaCercanaAdoptanteDTO vetCercana = new VeterinariaCercanaAdoptanteDTO();
					vetCercana.setIdVeterinaria(idVet.getId());
					vetCercana.setIdAdoptante(id);
					serviceVet.create(vetCercana);
				}
			}
		}

	}

	// *************************************************************************************
	// ************** Transformación DTO a Entity
	// ******************************************
	// *************************************************************************************

	public AdoptanteDTO getAdoptanteDTO(Adoptante entity) {
		AdoptanteDTO adoptante = new AdoptanteDTO();
		if (entity != null) {
			adoptante.setId(entity.getId_adoptante());
			adoptante.setNumeroFormulario(entity.getNumeroFormulario());
			adoptante.setNombreCompleto(entity.getNombre_completo());
			adoptante.setFechaNacimiento(entity.getFecha_nacimiento());
			adoptante.setDomicilio(entity.getDomicilio());
			adoptante.setBarrio(entity.getBarrio());
			adoptante.setCelular(entity.getTelefono());
			adoptante.setEmail(entity.getEmail());
			adoptante.setFacebook(entity.getFacebook());
			adoptante.setInstagram(entity.getInstagram());
			adoptante.setSituacionLaboral(entity.getSituacionLaboral());
			adoptante.setIdMascota(entity.getMascotas().getId().toString());
			adoptante.setMascotaInteresada(entity.getMascotas().getNombre());
			adoptante.setIdEstadoAdoptante(entity.getEstado_adoptantes().getId_estado_adoptante().toString());
			adoptante.setEstado_adoptante(entity.getEstado_adoptantes().getDescripcion());

			List<VeterinariaCercanaAdoptante> listaVet = entity.getVeterinarias_cercanas_adoptantes();
			if (listaVet != null) {
				List<VeterinariaDTO> listaVeterinarias = new ArrayList<VeterinariaDTO>();
				for (VeterinariaCercanaAdoptante veterinariaCerca : listaVet) {
					Veterinaria veterinaria = veterinariaCerca.getVeterinaria_cercana_adoptante();
					listaVeterinarias.add(this.getVeterinariaDTO(veterinaria));
				}
				adoptante.setIdVeterinaria(listaVeterinarias);
			}

			adoptante.setObservaciones(entity.getObservaciones());
			adoptante.setEstado_adoptante(entity.getEstado_adoptantes().getDescripcion());
		}

		return adoptante;
	}

	public MascotaDTO getMascotaDto(Mascota entity) {
		MascotaDTO mascotaDto = new MascotaDTO();
		if (entity != null) {
			mascotaDto.setNombre(entity.getNombre());
		}
		return mascotaDto;
	}

	public VeterinariaDTO getVeterinariaDTO(Veterinaria entity) {
		VeterinariaDTO vete = new VeterinariaDTO();
		if (entity != null) {
			vete.setId(entity.getIdVeterinaria());
			vete.setRazonSocial(entity.getRazonSocial());
		}
		return vete;
	}

	public EstadoAdoptanteDTO getEstadoAdoptanteDTO(EstadoAdoptante entity) {
		EstadoAdoptanteDTO estadoDto = new EstadoAdoptanteDTO();
		if (entity != null) {
			estadoDto.setId(entity.getId_estado_adoptante());
			estadoDto.setDescripcion(entity.getDescripcion());
		}
		return estadoDto;
	}

	public List<AdoptanteDTO> getListaAdoptanteDTO(List<Adoptante> listaAdoptantes) {
		List<AdoptanteDTO> listaAdoptanteDto = new ArrayList<AdoptanteDTO>();
		if (listaAdoptantes != null) {
			for (Adoptante adoptante : listaAdoptantes) {
				listaAdoptanteDto.add(this.getAdoptanteDTO(adoptante));
			}
		}
		return listaAdoptanteDto;
	}

}
