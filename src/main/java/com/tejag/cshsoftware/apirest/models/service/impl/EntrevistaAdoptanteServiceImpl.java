package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.EntrevistaAdoptanteDAO;
import com.tejag.cshsoftware.apirest.models.entity.EntrevistaAdoptante;
import com.tejag.cshsoftware.apirest.models.service.EntrevistaAdoptanteService;

@Service
public class EntrevistaAdoptanteServiceImpl implements EntrevistaAdoptanteService {

	@Autowired
	private EntrevistaAdoptanteDAO entrevistaadoptanteDao;

	@Override
	@Transactional(readOnly = true)
	public List<EntrevistaAdoptante> getEntrevistaAdoptantes() {
		return (List<EntrevistaAdoptante>) entrevistaadoptanteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public EntrevistaAdoptante findById(long id) {
		return entrevistaadoptanteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public EntrevistaAdoptante save(EntrevistaAdoptante newEntrevistaadoptante) {
		return entrevistaadoptanteDao.save(newEntrevistaadoptante);
	}

	@Override
	@Transactional
	public EntrevistaAdoptante update(EntrevistaAdoptante newEntrevistaadoptante) {
		EntrevistaAdoptante entrevistaActual = new EntrevistaAdoptante();

		entrevistaActual = entrevistaadoptanteDao.findById(newEntrevistaadoptante.getId_entrevista_adoptante())
				.orElseThrow();

		entrevistaActual.setAdoptantes(newEntrevistaadoptante.getAdoptantes());
		entrevistaActual.setRespuesta1(newEntrevistaadoptante.getRespuesta1());
		entrevistaActual.setRespuesta2(newEntrevistaadoptante.getRespuesta2());
		entrevistaActual.setRespuesta3(newEntrevistaadoptante.getRespuesta3());
		entrevistaActual.setRespuesta4(newEntrevistaadoptante.getRespuesta4());
		entrevistaActual.setRespuesta5(newEntrevistaadoptante.getRespuesta5());
		entrevistaActual.setRespuesta6(newEntrevistaadoptante.getRespuesta6());
		entrevistaActual.setRespuesta7(newEntrevistaadoptante.getRespuesta7());
		entrevistaActual.setRespuesta8(newEntrevistaadoptante.getRespuesta8());
		entrevistaActual.setRespuesta9(newEntrevistaadoptante.getRespuesta9());
		entrevistaActual.setRespuesta10(newEntrevistaadoptante.getRespuesta10());
		entrevistaActual.setRespuesta11(newEntrevistaadoptante.getRespuesta11());
		entrevistaActual.setRespuesta12(newEntrevistaadoptante.getRespuesta12());
		entrevistaActual.setRespuesta13(newEntrevistaadoptante.getRespuesta13());
		entrevistaActual.setRespuesta14(newEntrevistaadoptante.getRespuesta14());
		entrevistaActual.setRespuesta15(newEntrevistaadoptante.getRespuesta15());
		entrevistaActual.setRespuesta16(newEntrevistaadoptante.getRespuesta16());
		entrevistaActual.setRespuesta17(newEntrevistaadoptante.getRespuesta17());
		entrevistaActual.setRespuesta18(newEntrevistaadoptante.getRespuesta18());
		entrevistaActual.setRespuesta19(newEntrevistaadoptante.getRespuesta19());
		entrevistaActual.setRespuesta20(newEntrevistaadoptante.getRespuesta20());
		entrevistaActual.setRespuesta21(newEntrevistaadoptante.getRespuesta21());

		return entrevistaadoptanteDao.save(entrevistaActual);
	}

	@Override
	public void deleteById(Long idEntrevistaadoptante) {
		entrevistaadoptanteDao.deleteById(idEntrevistaadoptante);
	}

	@Override
	public List<EntrevistaAdoptante> findByNombre(String nombrecompleto) {
		return entrevistaadoptanteDao.findByAdoptantesNombre_completo(nombrecompleto);
	}

	@Override
	public void deleteById(long id) {
		entrevistaadoptanteDao.deleteById(id);
	}

}
