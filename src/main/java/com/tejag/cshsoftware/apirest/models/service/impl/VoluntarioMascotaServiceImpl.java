package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.VoluntarioMascotaDAO;
import com.tejag.cshsoftware.apirest.models.entity.VoluntarioMascota;
import com.tejag.cshsoftware.apirest.models.service.VoluntarioMascotaService;

@Service
public class VoluntarioMascotaServiceImpl implements VoluntarioMascotaService {

	@Autowired
	private VoluntarioMascotaDAO voluntarioMascotaDao;

	@Override
	@Transactional
	public VoluntarioMascota create(VoluntarioMascota voluntarioMascota) {
		return voluntarioMascotaDao.save(voluntarioMascota);
	}

	@Override
	@Transactional
	public void update(VoluntarioMascota voluntarioMascota) {
		VoluntarioMascota voluMas = new VoluntarioMascota();
		voluMas = this.getById(voluntarioMascota.getIdVoluntarioMascota());
		if (voluMas != null) {
			voluMas = voluntarioMascota;
			voluntarioMascotaDao.save(voluntarioMascota);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public VoluntarioMascota getById(Long id) {
		return voluntarioMascotaDao.findById(id).orElseThrow();
	}

	@Override
	@Transactional(readOnly = true)
	public List<VoluntarioMascota> getAll() {
		return (List<VoluntarioMascota>) voluntarioMascotaDao.findAll();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		voluntarioMascotaDao.deleteById(id);

	}

	@Override
	public List<VoluntarioMascota> getByNombre(String nombre) {
		return voluntarioMascotaDao.findByMascotasNombreContainingIgnoreCase(nombre);
	}

}
