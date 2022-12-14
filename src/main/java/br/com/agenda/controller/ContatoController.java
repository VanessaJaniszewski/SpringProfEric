package br.com.agenda.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.dto.ContatoRequestDTO;
import br.com.contatoFuctura.service.IContatoService;

@RestController
@RequestMapping("/contato")

public class ContatoController {
	
	@Autowired
	public ContatoController(IContatoService repository) {
		this.repository = repository;
	}

	
	private final IContatoService repository;

	/*
	 * C - create (POST)
	 * R - read (GET)
	 * U - update (PUT for all, or PATCH for parts)
	 * D - delete (DELETE)
	 */
	
	
//	@RequestMapping(path= "/cadastrar", method = RequestMethod.POST)
	@PostMapping("/cadastrar")
	
	public ResponseEntity<?> cadastrar(@Qualifier("IContatoServiceImpl")@RequestBody ContatoRequestDTO contato) throws IOException {
		repository.save(contato);
		return ResponseEntity.status(HttpStatus.CREATED).body(contato);
	}
}
