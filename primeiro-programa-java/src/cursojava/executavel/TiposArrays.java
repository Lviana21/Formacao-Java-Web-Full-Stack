package cursojava.executavel;

import javax.swing.JOptionPane;

public class TiposArrays {
	
	public static void main(String[] args) {
		
		
		//##Array de String simples dados informados nas posições
		/*String[] nomes = new String[3];
		
		nomes[0] = "Luciano";
		nomes[1] = "Carlos";
		nomes[2] = "Marcos";
		
		for(int pos = 0; pos < nomes.length; pos++) {
			System.out.println(nomes[pos]);
		}*/
		
		
		//##Array de String, dados informado direto no Arry
		/*String[] nomes = {"Luciano","Carlos", "Marcos","Fabio"};
		
		for(int pos = 0; pos < nomes.length; pos++) {
			System.out.println(nomes[pos]);
		}*/
		
		
		//##Array de String dinâmico, entrada de dados dinâmica 
		String qtdNomes = JOptionPane.showInputDialog("Digite a quantidade de nomes!");

		String[] nomes = new String[Integer.parseInt(qtdNomes)];

		for (int pos = 0; pos < nomes.length; pos++) {
			String nome = JOptionPane.showInputDialog("Digite o " + (pos + 1) + "° Nome:");
			nomes[pos] = nome;
		}

		for (int pos = 0; pos < nomes.length; pos++) {
			System.out.println(nomes[pos]);
		}

	}

}
