package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.Recordatorio;

public interface RecordatorioService {

	public Recordatorio getById(Long id);
	
	public List<Recordatorio> getAll();
	
	public Recordatorio create(Recordatorio recordatorio);
	
	public void update(Recordatorio recordatorio);
	
}
