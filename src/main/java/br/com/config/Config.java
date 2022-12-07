package br.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.agenda.negocio.Estatistica;

@Configuration
public class Config {
	
	
	@Bean
	public Estatistica getEstatistica() {
		return new Estatistica();
	}
	@Bean
	public StringBuffer getStringBuffer() {
		return new StringBuffer();	}

	//note que aqui criamos um bean de uma biblioteca de terceiros
	// serve para quando não temos acesso à classe/código
	// então não podemos utilizar o @component na classe
	// podemos entrar criar uma class Config, criar métodos que chamado e 
	//retornam classes e tornamos esses métodos beans
	
	
}
