package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArryVetor {

	/* Usado para executar código */
	public static void main(String[] args) {

		// Arry de Notas
		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 9.5, 7, 8.2, 7.9 };

		/* Criação dos alunos */
		Aluno aluno = new Aluno();
		aluno.setNome("Luciano");
		aluno.setNomeEscola("Unitri");

		/* Criação da disciplina */
		// Disciplina 01
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		// Disciplina 02
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógia de Programação");
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);

	}

}
