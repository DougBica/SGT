package br.com.sgt.conhecimento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgt.conhecimento.dto.ConhecimentoDto;
import br.com.sgt.conhecimento.estidade.Conhecimento;
import br.com.sgt.conhecimento.repository.ConhecimentoRepository;
import br.com.sgt.conhecimento.rest.ConhecimentoRest;
import br.com.sgt.core.dto.UserDto;
import br.com.sgt.core.entidades.DadosLogin;
import br.com.sgt.core.entidades.User;
import br.com.sgt.error.EnCodException;
import br.com.sgt.error.ErroBancoDeDados;

@Service
public class ConhecimentoRestImp implements ConhecimentoRest{

	@Autowired
	ConhecimentoRepository conhecimentoRepository;
	

	@Override
	public List<ConhecimentoDto> listarConhecimentos(Long id) {
		List<Conhecimento> conhecimentos = Optional.ofNullable(conhecimentoRepository.findByUserId(id))
				.orElseThrow(() -> new ErroBancoDeDados(EnCodException.COD001));
			
		return ConhecimentoDto.converter(conhecimentos);
	}


}
