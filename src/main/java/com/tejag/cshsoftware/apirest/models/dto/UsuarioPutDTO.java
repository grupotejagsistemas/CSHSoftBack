package com.tejag.cshsoftware.apirest.models.dto;

public class UsuarioPutDTO {

	private String username;
	private Long idRole;

	public UsuarioPutDTO() {

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
