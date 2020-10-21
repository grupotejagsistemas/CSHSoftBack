package com.tejag.cshsoftware.apirest.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.VoluntarioMascota;

public interface VoluntarioMascotaDAO extends CrudRepository<VoluntarioMascota, Long> {

	public List<VoluntarioMascota> findByMascotasNombreContainingIgnoreCase(String nombre);

}
