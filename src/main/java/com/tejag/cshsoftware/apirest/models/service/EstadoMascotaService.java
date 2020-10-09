package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;

public interface EstadoMascotaService {
	
	public List<MascotaEstado> getMascotas();
	
	public MascotaEstado findById(Long id);

}
