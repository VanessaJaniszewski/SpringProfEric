package br.com.agenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.dto.ContatoRequestDTO;
import br.com.agenda.dto.ContatoResponseDTO;

@RestController
@RequestMapping("/agenda")
public class AgendaRestController {

	@PostMapping("/cadastrar")
	public ContatoResponseDTO cadastrar(@RequestBody ContatoRequestDTO request) {
		ContatoResponseDTO response = new ContatoResponseDTO();
		response.setMensagem("Cadastro com sucesso de: "+request.getNome());
		return response;
	}


	@GetMapping("/pesquisar")
	public ContatoResponseDTO procurar() {
		ContatoResponseDTO response = new ContatoResponseDTO();
		response.setMensagem("Cadastro com sucesso!");
		return response;
	}
	
	
	
}
