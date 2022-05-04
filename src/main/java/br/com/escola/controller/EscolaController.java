package br.com.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.escola.model.Escola;
import br.com.escola.service.interfaces.EscolaServiceInterface;

@RestController
@RequestMapping("/escolas")
public class EscolaController {
	
	@Autowired
	private EscolaServiceInterface servico;
	
	@GetMapping("/{id}")
	public Escola obterEscola (@PathVariable Long id){
		return servico.obterEscola(id);
	}
	@GetMapping
	public List<Escola> obterEscolas (){
		return servico.obterEscolas();
	}
	@PostMapping
	public void gravarEscola (@RequestParam(name = "nome") String nome){
		servico.gravarEscola(nome);
	}
	@PutMapping
	public Escola atualizarEscola (@RequestParam(name = "id") Long id, @RequestParam(name = "nome") String nome){
		return servico.atualizarEscola(id, nome);
	}
	@DeleteMapping
	public void apagarEscola (@RequestParam(name = "id") Long id){
		servico.deleteEscola(id);
	}
}
