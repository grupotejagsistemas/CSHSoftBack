package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
			mascotaDto.setEstado(this.getEstadoMascotaDTO(entity.getEstado_mascota()));
		}
		return mascotaDto;
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

	@Override
	public MascotaDTO findById(Long id) {
		return this.getMascotaDto(service.findById(id));
	}

	@Override
	public void save(MascotaPostDTO mascota) {
		Mascota newMascota = new Mascota();

		newMascota.setNombre(mascota.getNombre());
		newMascota.setFechaNacimieto(mascota.getFechaNacimiento());
		newMascota.setParticularidadesFisica(mascota.getParticularidadesFisicas());
		newMascota.setSexo(mascota.getSexo());
		newMascota.setFotoMascota(mascota.getFotoMascota());
		newMascota.setFechaRescate(mascota.getFechaRescate());
		newMascota.setLugarRescate(mascota.getLugarRescate());
		newMascota.setDescripcionRescate(mascota.getDescripcionRescate());
		newMascota.setEspecie(mascota.getEspecie());
		
		MascotaEstado estado = new MascotaEstado();
		estado = estadoService.findById((long) mascota.getEstado());
		
		newMascota.setEstado_mascota(estado);
		service.save(newMascota);

	}

	public MascotaEstado getEstadoDTO(MascotaEstadoDTO newEstado) {
		MascotaEstado estado = new MascotaEstado();
		if (newEstado != null) {
			estado.setId(newEstado.getId());
			estado.setDescripcion(newEstado.getDescripcion());
		}
		return estado;
	}
	
	@Override
	public void update(Long id, MascotaPostDTO mascota) {
		Mascota newMascota = new Mascota();
		
		newMascota.setId(id);
		newMascota.setNombre(mascota.getNombre());
		newMascota.setFechaNacimieto(mascota.getFechaNacimiento());
		newMascota.setParticularidadesFisica(mascota.getParticularidadesFisicas());
		newMascota.setSexo(mascota.getSexo());
		newMascota.setFotoMascota(mascota.getFotoMascota());
		newMascota.setFechaRescate(mascota.getFechaRescate());
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

}
