package com.tejag.cshsoftware.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.Mascota;

public interface MascotaDAO extends CrudRepository<Mascota, Long> {

}
