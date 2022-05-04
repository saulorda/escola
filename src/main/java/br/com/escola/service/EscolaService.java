package br.com.escola.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.escola.model.Escola;
import br.com.escola.repository.EscolaRepository;
import br.com.escola.service.interfaces.EscolaServiceInterface;

@Service
public class EscolaService implements EscolaServiceInterface {

	@Autowired
	private EscolaRepository escolaRepository;
	
	public Escola obterEscola(Long id) {
		Optional<Escola> escolaRetorno = escolaRepository.findById(id);
		return escolaRetorno.get();
	}

	public List<Escola> obterEscolas() {
		List<Escola> escolasLista = escolaRepository.findAll(); 
		return escolasLista;
	}

	public void gravarEscola(String nome) {
		Escola escola = new Escola();
		escola.setNome(nome);
		escolaRepository.save(escola); 
	}

	public Escola atualizarEscola(Long id, String nome) {
		Optional<Escola> escolaRetorno = escolaRepository.findById(id);
		escolaRetorno.get().setNome(nome);
		Escola escolaRetornoSave = escolaRepository.save(escolaRetorno.get());
		return escolaRetornoSave;
	}

	public void deleteEscola(Long id) {
		Optional<Escola> escolaRetorno = escolaRepository.findById(id);
		escolaRepository.delete(escolaRetorno.get());
				
	}

}
