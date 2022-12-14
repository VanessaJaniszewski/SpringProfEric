package br.com.contatoFuctura.service;
import java.io.IOException;

import br.com.agenda.dto.ContatoRequestDTO;


public interface IContatoService{

	public ContatoRequestDTO save(ContatoRequestDTO contato) throws IOException;
	
}
