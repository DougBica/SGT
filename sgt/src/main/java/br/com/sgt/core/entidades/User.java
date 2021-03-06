package br.com.sgt.core.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;

import com.sun.istack.NotNull;

import br.com.sgt.conhecimento.estidade.Conhecimento;
import br.com.sgt.core.enumerator.Status;
import br.com.sgt.formacao.entidade.Formacao;
import br.com.sgt.hitoricoTrabalho.entidade.HistoricoTrabalho;

@Entity
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
	@NotNull
	private String login;
	@NotNull
	private String senha;
	@NotNull @CPF
	private String cpf;
	@NotNull
	private String nome;
	private Integer idade;
	private String fotoPath;
	
	@Email
	private String email;
	
	@OneToMany
	private List<Conhecimento> conhecimentos;
	@OneToMany
	private List<Formacao> formacoes;
	@OneToMany
	private List<HistoricoTrabalho> historicoTrabalho;
	@OneToMany
	private List<Telefone> telefones;
	
	
	
	@Enumerated(EnumType.STRING)
	private Status status = Status.ATIVO;
	
	@ManyToMany 
	private List<Permissao> permissoes;
	
	
	
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
