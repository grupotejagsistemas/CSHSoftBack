package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptanteDTO;
import com.tejag.cshsoftware.apirest.models.dto.EntrevistaAdoptantePostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Adoptante;
import com.tejag.cshsoftware.apirest.models.entity.EntrevistaAdoptante;
import com.tejag.cshsoftware.apirest.models.service.AdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.EntrevistaAdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.dto.EntrevistaAdoptanteDTOService;

@Service
public class EntrevistaAdoptanteDTOServiceImpl implements EntrevistaAdoptanteDTOService {

	@Autowired
	private EntrevistaAdoptanteService entrevistaadoptanteservice;

	@Autowired
	private AdoptanteService adoptanteservice;

	public EntrevistaAdoptanteDTO getEntrevistaAdoptanteDTO(EntrevistaAdoptante entity) {
		EntrevistaAdoptanteDTO newentrevista = new EntrevistaAdoptanteDTO();
		if (entity != null) {
			newentrevista.setAdoptante(entity.getAdoptantes().getNombre_completo());
			newentrevista.setIdAdoptante(entity.getAdoptantes().getId().toString());
			newentrevista.setId(entity.getId_entrevista_adoptante());			
			newentrevista.setRespuesta1(entity.getRespuesta1());
			newentrevista.setRespuesta2(entity.getRespuesta2());
			newentrevista.setRespuesta3(entity.getRespuesta3());
			newentrevista.setRespuesta4(entity.getRespuesta4());
			newentrevista.setRespuesta5(entity.getRespuesta5());
			newentrevista.setRespuesta6(entity.getRespuesta6());
			newentrevista.setRespuesta7(entity.getRespuesta7());
			newentrevista.setRespuesta8(entity.getRespuesta8());
			newentrevista.setRespuesta9(entity.getRespuesta9());
			newentrevista.setRespuesta10(entity.getRespuesta10());
			newentrevista.setRespuesta11(entity.getRespuesta11());
			newentrevista.setRespuesta12(entity.getRespuesta12());
			newentrevista.setRespuesta13(entity.getRespuesta13());
			newentrevista.setRespuesta14(entity.getRespuesta14());
			newentrevista.setRespuesta15(entity.getRespuesta15());
			newentrevista.setRespuesta16(entity.getRespuesta16());
			newentrevista.setRespuesta17(entity.getRespuesta17());
			newentrevista.setRespuesta18(entity.getRespuesta18());
			newentrevista.setRespuesta19(entity.getRespuesta19());
			newentrevista.setRespuesta20(entity.getRespuesta20());
			newentrevista.setRespuesta21(entity.getRespuesta21());

		}
		return newentrevista;

	}

	@Override
	public void save(EntrevistaAdoptantePostDTO entrevistaadoptante) {
		EntrevistaAdoptante newentrevista = new EntrevistaAdoptante();

		Adoptante adoptante = new Adoptante();
		adoptante = adoptanteservice.getById(entrevistaadoptante.getIdAdoptante());
		newentrevista.setAdoptantes(adoptante);
		newentrevista.setRespuesta1(entrevistaadoptante.getRespuesta1());
		newentrevista.setRespuesta2(entrevistaadoptante.getRespuesta2());
		newentrevista.setRespuesta3(entrevistaadoptante.getRespuesta3());
		newentrevista.setRespuesta4(entrevistaadoptante.getRespuesta4());
		newentrevista.setRespuesta5(entrevistaadoptante.getRespuesta5());
		newentrevista.setRespuesta6(entrevistaadoptante.getRespuesta6());
		newentrevista.setRespuesta7(entrevistaadoptante.getRespuesta7());
		newentrevista.setRespuesta8(entrevistaadoptante.getRespuesta8());
		newentrevista.setRespuesta9(entrevistaadoptante.getRespuesta9());
		newentrevista.setRespuesta10(entrevistaadoptante.getRespuesta10());
		newentrevista.setRespuesta11(entrevistaadoptante.getRespuesta11());
		newentrevista.setRespuesta12(entrevistaadoptante.getRespuesta12());
		newentrevista.setRespuesta13(entrevistaadoptante.getRespuesta13());
		newentrevista.setRespuesta14(entrevistaadoptante.getRespuesta14());
		newentrevista.setRespuesta15(entrevistaadoptante.getRespuesta15());
		newentrevista.setRespuesta16(entrevistaadoptante.getRespuesta16());
		newentrevista.setRespuesta17(entrevistaadoptante.getRespuesta17());
		newentrevista.setRespuesta18(entrevistaadoptante.getRespuesta18());
		newentrevista.setRespuesta19(entrevistaadoptante.getRespuesta19());
		newentrevista.setRespuesta20(entrevistaadoptante.getRespuesta20());
		newentrevista.setRespuesta21(entrevistaadoptante.getRespuesta21());

		entrevistaadoptanteservice.save(newentrevista);

	}

	@Override
	public List<EntrevistaAdoptanteDTO> getEntrevistaAdoptantes() {
		return this.getListaEntrevistaAdoptanteDTO(entrevistaadoptanteservice.getEntrevistaAdoptantes());
	}

