package com.tejag.cshsoftware.apirest.models.service;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.entity.FichaMedica;

public interface FichaMedicaService {

	public FichaMedica save(FichaMedica fichaMedica);

	public List<FichaMedica> getFichasMedicas();

	public FichaMedica findById(long id);

	public void deleteById(long id);

	public FichaMedica update(FichaMedica fichaMedica);
}
