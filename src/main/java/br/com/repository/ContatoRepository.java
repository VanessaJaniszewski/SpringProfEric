package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.dto.ContatoRequestDTO;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoRequestDTO, Integer>{
	
	

}
