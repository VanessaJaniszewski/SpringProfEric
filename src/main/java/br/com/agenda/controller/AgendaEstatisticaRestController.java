package br.com.agenda.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.dto.ContatoRequestDTO;
import br.com.agenda.dto.ContatoResponseDTO;

@RestController
@RequestMapping("/agenda/estatistica")
public class AgendaEstatisticaRestController {
	
	@PostMapping("/resumida")
	public ContatoResponseDTO resumida(@RequestBody ContatoRequestDTO request) {
		ContatoResponseDTO response = new ContatoResponseDTO();
		Integer numChars = request.getNome().length();
		StringBuilder nomeInvertido = new StringBuilder();
		String nome = request.getNome();
		for (int i =1; i<= nome.length(); i++) {
		nomeInvertido.append(nome.charAt(numChars-i));}
		response.setMensagem("Numero de characters: "+numChars+" Nome invertido: "+nomeInvertido);
		return response;
	}	
	

	@PostMapping("/completa")
	public ContatoResponseDTO completa(@RequestBody ContatoRequestDTO request) {
		ContatoResponseDTO response = new ContatoResponseDTO();
		Integer numChars = request.getNome().length();
		StringBuilder nomeInvertido = new StringBuilder();
		String nome = request.getNome();
		for (int i =1; i<= nome.length(); i++) {
		nomeInvertido.append(nome.charAt(numChars-i));}
		response.setMensagem("Numero de characters: "+numChars+" "
				+ "Nome invertido: "+nomeInvertido+" "
						+ "Dias vividos: "+request.getIdade()*365);
		return response;
	}	


}
