package cursojava.matrizes;

public class MatrizDeDouble {

	public static void main(String[] args) {

		double notas[][] = new double[2][3];

		// Matriz 01
		notas[0][0] = 7.8;
		notas[0][1] = 7.7;
		notas[0][2] = 9.5;

		// Matriz 02
		notas[1][0] = 8.0;
		notas[1][1] = 9.2;
		notas[1][2] = 8.4;

		for (int posLinha = 0; posLinha < notas.length; posLinha++) {
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println("Valor Matriz: " + notas[posLinha][posColuna]);
			}
			System.out.println("-------------------------------------------------");
		}
	}
}
