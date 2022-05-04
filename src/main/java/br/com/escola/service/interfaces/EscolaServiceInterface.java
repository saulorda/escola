package br.com.escola.service.interfaces;

import java.util.List;
import br.com.escola.model.Escola;

public interface EscolaServiceInterface {
	
	public Escola obterEscola(Long id);
    public List<Escola> obterEscolas();
    public void gravarEscola(String nome);
    public Escola atualizarEscola(Long id,String nome);
    public void deleteEscola(Long id);

}
