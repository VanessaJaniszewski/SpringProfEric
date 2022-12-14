package br.com.contatoFuctura.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.agenda.dto.ContatoRequestDTO;
import br.com.contatoFuctura.service.IContatoService;


@Service
@Qualifier("IContatoServiceImpl")
public class IContatoServiceImpl implements IContatoService{


	
	@Override
	public ContatoRequestDTO save(ContatoRequestDTO contato) {
		System.out.println("salvo");
		return contato;
	}

}
