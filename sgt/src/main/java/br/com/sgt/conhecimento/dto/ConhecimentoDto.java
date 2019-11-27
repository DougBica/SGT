package br.com.sgt.conhecimento.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.sgt.conhecimento.estidade.Conhecimento;
import br.com.sgt.core.enumerator.NivelConhecimento;

public class ConhecimentoDto {
	
	private Long id;
	private Long sequencial;
	private NivelConhecimento nivelConhecimento;
	private String descricao;
	private String observacao;
	
	
	public ConhecimentoDto(Conhecimento con) {
		super();
		this.id = con.getId();
		this.sequencial = con.getSequencial();
		this.nivelConhecimento = con.getNivelConhecimento();
		this.descricao = con.getDescricao();
		this.observacao = con.getObservacao();
	}

	public static List<ConhecimentoDto> converter(List<Conhecimento> con) {
		return  con.stream().map(ConhecimentoDto:: new).collect(Collectors.toList());
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
