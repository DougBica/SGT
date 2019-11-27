package br.com.sgt.formacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgt.conhecimento.dto.ConhecimentoDto;
import br.com.sgt.conhecimento.estidade.Conhecimento;
import br.com.sgt.error.EnCodException;
import br.com.sgt.error.ErroBancoDeDados;
import br.com.sgt.formacao.entidade.Formacao;
import br.com.sgt.formacao.repository.FormacaoRepository;
import br.com.sgt.formacao.rest.FormacaoRest;

@Service
public class FormacaoRestImp implements FormacaoRest{

	@Autowired
	FormacaoRepository formacaoRepository;
	

	@Override
	public List<Formacao> listarFormacoes(Long id) {
		List<Formacao> formacoes = Optional.ofNullable(formacaoRepository.findByUserId(id))
				.orElseThrow(() -> new ErroBancoDeDados(EnCodException.COD001));
			
		return formacoes;
	}


}
