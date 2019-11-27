package br.com.sgt.conhecimento.rest;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgt.conhecimento.dto.ConhecimentoDto;

@RestController
@RequestMapping("/conhecimento")
@ResponseBody
@CrossOrigin
public interface ConhecimentoRest {
	
	
	@GetMapping(value = "/listar/{id}")
	public List<ConhecimentoDto> listarConhecimentos(@PathVariable Long id);
	

}
