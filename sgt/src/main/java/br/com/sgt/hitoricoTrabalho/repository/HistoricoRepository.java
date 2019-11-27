package br.com.sgt.hitoricoTrabalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sgt.hitoricoTrabalho.entidade.HistoricoTrabalho;

public interface HistoricoRepository extends JpaRepository<HistoricoTrabalho, Long>{
	
	List<HistoricoTrabalho> findByUserId(Long id);

}
