package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.service.ContratoService;
import com.tejag.cshsoftware.apirest.models.service.dto.ContratoDTOService;

@Service
public class ContratoDTOServiceImpl implements ContratoDTOService {

	@Autowired
	private ContratoService contratoService;
	
}
