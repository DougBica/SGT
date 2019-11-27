package br.com.sgt.core.rest;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgt.core.dto.UserDto;
import br.com.sgt.core.entidades.DadosLogin;

@RestController
@RequestMapping("/user")
@ResponseBody
@CrossOrigin
public interface UserRest {
	
	
	@GetMapping(value = "/listar/{id}")
	public UserDto listarUser(@PathVariable Long id);
	
	@GetMapping(value = "/buscar/{id}")
	public UserDto buscarUsuario(@PathVariable Long id);
	
	@PostMapping(value = "/aut")
	public UserDto autUser(@RequestBody DadosLogin dadosLogin);
}
