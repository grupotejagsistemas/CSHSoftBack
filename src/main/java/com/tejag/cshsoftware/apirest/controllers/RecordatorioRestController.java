package com.tejag.cshsoftware.apirest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tejag.cshsoftware.apirest.models.dto.RecordatorioDTO;
import com.tejag.cshsoftware.apirest.models.dto.RecordatorioPostDTO;

@RequestMapping("/api")
public interface RecordatorioRestController {

	@GetMapping("/recordatorio")
	public List<RecordatorioDTO> getAll();
	
	@PostMapping("/recordatorio")
	public void create(@RequestBody RecordatorioPostDTO recordatorio);
	
	@PutMapping("/recordatorio/{id}")
	public void update(@RequestBody RecordatorioPostDTO recordatorio, @PathVariable("id") Long id);
	
	@GetMapping("/recordatorio/{id}")
	public RecordatorioDTO getById(@PathVariable("id") Long id);
	
}
