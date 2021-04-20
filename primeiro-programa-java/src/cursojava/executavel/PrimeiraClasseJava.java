package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() é uma instancia (Criação de Objeto)*/
		/* aluno1 é uma referencia para o obejto aluno*/
		Aluno Aluno1 = new Aluno(); /*Aqui será João "irá receber um valor qualquer"*/
		Aluno1.nome = "Marcela";
		Aluno1.idade = 20;
		
		Aluno Aluno2 = new Aluno(); /*Aqui será João "irá receber um valor qualquer"*/
		Aluno2.nome = "Karol";
		Aluno2.idade = 19;
		
		System.out.println("As alunas que fazem inglês são: " + Aluno1.nome + " e " + Aluno2.nome + "\n" + 
		"Suas idades são: " + Aluno1.idade + " e " + Aluno2.idade);
		
		
		Aluno Aluno3 = new Aluno("Luciano");
		
		Aluno Aluno4 = new Aluno("Luciano", 30);
		
	}
}
