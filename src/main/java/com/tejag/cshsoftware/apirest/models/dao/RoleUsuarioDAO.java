package com.tejag.cshsoftware.apirest.models.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tejag.cshsoftware.apirest.models.entity.RoleUsuario;

public interface RoleUsuarioDAO extends CrudRepository<RoleUsuario, Long> {

	@Query("from RoleUsuario re where re.usuario_id = :idUsuario")
	public RoleUsuario findByUsuario_id(Long idUsuario);
	
	@Modifying
	@Query("delete from RoleUsuario re where re.usuario_id=:id")
	public Integer deleteByIdUsuario(Long id);
	
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE roleusuario SET ID_ROLE = :idr WHERE ID = :id")
	public Integer update(Long idr, Long id);

}
