package br.com.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.escola.model.Escola;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long >{

}
