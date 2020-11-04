package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.Auditoria;

public interface AuditoriaService {
	
    public Auditoria save(Auditoria auditoria);
	
	public Auditoria getById(Long id);
	
	public List<Auditoria> getAll();
	
	public List<Auditoria> findByNombre(String usuario);

	public Auditoria create(Auditoria newAuditoria);

	public List<Auditoria> findByAccion(String accion);

}
