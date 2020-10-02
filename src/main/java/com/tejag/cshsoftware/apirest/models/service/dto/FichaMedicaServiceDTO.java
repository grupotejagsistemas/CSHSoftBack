package com.tejag.cshsoftware.apirest.models.service.dto;

import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPutDTO;

public interface FichaMedicaServiceDTO {

	public void save(FichaMedicaPostDTO fichaMedica);
	
	public List<FichaMedicaDTO> getFichasMedicas();
	
	public FichaMedicaDTO findById(int id);
	
	public void deleteById(int id);
	
	public void update(int id, FichaMedicaPutDTO fichaMedicaPut);
	
}
