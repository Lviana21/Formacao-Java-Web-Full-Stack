package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() � uma instancia (Cria��o de Objeto)*/
		/* aluno1 � uma referencia para o obejto aluno*/
		Aluno Aluno1 = new Aluno(); /*Aqui ser� Jo�o "ir� receber um valor qualquer"*/
		
		Aluno Aluno2 = new Aluno(); /*Aqui ser� Jo�o "ir� receber um valor qualquer"*/
		
		Aluno Aluno3 = new Aluno("Luciano");
		
		Aluno Aluno4 = new Aluno("Luciano", 30);
		
	}
}