	public List<EntrevistaAdoptanteDTO> getListaEntrevistaAdoptanteDTO(
			List<EntrevistaAdoptante> listaentrevistaAdoptantes) {
		List<EntrevistaAdoptanteDTO> listaEntrevistaAdoptanteDTO = new ArrayList<EntrevistaAdoptanteDTO>();
		for (EntrevistaAdoptante entrevistaadoptante : listaentrevistaAdoptantes) {
			listaEntrevistaAdoptanteDTO.add(this.getEntrevistaAdoptanteDTO(entrevistaadoptante));
		}
		return listaEntrevistaAdoptanteDTO;
	}

	@Override
	public EntrevistaAdoptanteDTO findById(long id) {
		return this.getEntrevistaAdoptanteDTO(entrevistaadoptanteservice.findById(id));
	}

	@Override
	public void deleteById(long id) {
		entrevistaadoptanteservice.deleteById(id);

	}

	@Override
	public void update(long id, EntrevistaAdoptantePostDTO entrevistaadoptantepost) {
		EntrevistaAdoptante newentrevista = new EntrevistaAdoptante();
		
		newentrevista.setId_entrevista_adoptante(id);
		Adoptante adoptante = new Adoptante();
		adoptante = adoptanteservice.getById(entrevistaadoptantepost.getIdAdoptante());
		newentrevista.setAdoptantes(adoptante);
		newentrevista.setRespuesta1(entrevistaadoptantepost.getRespuesta1());
		newentrevista.setRespuesta2(entrevistaadoptantepost.getRespuesta2());
		newentrevista.setRespuesta3(entrevistaadoptantepost.getRespuesta3());
		newentrevista.setRespuesta4(entrevistaadoptantepost.getRespuesta4());
		newentrevista.setRespuesta5(entrevistaadoptantepost.getRespuesta5());
		newentrevista.setRespuesta6(entrevistaadoptantepost.getRespuesta6());
		newentrevista.setRespuesta7(entrevistaadoptantepost.getRespuesta7());
		newentrevista.setRespuesta8(entrevistaadoptantepost.getRespuesta8());
		newentrevista.setRespuesta9(entrevistaadoptantepost.getRespuesta9());
		newentrevista.setRespuesta10(entrevistaadoptantepost.getRespuesta10());
		newentrevista.setRespuesta11(entrevistaadoptantepost.getRespuesta11());
		newentrevista.setRespuesta12(entrevistaadoptantepost.getRespuesta12());
		newentrevista.setRespuesta13(entrevistaadoptantepost.getRespuesta13());
		newentrevista.setRespuesta14(entrevistaadoptantepost.getRespuesta14());
		newentrevista.setRespuesta15(entrevistaadoptantepost.getRespuesta15());
		newentrevista.setRespuesta16(entrevistaadoptantepost.getRespuesta16());
		newentrevista.setRespuesta17(entrevistaadoptantepost.getRespuesta17());
		newentrevista.setRespuesta18(entrevistaadoptantepost.getRespuesta18());
		newentrevista.setRespuesta19(entrevistaadoptantepost.getRespuesta19());
		newentrevista.setRespuesta20(entrevistaadoptantepost.getRespuesta20());
		newentrevista.setRespuesta21(entrevistaadoptantepost.getRespuesta21());

		entrevistaadoptanteservice.update(newentrevista);
	}

	@Override
	public List<EntrevistaAdoptanteDTO> findByNombre(String nombrecompleto) {
		return this.getListaEntrevistaAdoptanteDTO(entrevistaadoptanteservice.findByNombre(nombrecompleto));
	}

	@Override
	public List<EntrevistaAdoptanteDTO> getEntrevistasId_NombreAdoptante() {
		return this.getListaEntrevistasId_NombreAdoptantesDTO(entrevistaadoptanteservice.getEntrevistaAdoptantes());
	}

	public List<EntrevistaAdoptanteDTO> getListaEntrevistasId_NombreAdoptantesDTO(
			List<EntrevistaAdoptante> listaentrevistaAdoptantes) {
		List<EntrevistaAdoptanteDTO> listaEntrevistaAdoptanteDTO = new ArrayList<EntrevistaAdoptanteDTO>();
		for (EntrevistaAdoptante entrevistaadoptante : listaentrevistaAdoptantes) {
			listaEntrevistaAdoptanteDTO.add(this.getEntrevistaId_NombreAdoptanteDTO(entrevistaadoptante));
		}
		return listaEntrevistaAdoptanteDTO;
	}

	public EntrevistaAdoptanteDTO getEntrevistaId_NombreAdoptanteDTO(EntrevistaAdoptante entity) {
		EntrevistaAdoptanteDTO newentrevista = new EntrevistaAdoptanteDTO();
		if (entity != null) {
			newentrevista.setAdoptante(entity.getAdoptantes().getNombre_completo());
			newentrevista.setId(entity.getId_entrevista_adoptante());
		}
		return newentrevista;
	}

}
