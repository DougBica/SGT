package br.com.sgt.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgt.core.dto.UserDto;
import br.com.sgt.core.entidades.User;
import br.com.sgt.core.repository.UserRepository;
import br.com.sgt.core.rest.UserRest;
import br.com.sgt.error.ErroBancoDeDados;

@Service
public class UserRestImp implements UserRest{

	@Autowired
	UserRepository userRepository;
	
	public UserDto listarUser(Long id) {		
		User user = userRepository.findById(id).orElseThrow(() -> new ErroBancoDeDados("não encontrado usuario"));
		return UserDto.converter(user);
	}

}
