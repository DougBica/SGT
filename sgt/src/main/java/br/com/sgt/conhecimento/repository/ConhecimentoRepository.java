package br.com.sgt.conhecimento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sgt.conhecimento.estidade.Conhecimento;

public interface ConhecimentoRepository extends JpaRepository<Conhecimento, Long> {
	
	
	public List<Conhecimento> findByUserId(Long id);

}
