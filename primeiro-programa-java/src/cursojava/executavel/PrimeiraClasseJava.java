package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() � uma instancia (Cria��o de Objeto)*/
		/* aluno1 � uma referencia para o obejto aluno*/
		Aluno Aluno1 = new Aluno(); /*Aqui ser� Jo�o "ir� receber um valor qualquer"*/
		Aluno1.nome = "Marcela";
		Aluno1.idade = 20;
		
		Aluno Aluno2 = new Aluno(); /*Aqui ser� Jo�o "ir� receber um valor qualquer"*/
		Aluno2.nome = "Karol";
		Aluno2.idade = 19;
		
		System.out.println("As alunas que fazem ingl�s s�o: " + Aluno1.nome + " e " + Aluno2.nome + "\n" + 
		"Suas idades s�o: " + Aluno1.idade + " e " + Aluno2.idade);
		
		
		Aluno Aluno3 = new Aluno("Luciano");
		
		Aluno Aluno4 = new Aluno("Luciano", 30);
		
	}
}
