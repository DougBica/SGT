package br.com.sgt.formacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sgt.formacao.entidade.Formacao;

public interface FormacaoRepository extends JpaRepository<Formacao, Long>{
	
	
	List<Formacao> findByUserId(Long Id);

}
