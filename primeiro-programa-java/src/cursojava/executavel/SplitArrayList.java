package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArrayList {

	public static void main(String[] args) {

		String texto = "Luciano,Curso Java,80,90,76,82";

		/*
		 * Split � utilizado para dividir uma String em pequenos peda�os, o m�todo
		 * retorno um Array de Strings.
		 */
		String valorArray[] = texto.split(",");

		// Convertendo um Array em uma Lista
		List<String> list = Arrays.asList(valorArray);

		for (String valorLista : list) {
			System.out.println(valorLista);
		}

		// Convertendo uma Lista para Array
		String[] conversaoArray = list.toArray(new String[6]);

		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}

}
