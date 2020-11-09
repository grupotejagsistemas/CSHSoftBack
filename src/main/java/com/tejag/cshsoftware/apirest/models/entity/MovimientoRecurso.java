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
@Table(name = "movimientorecurso")
public class MovimientoRecurso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MOVIMIENTO_RECURSO")
	private Long id_movimiento_recurso;

	@Column(name = "FECHA", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name = "DONANTE", nullable = false)
	private String donante;

	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;

	@Column(name = "CANTIDAD", nullable = false)
	private String cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_MOVIMIENTO")
	private TipoMovimiento tipoMovimiento;

	public MovimientoRecurso() {

	}

	public Long getId_movimiento_recurso() {
		return id_movimiento_recurso;
	}

	public void setId_movimiento_recurso(Long id_movimiento_recurso) {
		this.id_movimiento_recurso = id_movimiento_recurso;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDonante() {
		return donante;
	}

	public void setDonante(String donante) {
		this.donante = donante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

}
