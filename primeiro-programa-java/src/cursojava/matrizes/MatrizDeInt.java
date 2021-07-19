package cursojava.matrizes;

public class MatrizDeInt {

	public static void main(String[] args) {

		int notas[][] = new int[2][3];

		// Matriz 01
		notas[0][0] = 7;
		notas[0][1] = 8;
		notas[0][2] = 9;

		// Matriz 02
		notas[1][0] = 9;
		notas[1][1] = 10;
		notas[1][2] = 8;

		for (int posLinha = 0; posLinha < notas.length; posLinha++) {
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println("Valor da Matriz: " + notas[posLinha][posColuna]);
			}
			System.out.println("----------------------------------------------------");
		}

	}

}
