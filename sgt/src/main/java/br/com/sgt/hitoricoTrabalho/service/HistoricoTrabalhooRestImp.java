package br.com.sgt.hitoricoTrabalho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgt.conhecimento.dto.ConhecimentoDto;
import br.com.sgt.error.EnCodException;
import br.com.sgt.error.ErroBancoDeDados;
import br.com.sgt.hitoricoTrabalho.entidade.HistoricoTrabalho;
import br.com.sgt.hitoricoTrabalho.repository.HistoricoRepository;
import br.com.sgt.hitoricoTrabalho.rest.HistoricoTrabalhoRest;

@Service
public class HistoricoTrabalhooRestImp implements HistoricoTrabalhoRest{

	@Autowired
	HistoricoRepository historicoRepository;
	

	@Override
	public List<HistoricoTrabalho> listarConhecimentos(Long id) {
		List<HistoricoTrabalho> historico = Optional.ofNullable(historicoRepository.findByUserId(id))
				.orElseThrow(() -> new ErroBancoDeDados(EnCodException.COD001));
			
		return historico;
	}


}
