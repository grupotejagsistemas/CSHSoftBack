package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPostDTO;
import com.tejag.cshsoftware.apirest.models.dto.FichaMedicaPutDTO;

@RequestMapping("/api")
public interface FichaMedicaRestController {

	@PostMapping("/fichasMedicas")
	public ResponseEntity<?> create(@RequestBody FichaMedicaPostDTO fichaMedicaPost);
	
	@GetMapping("/fichasMedicas")
	public List<FichaMedicaDTO> getMascotas();
	
	@PutMapping("/fichasMedicas/{id}")
	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody FichaMedicaPutDTO fichaMedicaPut);
	
	@DeleteMapping("/fichasMedicas/{id}")
	public void deleteById(@PathVariable("id") Long id);
	
	@GetMapping("/fichasMedicas/{id}")
	public FichaMedicaDTO findById(@PathVariable("id") Long id);
	
	@GetMapping("/fichasMedicas/export/pdf/{id}")
	public ResponseEntity<InputStreamResource> exportPdf(@PathVariable("id") Long id);
	
}
