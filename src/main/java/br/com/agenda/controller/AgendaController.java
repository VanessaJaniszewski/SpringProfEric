package br.com.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.agenda.dto.ContatoRequestDTO;
import br.com.agenda.dto.ContatoResponseDTO;

//@Controller
//@RequestMapping("/agenda")
//public class AgendaController {
//	
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.POST, path ="/cadastrar")
//	public ContatoResponseDTO cadastrar(@RequestBody ContatoRequestDTO request) {
//		ContatoResponseDTO response = new ContatoResponseDTO();
//		response.setMensagem("Cadastro com sucesso de: "+request.getNome());
//		return response;
//	}
//
//	@GetMapping("/")
//	@ResponseBody
//	public String hello() {
//		return "Helloooo";
//	}
//	
//	@ResponseBody
//	@GetMapping("/pesquisar")
////	@RequestMapping(method= RequestMethod.GET, path ="/pesquisar")
//	public ContatoResponseDTO procurar() {
//		ContatoResponseDTO response = new ContatoResponseDTO();
//		response.setMensagem("Cadastro com sucesso!");
//		return response;
//	}
//}