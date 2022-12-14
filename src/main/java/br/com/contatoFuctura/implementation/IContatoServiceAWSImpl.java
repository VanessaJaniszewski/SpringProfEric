package br.com.contatoFuctura.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.com.agenda.dto.ContatoRequestDTO;
import br.com.contatoFuctura.service.IContatoService;
import br.com.contatoFuctura.service.Save;

@Primary
@Service
@Qualifier("IContatoServiceAWSImpl")
public class IContatoServiceAWSImpl implements IContatoService{

	
	private List<ContatoRequestDTO> contatos;
	
	public IContatoServiceAWSImpl() {
		this.contatos = new ArrayList<ContatoRequestDTO>();
	}
	
	@Override
	public ContatoRequestDTO save(ContatoRequestDTO contato){
		this.contatos.add(contato);
		System.out.println("contato salvo");
		System.out.println(contatos.get(0).getNome());
		System.out.println(contatos.get(0).getAltura());
		System.out.println(contatos.get(0).getIdade());
		Save save = new Save();
		try {
			save.write("Nome: "+contatos.get(0).getNome());
			save.write("Altura: "+contatos.get(0).getAltura().toString());
			save.write("Idade: "+contatos.get(0).getIdade().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contato;
		
	}

}
