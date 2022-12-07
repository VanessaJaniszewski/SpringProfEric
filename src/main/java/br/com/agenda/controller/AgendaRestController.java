package br.com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.dto.ContatoRequestDTO;
import br.com.agenda.dto.ContatoResponseDTO;
import br.com.agenda.negocio.ImpleEstatistica;

@RestController
@RequestMapping("/agenda")
public class AgendaRestController {
	
	@Autowired
	private ImpleEstatistica estatistica;

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
	
	@GetMapping("/inverter")
	public ContatoResponseDTO inverter() {
	ContatoResponseDTO response = new ContatoResponseDTO();
	var msg = estatistica.reverse("Testeeeee");
	response.setMensagem(msg);
	return response;
	}
	
	@GetMapping ("/inverter/completo")
	public ContatoResponseDTO inverterCompleto() {
		var msg = estatistica.reverse("Vanessa Janiszewski");
		var response = new ContatoResponseDTO();
		response.setMensagem(msg+ " Numero de chars: "+msg.length());
		return response; 
	}
}
