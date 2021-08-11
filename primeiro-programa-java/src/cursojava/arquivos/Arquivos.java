package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Luciano");
		pessoa1.setEmail("teste@gmail.com");
		pessoa1.setIdade(30);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Debora");
		pessoa2.setEmail("teste2@gmail.com");
		pessoa2.setIdade(25);

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Bruna");
		pessoa3.setEmail("teste3@gmail.com");
		pessoa3.setIdade(23);

		/* Pode vim do banco de dados ou de qualquer fonte de dados */
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		//Arquivo no formato TXT
		//File arquivo = new File("C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo.txt");
		File arquivo = new File("C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo.csv");

		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		//Escrever no arquivo
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);

		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + " ;" + p.getEmail() + " ;" + p.getIdade() + "\n");
		}

		escrever_no_arquivo.flush(); //Para persisitir as alterações utiliza o flush() 
		escrever_no_arquivo.close(); //Fechar o arquivo
	}

}
