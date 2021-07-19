package cursojava.executavel;

public class MatrizDeString {

	public static void main(String[] args) {

		String nomes[][] = new String[2][3];

		// Matriz 01
		nomes[0][0] = "Luciano";
		nomes[0][1] = "Jéssica";
		nomes[0][2] = "Lucas";

		// Matriz 02
		nomes[1][0] = "Patrícia";
		nomes[1][1] = "Fábio";
		nomes[1][2] = "Bruna";

		for (int posLinha = 0; posLinha < nomes.length; posLinha++) {
			for (int posColuna = 0; posColuna < nomes[posLinha].length; posColuna++) {
				System.out.println("Nomes da Matriz: " + nomes[posLinha][posColuna]);
			}
			System.out.println("--------------------------------------------------");
		}
	}

}
