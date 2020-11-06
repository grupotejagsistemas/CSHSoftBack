package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.AuditoriaDTO;
import com.tejag.cshsoftware.apirest.models.dto.AuditoriaPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Auditoria;
import com.tejag.cshsoftware.apirest.models.service.AuditoriaService;
import com.tejag.cshsoftware.apirest.models.service.dto.AuditoriaDTOService;

@Service
public class AuditoriaDTOServiceImpl implements AuditoriaDTOService {

	@Autowired
	private AuditoriaService auditoriaService;

	@Override
	public void create(AuditoriaPostDTO auditoria) {
		Auditoria newAuditoria = new Auditoria();
		newAuditoria.setAccion(auditoria.getAccion());
		newAuditoria.setUsuario(auditoria.getUsuario());
		newAuditoria.setFecha(new Date());

		auditoriaService.create(newAuditoria);
	}

	@Override
	public AuditoriaDTO getById(Long id) {
		return this.getAuditoriaDTO(auditoriaService.getById(id));

	}

	@Override
	public List<AuditoriaDTO> getAll() {
		return this.getListaAuditoriaDTO(auditoriaService.getAll());

	}

	@Override
	public List<AuditoriaDTO> getByNombre(String usuario) {
		return this.getListaAuditoriaDTO(auditoriaService.findByNombre(usuario));
	}

	public AuditoriaDTO getAuditoriaDTO(Auditoria entity) {
		AuditoriaDTO newAuditoria = new AuditoriaDTO();
		if (entity != null) {
			newAuditoria.setId(entity.getId_accionusuario());
			newAuditoria.setAccion(entity.getAccion());
			newAuditoria.setUsuario(entity.getUsuario());
			newAuditoria.setFecha(entity.getFecha());

		}

		return newAuditoria;
	}

	public List<AuditoriaDTO> getListaAuditoriaDTO(List<Auditoria> listaAuditorias) {
		List<AuditoriaDTO> listaAuditoriasDto = new ArrayList<AuditoriaDTO>();
		for (Auditoria auditoria : listaAuditorias) {
			listaAuditoriasDto.add(this.getAuditoriaDTO(auditoria));
		}
		return listaAuditoriasDto;
	}

	@Override
	public void save(AuditoriaPostDTO auditoria) {
		Auditoria newAuditoria = new Auditoria();

		newAuditoria.setAccion(auditoria.getAccion());
		newAuditoria.setUsuario(auditoria.getUsuario());
		newAuditoria.setFecha(new Date());

		auditoriaService.save(newAuditoria);

	}

	@Override
	public List<AuditoriaDTO> getByFiltroAccionDTO(String accion) {
		return this.getListaAuditoriaDTO(auditoriaService.findByAccion(accion));
	}

}
