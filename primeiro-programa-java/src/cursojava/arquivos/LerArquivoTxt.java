package cursojava.arquivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LerArquivoTxt {

	public static void main(String[] args) throws Exception {

		// Entrada de dados
		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo.csv"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			// Imprimi linhas diferentes ou igual null e diferente de vazia
			if (linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
			
				
				pessoas.add(pessoa);
			}

		}

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		lerArquivo.close();
	}

}
