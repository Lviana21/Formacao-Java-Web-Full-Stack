package cursojava.arquivos;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		// Entrada de dados
		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\Luciano Viana\\git\\Formacao-Java-Web-Full-Stack\\primeiro-programa-java\\src\\cursojava\\arquivos\\arquivo.txt"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			// Imprimi linhas diferentes ou igual null e diferente de vazia
			if (linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}

		}

		lerArquivo.close();
	}

}
