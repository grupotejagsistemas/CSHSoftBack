package com.tejag.cshsoftware.apirest.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dao.ContratoDAO;
import com.tejag.cshsoftware.apirest.models.service.ContratoService;

@Service
public class ContratoServiceImpl implements ContratoService {

	@Autowired
	private ContratoDAO contratoDao;
	
}
