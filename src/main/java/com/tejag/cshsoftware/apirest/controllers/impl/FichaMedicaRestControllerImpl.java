package com.tejag.cshsoftware.apirest.controllers.impl;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.FichaMedicaRestController;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPutDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.FichaMedicaServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class FichaMedicaRestControllerImpl implements FichaMedicaRestController {

	@Autowired
	private FichaMedicaServiceDTO fichaMedicaServiceDto;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> create(FichaMedicaPostDTO fichaMedicaPost) {
		Map<String, Object> response = new HashMap<>();
		try {
			fichaMedicaServiceDto.save(fichaMedicaPost);
			response.put("mensaje", "Creación exitosa.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	public List<FichaMedicaDTO> getMascotas() {
		return fichaMedicaServiceDto.getFichasMedicas();
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> update(Long id, FichaMedicaPutDTO fichaMedicaPut) {
		Map<String, Object> response = new HashMap<>();
		try {
			fichaMedicaServiceDto.update(id, fichaMedicaPut);
			response.put("mensaje", "Modificación exitosa.");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	@Override
	public void deleteById(Long id) {
		fichaMedicaServiceDto.deleteById(id);
		
	}

	@Override
	public FichaMedicaDTO findById(Long id) {
		return fichaMedicaServiceDto.findById(id);
	}

	@Override
	public ResponseEntity<InputStreamResource> exportPdf(Long id) {
		FichaMedicaDTO fichaMedica = null;
		fichaMedica = fichaMedicaServiceDto.findById(id);
		ByteArrayInputStream bais = fichaMedicaServiceDto.productsPDFReport(fichaMedica);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=FichaMedica.pdf");
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bais));
	}
	
}
