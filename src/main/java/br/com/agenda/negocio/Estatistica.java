package br.com.agenda.negocio;

import org.springframework.stereotype.Service;

@Service
public class Estatistica implements ImpleEstatistica{

	public Estatistica() {
		System.out.println("--- Construtos de Estatística iniciado ---");
	}

	@Override
	public String reverse(String string) {
		return new StringBuilder(string).reverse().toString();	
		}
	


}
