package com.tejag.cshsoftware.apirest.controllers.impl;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.tejag.cshsoftware.apirest.controllers.ContratoRestController;
import com.tejag.cshsoftware.apirest.models.dto.ContratoDTO;
import com.tejag.cshsoftware.apirest.models.dto.ContratoPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.ContratoDTOService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class ContratoRestControllerImpl implements ContratoRestController {

	@Autowired
	private ContratoDTOService contratoDtoService;

	@Override
	public void create(ContratoPostDTO contrato) {
		contratoDtoService.create(contrato);

	}

	@Override
	public List<ContratoDTO> getContratos() {
		return contratoDtoService.getContratos();
	}

	@Override
	public List<ContratoDTO> getContratoByMascota(String nombre) {
		return contratoDtoService.getByNombreMascota(nombre);
	}

	@Override
	public ResponseEntity<InputStreamResource> exportPdf() {
		List<ContratoDTO> listaContratoDTO = null;
		listaContratoDTO = contratoDtoService.getContratos();
		ByteArrayInputStream bais = contratoDtoService.productsPDFReport(listaContratoDTO);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=contrato.pdf");
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bais));
	}

}
