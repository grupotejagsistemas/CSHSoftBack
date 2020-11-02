package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.VeterinariaCercanaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioDTO;
//import com.tejag.cshsoftware.apirest.models.dto.MascotaEstadoDTO;
import com.tejag.cshsoftware.apirest.models.dto.VoluntarioPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.entity.VeterinariaCercana;
import com.tejag.cshsoftware.apirest.models.entity.Voluntario;
//import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioService;
import com.tejag.cshsoftware.apirest.models.service.dto.IdVeterinariaDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.VeterinariaCercanaDTOService;
import com.tejag.cshsoftware.apirest.models.service.dto.VoluntarioServiceDTO;

@Service
public class VoluntarioServiceDTOImpl implements VoluntarioServiceDTO {

	@Autowired
	private VoluntarioService service;

	@Autowired
	private VeterinariaCercanaDTOService serviceVet;

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

			List<VeterinariaCercana> listaVet = entity.getVeterinarias_cercanas();
			if (listaVet != null) {
				List<VeterinariaDTO> listaVeterinarias = new ArrayList<VeterinariaDTO>();
				for (VeterinariaCercana veterinariaCerca : listaVet) {
					Veterinaria veterinaria = veterinariaCerca.getVeterinaria_cercana();
					listaVeterinarias.add(this.getVeterinariaDTO(veterinaria));
				}
				voluntarioDto.setVeterinariaCercana(listaVeterinarias);
			}

		}
		return voluntarioDto;
	}

	public List<VoluntarioDTO> getListaVoluntarioDTO(List<Voluntario> listaVoluntario) {
		List<VoluntarioDTO> listaVoluntarioDto = new ArrayList<VoluntarioDTO>();
		if (listaVoluntario != null) {
			for (Voluntario voluntario : listaVoluntario) {
				listaVoluntarioDto.add(this.getVoluntarioDto(voluntario));
			}
		}
		return listaVoluntarioDto;
	}

	public VeterinariaDTO getVeterinariaDTO(Veterinaria entity) {
		VeterinariaDTO vete = new VeterinariaDTO();
		if (entity != null) {
			vete.setId(entity.getIdVeterinaria());
			vete.setRazonSocial(entity.getRazonSocial());
		}
		return vete;
	}

	public List<VeterinariaDTO> getVeterinariaDTOLista(List<Veterinaria> listaVeterinaria) {
		List<VeterinariaDTO> listaDto = new ArrayList<VeterinariaDTO>();
		if (listaVeterinaria != null) {
			for (Veterinaria veterinaria : listaVeterinaria) {
				listaDto.add(this.getVeterinariaDTO(veterinaria));
			}
		}

		return listaDto;
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
		newVoluntario.setTransito(voluntario.getTransito());
		newVoluntario.setTraslado(voluntario.getTraslado());
		newVoluntario.setPresencial(voluntario.getPresencial());

		Voluntario voluntarioCreado = service.save(newVoluntario);

		List<IdVeterinariaDTO> lista = voluntario.getIdveterinarias();

		if (voluntario.getIdveterinarias().isEmpty() == false || voluntario.getIdveterinarias() != null) {
			for (IdVeterinariaDTO idVet : lista) {
				VeterinariaCercanaDTO vetCercana = new VeterinariaCercanaDTO();
				vetCercana.setIdVeterinaria(idVet.getId());
				vetCercana.setIdVoluntario(voluntarioCreado.getIdVoluntario());
				serviceVet.create(vetCercana);
			}
		}

	}

	@Override
	public void update(Long idVoluntario, VoluntarioPostDTO voluntario) {
		Voluntario newVoluntario = new Voluntario();

		newVoluntario.setIdVoluntario(idVoluntario);
		newVoluntario.setNombreCompleto(voluntario.getNombreCompleto());
		newVoluntario.setTelefono(voluntario.getTelefono());
		newVoluntario.setDireccion(voluntario.getDireccion());
		newVoluntario.setLocalidad(voluntario.getLocalidad());
		newVoluntario.setTransito(voluntario.getTransito());
		newVoluntario.setTraslado(voluntario.getTraslado());
		newVoluntario.setPresencial(voluntario.getPresencial());

		Voluntario vol = new Voluntario();
		vol = service.update(newVoluntario);
		if (vol.getIdVoluntario() != null) {

			serviceVet.deleteByIdVoluntario(idVoluntario);

			List<IdVeterinariaDTO> lista = voluntario.getIdveterinarias();

			if (voluntario.getIdveterinarias().isEmpty() || voluntario.getIdveterinarias() != null) {
				for (IdVeterinariaDTO idVet : lista) {
					VeterinariaCercanaDTO vetCercana = new VeterinariaCercanaDTO();
					vetCercana.setIdVeterinaria(idVet.getId());
					vetCercana.setIdVoluntario(idVoluntario);
					serviceVet.create(vetCercana);
				}
			}
		}

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
	public List<VoluntarioDTO> findByVoluntarioppt(String filtro) {
		return this.getListaVoluntarioDTO(service.findByVoluntarioppt(filtro));
	}

}
