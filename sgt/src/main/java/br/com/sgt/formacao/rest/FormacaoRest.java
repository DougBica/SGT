package br.com.sgt.formacao.rest;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgt.formacao.entidade.Formacao;

@RestController
@RequestMapping("/formacao")
@ResponseBody
@CrossOrigin
public interface FormacaoRest {
	
	
	@GetMapping(value = "/listar/{id}")
	public List<Formacao> listarFormacoes(@PathVariable Long id);
	
}
