package com.tejag.cshsoftware.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "entrevistaadoptante")
public class EntrevistaAdoptante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENTREVISTA_ADOPTANTE")
	private Long id_entrevista_adoptante;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ADOPTANTE")
	private Adoptante adoptantes;

	@Column(name = "RESPUESTA1", nullable = false, length = 255)
	private String respuesta1;

	@Column(name = "RESPUESTA2", nullable = false, length = 255)
	private String respuesta2;

	@Column(name = "RESPUESTA3", nullable = false, length = 255)
	private String respuesta3;

	@Column(name = "RESPUESTA4", nullable = false, length = 255)
	private String respuesta4;

	@Column(name = "RESPUESTA5", nullable = false, length = 255)
	private String respuesta5;

	@Column(name = "RESPUESTA6", nullable = false, length = 255)
	private String respuesta6;

	@Column(name = "RESPUESTA7", nullable = false, length = 255)
	private String respuesta7;

	@Column(name = "RESPUESTA8", nullable = false, length = 255)
	private String respuesta8;

	@Column(name = "RESPUESTA9", nullable = false, length = 255)
	private String respuesta9;

	@Column(name = "RESPUESTA10", nullable = false, length = 255)
	private String respuesta10;

	@Column(name = "RESPUESTA11", nullable = false, length = 255)
	private String respuesta11;

	@Column(name = "RESPUESTA12", nullable = false, length = 255)
	private String respuesta12;

	@Column(name = "RESPUESTA13", nullable = false, length = 255)
	private String respuesta13;

	@Column(name = "RESPUESTA14", nullable = false, length = 255)
	private String respuesta14;

	@Column(name = "RESPUESTA15", nullable = false, length = 255)
	private String respuesta15;

	@Column(name = "RESPUESTA16", nullable = false, length = 255)
	private String respuesta16;

	@Column(name = "RESPUESTA17", nullable = false, length = 255)
	private String respuesta17;

	@Column(name = "RESPUESTA18", nullable = false, length = 255)
	private String respuesta18;

	@Column(name = "RESPUESTA19", nullable = false, length = 255)
	private String respuesta19;

	@Column(name = "RESPUESTA20", nullable = false, length = 255)
	private String respuesta20;

	@Column(name = "RESPUESTA21", nullable = false, length = 255)
	private String respuesta21;


	public EntrevistaAdoptante() {

	}

	public Long getId_entrevista_adoptante() {
		return id_entrevista_adoptante;
	}

	public void setId_entrevista_adoptante(Long id_entrevista_adoptante) {
		this.id_entrevista_adoptante = id_entrevista_adoptante;
	}

	public Adoptante getAdoptantes() {
		return adoptantes;
	}

	public void setAdoptantes(Adoptante adoptantes) {
		this.adoptantes = adoptantes;
	}

	public String getRespuesta1() {
		return respuesta1;
	}

	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getRespuesta3() {
		return respuesta3;
	}

	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	public String getRespuesta4() {
		return respuesta4;
	}

	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}

	public String getRespuesta5() {
		return respuesta5;
	}

	public void setRespuesta5(String respuesta5) {
		this.respuesta5 = respuesta5;
	}

	public String getRespuesta6() {
		return respuesta6;
	}

	public void setRespuesta6(String respuesta6) {
		this.respuesta6 = respuesta6;
	}

	public String getRespuesta7() {
		return respuesta7;
	}

	public void setRespuesta7(String respuesta7) {
		this.respuesta7 = respuesta7;
	}

	public String getRespuesta8() {
		return respuesta8;
	}

	public void setRespuesta8(String respuesta8) {
		this.respuesta8 = respuesta8;
	}

	public String getRespuesta9() {
		return respuesta9;
	}

	public void setRespuesta9(String respuesta9) {
		this.respuesta9 = respuesta9;
	}

	public String getRespuesta10() {
		return respuesta10;
	}

	public void setRespuesta10(String respuesta10) {
		this.respuesta10 = respuesta10;
	}

	public String getRespuesta11() {
		return respuesta11;
	}

	public void setRespuesta11(String respuesta11) {
		this.respuesta11 = respuesta11;
	}

	public String getRespuesta12() {
		return respuesta12;
	}

	public void setRespuesta12(String respuesta12) {
		this.respuesta12 = respuesta12;
	}

	public String getRespuesta13() {
		return respuesta13;
	}

	public void setRespuesta13(String respuesta13) {
		this.respuesta13 = respuesta13;
	}

	public String getRespuesta14() {
		return respuesta14;
	}

	public void setRespuesta14(String respuesta14) {
		this.respuesta14 = respuesta14;
	}

	public String getRespuesta15() {
		return respuesta15;
	}

	public void setRespuesta15(String respuesta15) {
		this.respuesta15 = respuesta15;
	}

	public String getRespuesta16() {
		return respuesta16;
	}

	public void setRespuesta16(String respuesta16) {
		this.respuesta16 = respuesta16;
	}

	public String getRespuesta17() {
		return respuesta17;
	}

	public void setRespuesta17(String respuesta17) {
		this.respuesta17 = respuesta17;
	}

	public String getRespuesta18() {
		return respuesta18;
	}

	public void setRespuesta18(String respuesta18) {
		this.respuesta18 = respuesta18;
	}

	public String getRespuesta19() {
		return respuesta19;
	}

	public void setRespuesta19(String respuesta19) {
		this.respuesta19 = respuesta19;
	}

	public String getRespuesta20() {
		return respuesta20;
	}

	public void setRespuesta20(String respuesta20) {
		this.respuesta20 = respuesta20;
	}

	public String getRespuesta21() {
		return respuesta21;
	}

	public void setRespuesta21(String respuesta21) {
		this.respuesta21 = respuesta21;
	}

}
