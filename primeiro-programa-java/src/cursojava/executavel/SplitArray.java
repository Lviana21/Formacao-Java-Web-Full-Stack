package cursojava.executavel;

public class SplitArray {

	public static void main(String[] args) {

		String texto = "Luciano,Curso Java,80,90,76,82";

		/*
		 * Split é utilizado para dividir uma String em pequenos pedaços, o
		 * método retorno um Array de Strings.
		 */
		String valorArray[] = texto.split(",");
		

		for (int pos = 0; pos < valorArray.length; pos++) {
			if (pos == 0) {
				System.out.println("Nome Aluno: " + valorArray[pos]);
			} else if (pos == 1) {
				System.out.println("Curso: " + valorArray[pos]);
			} else {
				System.out.println("Nota " + (pos - 1) + " : " + valorArray[pos]);
			}
		}
	}

}
