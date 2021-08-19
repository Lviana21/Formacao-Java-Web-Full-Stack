package cursojava.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {

		Usuario usuario1 = new Usuario();
		usuario1.setCpf("999888567840");
		usuario1.setLogin("Viana");
		usuario1.setSenha("12345");
		usuario1.setNome("Luciano");
		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("9998887452");
		usuario2.setLogin("Débora");
		usuario2.setSenha("123");
		usuario2.setNome("Débora Silva");
		
		//Lista de usuários
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		//Organiza o JSON estruturado - Utilizado para organizar o código
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//Utilizando para estruturar os dados no formato JSON
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		//Escrevendo um arquivo no formato JSON
		FileWriter fileWriter = new FileWriter
				("C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\filjson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	}

}
