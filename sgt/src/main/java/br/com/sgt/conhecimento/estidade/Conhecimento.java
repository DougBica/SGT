package br.com.sgt.conhecimento.estidade;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.com.sgt.core.enumerator.NivelConhecimento;

@Entity
public class Conhecimento {

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sequencial;
	
	@Enumerated(EnumType.STRING)
	private NivelConhecimento nivelConhecimento;
	
	@NotNull
	private String descricao;
	
	private String observacao;
	
	private Long userId;
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
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

	public NivelConhecimento getNivelConhecimento() {
		return nivelConhecimento;
	}

	public void setNivelConhecimento(NivelConhecimento nivelConhecimento) {
		this.nivelConhecimento = nivelConhecimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
	
}
