package br.com.agenda.negocio;

import org.springframework.stereotype.Component;

@Component
public class Estatistica {

	public Estatistica() {
		System.out.println("--- Construtos de Estatística iniciado ---");
	}
	
	
	public String inverse(String String) {
	return new StringBuilder(String).reverse().toString();	
	}
}
