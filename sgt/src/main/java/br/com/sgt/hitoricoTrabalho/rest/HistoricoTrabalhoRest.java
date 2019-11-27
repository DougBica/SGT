package br.com.sgt.hitoricoTrabalho.rest;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgt.hitoricoTrabalho.entidade.HistoricoTrabalho;

@RestController
@RequestMapping("/historico")
@ResponseBody
@CrossOrigin
public interface HistoricoTrabalhoRest {
	
	
	@GetMapping(value = "/listar/{id}")
	public List<HistoricoTrabalho> listarConhecimentos(@PathVariable Long id);
	

}
