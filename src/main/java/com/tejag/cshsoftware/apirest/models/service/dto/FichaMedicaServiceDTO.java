package com.tejag.cshsoftware.apirest.models.service.dto;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.List;

import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPutDTO;

public interface FichaMedicaServiceDTO {

	public void save(FichaMedicaPostDTO fichaMedica) throws ParseException;
	
	public List<FichaMedicaDTO> getFichasMedicas();
	
	public FichaMedicaDTO findById(Long id);
	
	public void deleteById(Long id);
	
	public void update(Long id, FichaMedicaPutDTO fichaMedicaPut) throws ParseException;
	
	public ByteArrayInputStream productsPDFReport(FichaMedicaDTO ficha);
	
}
