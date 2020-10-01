package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

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
	public void create(@RequestBody FichaMedicaPostDTO fichaMedicaPost);
	
	@GetMapping("/fichasMedicas")
	public List<FichaMedicaDTO> getMascotas();
	
	@PutMapping("/fichasMedicas/{id}")
	public void update(@PathVariable("id") int id, @RequestBody FichaMedicaPutDTO fichaMedicaPut);
	
	@DeleteMapping("/fichasMedicas/{id}")
	public void deleteById(@PathVariable("id") int id);
	
	@GetMapping("/fichasMedicas/{id}")
	public FichaMedicaDTO findById(@PathVariable("id") int id);
	
}
