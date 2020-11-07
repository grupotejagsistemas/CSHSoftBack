package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tejag.cshsoftware.apirest.models.dto.MascotaDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaEstadoDTO;
import com.tejag.cshsoftware.apirest.models.dto.MascotaPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;
import com.tejag.cshsoftware.apirest.models.service.EstadoMascotaService;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;
import com.tejag.cshsoftware.apirest.models.service.dto.MascotaServiceDTO;

@Service
public class MascotaServiceDTOImpl implements MascotaServiceDTO {

	@Autowired
	private MascotaService service;

	@Autowired
	private EstadoMascotaService estadoService;

	@Override
	public List<MascotaDTO> getMascotas() {
		return this.getListaMascotaDTO(service.getMascotas());
	}

	public MascotaDTO getMascotaDto(Mascota entity) {
		MascotaDTO mascotaDto = new MascotaDTO();
		if (entity != null) {
			mascotaDto.setId(entity.getId());
			mascotaDto.setNombre(entity.getNombre());
			mascotaDto.setFechaNacimiento(entity.getFechaNacimieto());
			mascotaDto.setParticularidadesFisicas(entity.getParticularidadesFisica());
			mascotaDto.setSexo(entity.getSexo());
			mascotaDto.setFotoMascota(entity.getFotoMascota());
			mascotaDto.setFechaRescate(entity.getFechaRescate());
			mascotaDto.setLugarRescate(entity.getLugarRescate());
			mascotaDto.setDescripcionRescate(entity.getDescripcionRescate());
			mascotaDto.setEspecie(entity.getEspecie());
			mascotaDto.setEstado(entity.getEstado_mascota().getId().toString());
			mascotaDto.setNombreEstado(entity.getEstado_mascota().getDescripcion());
			//mascotaDto.setEstado(this.getEstadoMascotaDTO(entity.getEstado_mascota()));
		}
		return mascotaDto;
	}

	@Override
	public MascotaDTO findById(Long id) {
		return this.getMascotaDto(service.findById(id));
	}

	@Override
	public MascotaDTO save(MascotaPostDTO mascota) throws Exception {
		Mascota newMascota = new Mascota();
		newMascota.setNombre(mascota.getNombre());
		String fechaNac = mascota.getFechaNacimiento();
		String fechaRes = mascota.getFechaRescate();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date dateNacimiento = simpleDateFormat.parse(fechaNac);
		Date dateRescate = simpleDateFormat.parse(fechaRes);
		newMascota.setFechaNacimieto(dateNacimiento);
		newMascota.setParticularidadesFisica(mascota.getParticularidadesFisicas());
		newMascota.setSexo(mascota.getSexo());
		newMascota.setFotoMascota(mascota.getFotoMascota());
		newMascota.setFechaRescate(dateRescate);
		newMascota.setLugarRescate(mascota.getLugarRescate());
		newMascota.setDescripcionRescate(mascota.getDescripcionRescate());
		newMascota.setEspecie(mascota.getEspecie());

		MascotaEstado estado = new MascotaEstado();
		estado = estadoService.findById((long) mascota.getEstado());

		newMascota.setEstado_mascota(estado);
		return this.getMascotaDto(service.save(newMascota));

	}

	@Override
	public MascotaDTO insertarImagen(MultipartFile archivo, String id) throws Exception {
		this.validarTipo(archivo);
		if (!archivo.isEmpty()) {
			String nombreArchivo = UUID.randomUUID().toString() + "_" + archivo.getOriginalFilename().replace(" ", "");
			Path rutaArchivo = Paths.get("C:\\Users\\Usuario\\Documents\\ImageSpring").resolve(nombreArchivo)
					.toAbsolutePath();
			Files.copy(archivo.getInputStream(), rutaArchivo);
			Long idMascota = Long.parseLong(id);
			return this.getMascotaDto(service.updatePath(idMascota, nombreArchivo));
		} else {
			throw new Exception("Error al guardar la imagen");
		}
	}

	public void validarTipo(MultipartFile archivo) throws Exception {
		// Validacion
		try {
			String tipodeArchivo;
			tipodeArchivo = archivo.getContentType();
			String[] tipos = { "image/png", "image/jpg", "image/jpeg" };
			if (!tipodeArchivo.toString().equals(tipos[0]) && !tipodeArchivo.toString().equals(tipos[1])
					&& !tipodeArchivo.toString().equals(tipos[2])) {
				throw new Exception("Formato de archivo no valido solo se acepta PNG, JPG y JPEG");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Long id, MascotaPostDTO mascota) throws ParseException {
		Mascota newMascota = new Mascota();

		String fechaNac = mascota.getFechaNacimiento();
		String fechaRes = mascota.getFechaRescate();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date dateNacimiento = simpleDateFormat.parse(fechaNac);
		Date dateRescate = simpleDateFormat.parse(fechaRes);

		newMascota.setId(id);
		newMascota.setNombre(mascota.getNombre());
		newMascota.setFechaNacimieto(dateNacimiento);
		newMascota.setParticularidadesFisica(mascota.getParticularidadesFisicas());
		newMascota.setSexo(mascota.getSexo());
		newMascota.setFotoMascota(mascota.getFotoMascota());
		newMascota.setFechaRescate(dateRescate);
		newMascota.setLugarRescate(mascota.getLugarRescate());
		newMascota.setDescripcionRescate(mascota.getDescripcionRescate());
		newMascota.setEspecie(mascota.getEspecie());
		MascotaEstado estado = new MascotaEstado();
		estado = estadoService.findById((long) mascota.getEstado());

		newMascota.setEstado_mascota(estado);

		service.update(newMascota);

	}

	@Override
	public void deleteById(Long id) {
		service.deleteById(id);
	}

	@Override
	public List<MascotaDTO> findByNombre(String nombre) {
		return this.getListaMascotaDTO(service.findByNombre(nombre));
	}

	@Override
	public List<MascotaDTO> findBySexo(String sexo) {
		return this.getListaMascotaDTO(service.findBySexo(sexo));
	}

	// *******************************************************************************
	// ***************** Transfomración Entity a DTO
	// *********************************
	// *******************************************************************************

	public MascotaEstado getEstadoDTO(MascotaEstadoDTO newEstado) {
		MascotaEstado estado = new MascotaEstado();
		if (newEstado != null) {
			estado.setId(newEstado.getId());
			estado.setDescripcion(newEstado.getDescripcion());
		}
		return estado;
	}

	public List<MascotaDTO> getListaMascotaDTO(List<Mascota> listaMascotas) {
		List<MascotaDTO> listaMascotasDto = new ArrayList<MascotaDTO>();
		for (Mascota mascota : listaMascotas) {
			listaMascotasDto.add(this.getMascotaDto(mascota));
		}
		return listaMascotasDto;
	}

	public MascotaEstadoDTO getEstadoMascotaDTO(MascotaEstado entity) {
		MascotaEstadoDTO estadoDto = new MascotaEstadoDTO();
		if (entity != null) {
			estadoDto.setId(entity.getId());
			estadoDto.setDescripcion(entity.getDescripcion());
		}
		return estadoDto;
	}
}
