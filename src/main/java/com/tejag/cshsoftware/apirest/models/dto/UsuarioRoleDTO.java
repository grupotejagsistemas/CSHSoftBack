package com.tejag.cshsoftware.apirest.models.dto;

public class UsuarioRoleDTO {

	private Long id; 
	private String username;
	private Long idRole;
	
	
	public UsuarioRoleDTO() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	} 
	
	
	
}
