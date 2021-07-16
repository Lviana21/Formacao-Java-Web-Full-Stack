package cursojava.executavel;

public class Matriz {
	// Uma Matriz é um Array de um Array

	/* Executar o código Java */
	public static void main(String[] args) {

		int notas[][] = new int[2][3];

		// Matriz 01
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 76;

		// Matriz 02
		notas[1][0] = 60;
		notas[1][1] = 88;
		notas[1][2] = 75;

		// Percorre as linhas
		for (int posLinha = 0; posLinha < notas.length; posLinha++) {
			System.out.println("================================");
			// Para cada Linha percorre as colunas ARRAY
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println("Valor da matriz: " + notas[posLinha][posColuna]);
			}
		}
	}
}
