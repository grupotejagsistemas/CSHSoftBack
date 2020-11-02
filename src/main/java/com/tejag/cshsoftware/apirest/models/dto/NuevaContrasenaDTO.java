package com.tejag.cshsoftware.apirest.models.dto;

public class NuevaContrasenaDTO {

	private String username;
	private String oldPass;
	private String newPass;

	public NuevaContrasenaDTO() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOldPass() {
		return oldPass;
	}

	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

}
