package br.com.contatoFuctura.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import br.com.agenda.dto.ContatoRequestDTO;

public class Save {

	
		public void write(String contato) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));
		bw.write(contato.toString());
		bw.newLine();
		bw.close();
}}
