package br.com.sgt.core.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgt.core.dto.UserDto;

@RestController
@RequestMapping("/user")
@ResponseBody
public interface UserRest {
	
	
	@GetMapping(value = "/listar/{id}")
	public UserDto listarUser(@PathVariable Long id);
	
	

}
