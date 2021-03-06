package br.com.sgt.core.dto;

import java.util.List;

import br.com.sgt.conhecimento.estidade.Conhecimento;
import br.com.sgt.core.entidades.Permissao;
import br.com.sgt.core.entidades.Telefone;
import br.com.sgt.core.entidades.User;
import br.com.sgt.core.enumerator.Status;
import br.com.sgt.formacao.entidade.Formacao;
import br.com.sgt.hitoricoTrabalho.entidade.HistoricoTrabalho;

public class UserDto {
	private Long id;
	private String nome;
	private Integer idade;
	private String fotoPath;
	private List<Conhecimento> conhecimentos;
	private List<Formacao> formacoes;
	private List<HistoricoTrabalho> historicoTrabalho;
	private List<Telefone> telefones;	
	private Status status ;
	private List<Permissao> permissoes;
	
	public UserDto() {}
	
	public UserDto(Long id,String nome, Integer idade, String fotoPath, List<Conhecimento> conhecimentos,
			List<Formacao> formacoes, List<HistoricoTrabalho> historicoTrabalho, List<Telefone> telefones,
			Status status, List<Permissao> permissoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.fotoPath = fotoPath;
		this.conhecimentos = conhecimentos;
		this.formacoes = formacoes;
		this.historicoTrabalho = historicoTrabalho;
		this.telefones = telefones;
		this.status = status;
		this.permissoes = permissoes;
	}
	
	public static UserDto converter(User user) {
		return new UserDto(user.getId(),user.getNome(),user.getIdade(),user.getFotoPath(),user.getConhecimentos(),
				user.getFormacoes(),user.getHistoricoTrabalho(),user.getTelefones(),
				user.getStatus(),user.getPermissoes());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getFotoPath() {
		return fotoPath;
	}
	public void setFotoPath(String fotoPath) {
		this.fotoPath = fotoPath;
	}
	public List<Conhecimento> getConhecimentos() {
		return conhecimentos;
	}
	public void setConhecimentos(List<Conhecimento> conhecimentos) {
		this.conhecimentos = conhecimentos;
	}
	public List<Formacao> getFormacoes() {
		return formacoes;
	}
	public void setFormacoes(List<Formacao> formacoes) {
		this.formacoes = formacoes;
	}
	public List<HistoricoTrabalho> getHistoricoTrabalho() {
		return historicoTrabalho;
	}
	public void setHistoricoTrabalho(List<HistoricoTrabalho> historicoTrabalho) {
		this.historicoTrabalho = historicoTrabalho;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public List<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
