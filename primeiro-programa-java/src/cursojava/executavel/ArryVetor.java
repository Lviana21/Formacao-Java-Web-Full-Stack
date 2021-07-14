package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArryVetor {

	/* Usado para executar c�digo */
	public static void main(String[] args) {

		// Arry de Notas
		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 9.5, 7, 8.2, 7.9 };

		/* Cria��o dos alunos */
		Aluno aluno = new Aluno();
		aluno.setNome("Luciano");
		aluno.setNomeEscola("Unitri");

		/* Cria��o da disciplina */
		// Disciplina 01
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);

		// Disciplina 02
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gia de Programa��o");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);

		System.out.println("------------------------Aluno----------------------");
		System.out
				.println("Nome do aluno : " + aluno.getNome() + "\n" + "Inscrito na Escola : " + aluno.getNomeEscola());
		System.out.println("----------------Disciplina do Aluno-----------------");

		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("As Notas da da disciplina �: ");

			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + " � igual: " + d.getNota()[pos]);
			}

		}
	}

}
