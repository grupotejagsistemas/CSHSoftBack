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
@Table(name = "movimientomonetario")
public class MovimientoMonetario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MOVIMIENTO_MONETARIO")
	private Long id_movimiento_monetario;

	@Column(name = "MONTO", nullable = false)
	private Double monto;

	@Column(name = "MEDIO", nullable = false, length = 50)
	private String medio;

	@Column(name = "FECHA", nullable = false, length = 50)
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name = "AUTOR", nullable = false, length = 20)
	private String autor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_MOVIMIENTO")
	private TipoMovimiento tipo_movimientos;

	public MovimientoMonetario() {

	}

	public Long getId_movimiento_monetario() {
		return id_movimiento_monetario;
	}

	public void setId_movimiento_monetario(Long id_movimiento_monetario) {
		this.id_movimiento_monetario = id_movimiento_monetario;
	}

	public TipoMovimiento getTipo_movimientos() {
		return tipo_movimientos;
	}

	public void setTipo_movimientos(TipoMovimiento tipo_movimientos) {
		this.tipo_movimientos = tipo_movimientos;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
