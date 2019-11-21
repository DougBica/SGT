package br.com.sgt.formacao.entidade;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sgt.core.entidades.EnSituacao;


@Entity
public class Formacao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sequencial;
	
	private String nomeInstituicao;
	private String nomeCurso;
	private Integer qntSemestres;
	
	private LocalDate dtInicio;
	
	private LocalDate dtFim;
	
	@Enumerated(EnumType.STRING)
	private EnSituacao situacao;
	
	private Boolean isAtual;
	private String observacao;
	
	
	
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long sequencial) {
		this.sequencial = sequencial;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Integer getQntSemestres() {
		return qntSemestres;
	}

	public void setQntSemestres(Integer qntSemestres) {
		this.qntSemestres = qntSemestres;
	}

	public LocalDate getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}

	public LocalDate getDtFim() {
		return dtFim;
	}

	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}

	public EnSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(EnSituacao situacao) {
		this.situacao = situacao;
	}

	public Boolean getIsAtual() {
		return isAtual;
	}

	public void setIsAtual(Boolean isAtual) {
		this.isAtual = isAtual;
	}
	
	
	
}
