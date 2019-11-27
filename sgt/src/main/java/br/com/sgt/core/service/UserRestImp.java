package br.com.sgt.core.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgt.core.dto.UserDto;
import br.com.sgt.core.entidades.DadosLogin;
import br.com.sgt.core.entidades.User;
import br.com.sgt.core.repository.UserRepository;
import br.com.sgt.core.rest.UserRest;
import br.com.sgt.error.EnCodException;
import br.com.sgt.error.ErroBancoDeDados;

@Service
public class UserRestImp implements UserRest{

	@Autowired
	UserRepository userRepository;
	
	public UserDto listarUser(Long id) {		
		User user = userRepository.findById(id).orElseThrow(() -> new ErroBancoDeDados(EnCodException.COD002));
		return UserDto.converter(user);
	}

	@Override
	public UserDto autUser(DadosLogin dadosLogin) {
		User user = Optional.ofNullable(userRepository.findByLoginAndSenha(dadosLogin.getLogin(), dadosLogin.getSenha()))
				.orElseThrow(() -> new ErroBancoDeDados(EnCodException.COD001));
		return UserDto.converter(user);
	}

	@Override
	public UserDto buscarUsuario(Long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new ErroBancoDeDados(EnCodException.COD002));
		return UserDto.converter(user);
	}

}
