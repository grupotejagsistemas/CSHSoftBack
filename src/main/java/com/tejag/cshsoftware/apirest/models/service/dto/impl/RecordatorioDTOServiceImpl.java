package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejag.cshsoftware.apirest.models.dto.RecordatorioDTO;
import com.tejag.cshsoftware.apirest.models.dto.RecordatorioPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Recordatorio;
import com.tejag.cshsoftware.apirest.models.service.RecordatorioService;
import com.tejag.cshsoftware.apirest.models.service.dto.RecordatorioDTOService;

@Service
public class RecordatorioDTOServiceImpl implements RecordatorioDTOService {

	@Autowired
	private RecordatorioService service;

	@Override
	public List<RecordatorioDTO> getAll() {
		return this.getListaRecordatorioDTO(service.getAll());
	}

	@Override
	public void create(RecordatorioPostDTO recordatorio) {
		Recordatorio newRecordatorio = new Recordatorio();
		newRecordatorio.setDescripcion_recordatorio(recordatorio.getDescripcionRecordatorio());
		newRecordatorio.setFecha(recordatorio.getFecha());

		service.create(newRecordatorio);
	}

	@Override
	public void update(RecordatorioPostDTO recordatorio, Long id) {
		Recordatorio newRecordatorio = new Recordatorio();
		newRecordatorio.setId_recordatorio(id);
		newRecordatorio.setDescripcion_recordatorio(recordatorio.getDescripcionRecordatorio());
		newRecordatorio.setFecha(recordatorio.getFecha());

		service.update(newRecordatorio);

	}

	@Override
	public RecordatorioDTO getById(Long id) {
		return this.getRecordatorioDto(service.getById(id));
	}

	public RecordatorioDTO getRecordatorioDto(Recordatorio entity) {
		RecordatorioDTO recordatorio = new RecordatorioDTO();
		if (entity != null) {
			recordatorio.setIdRecordatorio(entity.getId_recordatorio());
			recordatorio.setDescripcionRecordatorio(entity.getDescripcion_recordatorio());
			recordatorio.setFecha(entity.getFecha());
		}
		return recordatorio;
	}

	public List<RecordatorioDTO> getListaRecordatorioDTO(List<Recordatorio> listaRecordatorios) {
		List<RecordatorioDTO> listaRecordatoriosDto = new ArrayList<RecordatorioDTO>();
		if (listaRecordatorios != null) {
			for (Recordatorio recordat : listaRecordatorios) {
				listaRecordatoriosDto.add(this.getRecordatorioDto(recordat));
			}
		}
		return listaRecordatoriosDto;
	}

}
