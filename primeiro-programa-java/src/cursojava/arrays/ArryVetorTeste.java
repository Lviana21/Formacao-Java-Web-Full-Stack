package cursojava.arrays;

import javax.swing.JOptionPane;

public class ArryVetorTeste {

	// Usando para executar c�digos
	public static void main(String[] args) {

		/* Array pode ser de todos os tipos de dados e objetos tamb�m */

		String posicoes = JOptionPane.showInputDialog("Quantas notas o Arry deve ter?");

		/* Array sempre deve ter a quantidade de posi��es definidas */

		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor Nota = " + (pos+1));
			notas[pos] = Double.valueOf(valor);
		}

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " = " + notas[pos]);
		}

		
	}

}
