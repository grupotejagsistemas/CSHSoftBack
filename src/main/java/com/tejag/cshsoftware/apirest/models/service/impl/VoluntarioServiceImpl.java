package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tejag.cshsoftware.apirest.models.dao.VoluntarioDAO;
import com.tejag.cshsoftware.apirest.models.entity.Voluntario;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioService;

@Service
public class VoluntarioServiceImpl implements VoluntarioService {

	@Autowired
	private VoluntarioDAO voluntarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Voluntario> getVoluntarios() {
		return (List<Voluntario>) voluntarioDao.findAll();
	}

	@Override
	@Transactional
	public Voluntario save(Voluntario voluntario) {
		return voluntarioDao.save(voluntario);
	}

	@Override
	@Transactional(readOnly = true)
	public Voluntario findById(Long idvoluntario) {
		return voluntarioDao.findById(idvoluntario).orElse(null);
	}

	@Override
	@Transactional
	public Voluntario update(Voluntario voluntario) {
		Voluntario voluntarioActual = new Voluntario();

		voluntarioActual = voluntarioDao.findById(voluntario.getIdVoluntario()).get();

		voluntarioActual.setNombreCompleto(voluntario.getNombreCompleto());
		voluntarioActual.setTelefono(voluntario.getTelefono());
		voluntarioActual.setDireccion(voluntario.getDireccion());
		voluntarioActual.setLocalidad(voluntario.getLocalidad());
		voluntarioActual.setTransito(voluntario.getTransito());
		voluntarioActual.setTraslado(voluntario.getTraslado());
		voluntarioActual.setPresencial(voluntario.getPresencial());

		return voluntarioDao.save(voluntarioActual);
	}

	@Override
	public void deleteById(Long idvoluntario) {
		voluntarioDao.deleteById(idvoluntario);
	}

	@Override
	public List<Voluntario> findByNombre(String nombre) {
		return voluntarioDao.findByNombreCompletoIgnoreCaseLike("%" + nombre + "%");
	}

	@Override
	public List<Voluntario> findByVoluntarioppt(String filtro) {
		if (filtro.contains("Transito") || filtro.contains("transito")) {
			return voluntarioDao.filtrarTransito("s");
		} else if (filtro.contains("Traslado") || filtro.contains("traslado")) {
			return voluntarioDao.filtrarTraslado("s");
		} else if (filtro.contains("Presencial") || filtro.contains("presencial")) {
			return voluntarioDao.filtrarPresencial("s");
		} else {
			return this.getVoluntarios();
		}
	}

}
