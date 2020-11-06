package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.FichaMedica;

public interface FichaMedicaService {

	public FichaMedica save(FichaMedica fichaMedica);

	public List<FichaMedica> getFichasMedicas();

	public FichaMedica findById(Long id);

	public void deleteById(Long id);

	public FichaMedica update(FichaMedica fichaMedica);
}
