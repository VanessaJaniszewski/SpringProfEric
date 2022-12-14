package br.com.agenda.negocio;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class EstatisticaCompleto implements ImpleEstatistica{

	public EstatisticaCompleto () {
		System.out.println("USOU SEGUNDO METODO");
	}
	
	
	@Override
	public String reverse(String nome) {
		return nome;
	}

}
