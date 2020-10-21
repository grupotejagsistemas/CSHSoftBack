package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.RecordatorioDAO;
import com.tejag.cshsoftware.apirest.models.entity.Recordatorio;
import com.tejag.cshsoftware.apirest.models.service.RecordatorioService;

@Service
public class RecordatorioServiceImpl implements RecordatorioService {

	@Autowired
	private RecordatorioDAO daoInstance;

	@Override
	@Transactional(readOnly = true)
	public Recordatorio getById(Long id) {
		return daoInstance.findById(id).orElseThrow();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Recordatorio> getAll() {
		return (List<Recordatorio>) daoInstance.findAll();
	}

	@Override
	@Transactional
	public Recordatorio create(Recordatorio recordatorio) {
		return daoInstance.save(recordatorio);
	}

	@Override
	@Transactional
	public void update(Recordatorio recordatorio) {
		Recordatorio record = new Recordatorio();
		record = this.getById(recordatorio.getId_recordatorio());
		if (record != null) {
			daoInstance.save(recordatorio);
		}
	}

}
