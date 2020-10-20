package com.tejag.cshsoftware.apirest.controllers.impl;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tejag.cshsoftware.apirest.controllers.MascotaRestController;
import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaPostDTO;
import com.tejag.cshsoftware.apirest.models.service.dto.MascotaServiceDTO;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class MascotaRestControllerImpl implements MascotaRestController {

	@Autowired
	private MascotaServiceDTO serviceDto;

	@Override
	public List<MascotaDTO> getMascotas() {
		return serviceDto.getMascotas();
	}

	@Override
	public MascotaDTO show(Long id) {
		return serviceDto.findById(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public MascotaDTO create(MascotaPostDTO mascotaPost) throws Exception {
		return serviceDto.save(mascotaPost);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	public void update(Long id, MascotaPostDTO mascotaPut) {
		serviceDto.update(id, mascotaPut);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	public void delete(Long id) {
		serviceDto.deleteById(id);
	}

	@Override
	public List<MascotaDTO> findByNombre(String nombre) {
		return serviceDto.findByNombre(nombre);
	}

	@Override
	public List<MascotaDTO> findBySexo(String sexo) {
		return serviceDto.findBySexo(sexo);
	}

	@Override
	public ResponseEntity<?> insertarImagen(MultipartFile archivo, String id) throws Exception {
		Map<String, Object> response = new HashMap<>();
		MascotaDTO mascota = serviceDto.insertarImagen(archivo, id);
		response.put("mascota", mascota);
		response.put("mensaje", "Ha subido correctamente la imagen.");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Resource> verFoto(String nombreFoto) {

		Path rutaArchivo = Paths.get("C:\\Users\\Usuario\\Documents\\ImageSpring").resolve(nombreFoto).toAbsolutePath();
		Resource recurso = null;
		try {
			recurso = new UrlResource(rutaArchivo.toUri());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		if (!recurso.exists() && !recurso.isReadable()) {
			throw new RuntimeException("Error: no se puedo cargar la imagen" + nombreFoto);
		}
		HttpHeaders cabecera = new HttpHeaders();
		cabecera.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + recurso.getFilename() + "\"");
		return new ResponseEntity<Resource>(recurso, cabecera, HttpStatus.OK);
	}

}
