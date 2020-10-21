package com.tejag.cshsoftware.apirest.models.service.impl;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.MascotaDAO;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;

@Service
public class MascotaServiceImpl implements MascotaService {

	@Autowired
	private MascotaDAO mascotaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Mascota> getMascotas() {
		return (List<Mascota>) mascotaDao.findAll();
	}

	@Override
	@Transactional
	public Mascota save(Mascota mascota) throws Exception {
		return mascotaDao.save(mascota);
	}

	@Override
	@Transactional(readOnly = true)
	public Mascota findById(Long id) {
		return mascotaDao.findById(id).orElseThrow();
	}

	@Override
	@Transactional
	public Mascota update(Mascota mascota) {
		Mascota mascotaActual = new Mascota();
		mascotaActual = mascotaDao.findById(mascota.getId()).get();

		mascotaActual.setNombre(mascota.getNombre());
		mascotaActual.setFechaNacimieto(mascota.getFechaNacimieto());
		mascotaActual.setParticularidadesFisica(mascota.getParticularidadesFisica());
		mascotaActual.setSexo(mascota.getSexo());
		mascotaActual.setFotoMascota(mascota.getFotoMascota());
		mascotaActual.setFechaRescate(mascota.getFechaRescate());
		mascotaActual.setLugarRescate(mascota.getLugarRescate());
		mascotaActual.setDescripcionRescate(mascota.getDescripcionRescate());
		mascotaActual.setEspecie(mascota.getEspecie());
		mascotaActual.setEstado_mascota(mascota.getEstado_mascota());

		return mascotaDao.save(mascotaActual);
	}

	@Override
	public void deleteById(Long id) {
		Mascota mascotaActual = new Mascota();

		mascotaActual = mascotaDao.findById(id).orElseThrow();
		String fotoAnterior = mascotaActual.getFotoMascota();
		if (fotoAnterior != null && fotoAnterior.length() > 0) {
			Path rutaFotoAnterior = Paths.get("C:\\Users\\Usuario\\Documents\\ImageSpring").resolve(fotoAnterior)
					.toAbsolutePath();
			File archivoFotoAnterior = rutaFotoAnterior.toFile();
			if (archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
				archivoFotoAnterior.delete();
			}
		}
		mascotaDao.deleteById(id);
	}

	@Override
	public List<Mascota> findByNombre(String nombre) {
		return mascotaDao.findByNombre(nombre);
	}

	@Override
	public List<Mascota> findBySexo(String sexo) {
		return mascotaDao.findBySexo(sexo);
	}

	@Override
	public Mascota updatePath(Long id, String nuevaRuta) {
		Mascota mascotaActual = new Mascota();

		mascotaActual = mascotaDao.findById(id).orElseThrow();
		String fotoAnterior = mascotaActual.getFotoMascota();
		if (fotoAnterior != null && fotoAnterior.length() > 0) {
			Path rutaFotoAnterior = Paths.get("C:\\Users\\Usuario\\Documents\\ImageSpring").resolve(fotoAnterior)
					.toAbsolutePath();
			File archivoFotoAnterior = rutaFotoAnterior.toFile();
			if (archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
				archivoFotoAnterior.delete();
			}
		}
		mascotaActual.setFotoMascota(nuevaRuta);

		return mascotaDao.save(mascotaActual);

	}

}
