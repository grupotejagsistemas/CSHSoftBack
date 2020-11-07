package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	public void create(RecordatorioPostDTO recordatorio) throws ParseException {
		Recordatorio newRecordatorio = new Recordatorio();
		newRecordatorio.setDescripcion_recordatorio(recordatorio.getDescripcionRecordatorio());
		String fecha = recordatorio.getFecha();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(fecha);
		newRecordatorio.setFecha(date);

		service.create(newRecordatorio);
	}

	@Override
	public void update(RecordatorioPostDTO recordatorio, Long id) throws ParseException {
		Recordatorio newRecordatorio = new Recordatorio();
		newRecordatorio.setId_recordatorio(id);
		newRecordatorio.setDescripcion_recordatorio(recordatorio.getDescripcionRecordatorio());
		String fecha = recordatorio.getFecha();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(fecha);
		newRecordatorio.setFecha(date);

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
