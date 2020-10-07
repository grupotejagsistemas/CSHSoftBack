package com.tejag.cshsoftware.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.MascotaEstado;

public interface EstadoMascotaDAO extends CrudRepository<MascotaEstado, Long> {

}
