package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fichamedica")
public class FichaMedica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FICHA_MEDICA")
	private Long id;

	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name = "DESPARASITACION", nullable = false, length = 2)
	private String desparasitacion;

	@Column(name = "PRODUCTO_DESPARASITACION", nullable = true, length = 50)
	private String productoDesparasitacion;

	@Column(name = "VACUNA", nullable = false, length = 2)
	private String vacuna;

	@Column(name = "NOMBRE_VACUNA", nullable = true, length = 50)
	private String nombreVacuna;

	@Column(name = "DIAGNOSTICO", nullable = false, length = 255)
	private String diagnostico;

	@Column(name = "TRATAMIENTO", nullable = false, length = 2)
	private String tratamiento;

	@Column(name = "DESCRIPCION_TRATAMIENTO", nullable = true, length = 50)
	private String descripcionTratamiento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MASCOTA")
	private Mascota mascotas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_VETERINARIA")
	private Veterinaria veterinarias;

	public FichaMedica() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDesparasitacion() {
		return desparasitacion;
	}

	public void setDesparasitacion(String desparasitacion) {
		this.desparasitacion = desparasitacion;
	}

	public String getProductoDesparasitacion() {
		return productoDesparasitacion;
	}

	public void setProductoDesparasitacion(String productoDesparasitacion) {
		this.productoDesparasitacion = productoDesparasitacion;
	}

	public String getVacuna() {
		return vacuna;
	}

	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}

	public String getNombreVacuna() {
		return nombreVacuna;
	}

	public void setNombreVacuna(String nombreVacuna) {
		this.nombreVacuna = nombreVacuna;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getDescripcionTratamiento() {
		return descripcionTratamiento;
	}

	public void setDescripcionTratamiento(String descripcionTratamiento) {
		this.descripcionTratamiento = descripcionTratamiento;
	}

	public Mascota getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota mascotas) {
		this.mascotas = mascotas;
	}

	public Veterinaria getVeterinarias() {
		return veterinarias;
	}

	public void setVeterinarias(Veterinaria veterinarias) {
		this.veterinarias = veterinarias;
	}

	

}
