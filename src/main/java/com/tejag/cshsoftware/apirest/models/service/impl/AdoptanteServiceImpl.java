package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.AdoptanteDAO;
import com.tejag.cshsoftware.apirest.models.entity.Adoptante;
import com.tejag.cshsoftware.apirest.models.service.AdoptanteService;

@Service
public class AdoptanteServiceImpl implements AdoptanteService {

	@Autowired
	private AdoptanteDAO adoptanteDao;

	@Override
	@Transactional
	public Adoptante save(Adoptante adoptante) {
		return adoptanteDao.save(adoptante);
	}

	@Override
	@Transactional(readOnly = true)
	public Adoptante getById(Long id) {
		return adoptanteDao.findById(id).orElseThrow();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Adoptante> getAll() {
		return (List<Adoptante>) adoptanteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Adoptante> findByNombreCompleto(String nombreCompleto) {
		return adoptanteDao.findByNombreCompleto(nombreCompleto);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Adoptante> findByEstado(String estado) {
		int idEstado = 0;
		
		if(estado.contains("No")) {
			idEstado = 2;
		}else if(estado.contains("En Proceso")) {
			idEstado = 3;
		}else if(estado.contains("Rechazado")) {
			idEstado = 4;
		}else if(estado.contains("Finalizado")) {
			idEstado = 5;
		}
		else {
			idEstado = 1;
		}
		return adoptanteDao.findByEstado((long)idEstado);
	}

	@Override
	@Transactional
	public Adoptante update(Adoptante adoptante) {
		Adoptante adoptanteActual = new Adoptante();

		adoptanteActual = adoptanteDao.findById(adoptante.getId()).get();
		if (adoptanteActual != null) {
			adoptanteActual.setNumeroFormulario(adoptante.getNumeroFormulario());
			adoptanteActual.setNombre_completo(adoptante.getNombre_completo());
			adoptanteActual.setFecha_nacimiento(adoptante.getFecha_nacimiento());
			adoptanteActual.setDomicilio(adoptante.getDomicilio());
			adoptanteActual.setBarrio(adoptante.getBarrio());
			adoptanteActual.setTelefono(adoptante.getTelefono());
			adoptanteActual.setEmail(adoptante.getEmail());
			adoptanteActual.setFacebook(adoptante.getFacebook());
			adoptanteActual.setInstagram(adoptante.getInstagram());
			adoptanteActual.setSituacionLaboral(adoptante.getSituacionLaboral());
			adoptanteActual.setObservaciones(adoptante.getObservaciones());
			adoptanteActual.setEstado_adoptantes(adoptante.getEstado_adoptantes());
			adoptanteActual.setMascotas(adoptante.getMascotas());
		}
		
		return adoptanteDao.save(adoptanteActual);

	}

}