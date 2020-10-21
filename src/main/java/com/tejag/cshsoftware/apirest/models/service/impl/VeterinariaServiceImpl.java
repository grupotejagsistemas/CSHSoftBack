package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.VeterinariaDAO;
import com.tejag.cshsoftware.apirest.models.entity.Veterinaria;
import com.tejag.cshsoftware.apirest.models.service.VeterinariaService;

@Service
public class VeterinariaServiceImpl implements VeterinariaService {

	@Autowired
	private VeterinariaDAO veterinariaDao;


	@Override
	@Transactional(readOnly = true)
	public List<Veterinaria> getVeterinarias() {
		return (List<Veterinaria>) veterinariaDao.findAll();
	}

	@Override
	@Transactional
	public Veterinaria save(Veterinaria veterinaria) {
		return veterinariaDao.save(veterinaria);
	}

	@Override
	@Transactional(readOnly = true)
	public Veterinaria findById(Long id) {
		return veterinariaDao.findById(id).orElseThrow();
	}

	@Override
	@Transactional
	public Veterinaria update(Veterinaria veterinaria) {
		Veterinaria veterinariaActual = new Veterinaria();
		veterinariaActual = veterinariaDao.findById(veterinaria.getIdVeterinaria()).get();

		veterinariaActual.setIdVeterinaria(veterinaria.getIdVeterinaria());
		veterinariaActual.setRazonSocial(veterinaria.getRazonSocial());
		veterinariaActual.setHorarioAtencion(veterinaria.getHorarioAtencion());
		veterinariaActual.setDireccion(veterinaria.getDireccion());
		veterinariaActual.setInternacion(veterinaria.getInternacion());
		veterinariaActual.setObservaciones(veterinaria.getObservaciones());

		return veterinariaDao.save(veterinariaActual);
	}

	@Override
	public void deleteById(Long id) {
		veterinariaDao.deleteById(id);
	}

	@Override
	public List<Veterinaria> findByRazonSocial(String razonsocial) {
		return veterinariaDao.findByRazonSocial(razonsocial);
	}

	@Override
	public List<Veterinaria> findByInternacion(String internacion) {
		return veterinariaDao.findByInternacion(internacion);
	}
	

	
	}

	

	
	
	

	


