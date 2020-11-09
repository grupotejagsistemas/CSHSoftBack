package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long id;

	@Column(name = "NOMBRE_USUARIO", unique = true)
	private String username;

	@Column(name = "CONTRASENA")
	private String password;

	@Column(name = "EMAIL", unique = true)
	private String email;

	@Column(name = "ACTIVO")
	private Boolean enabled;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO")
	private String apellido;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "roleusuario", joinColumns = @JoinColumn(name = "ID_USUARIO"), inverseJoinColumns = @JoinColumn(name = "ID_ROLE"), uniqueConstraints = {
			@UniqueConstraint(columnNames = { "ID_USUARIO", "ID_ROLE" }) })
	private List<Role> roles;

	public Usuario() {

	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
