package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArryVetor {

	/* Usado para executar código */
	public static void main(String[] args) {

		// Arry de Notas
		double[] notas = { 8.8, 9.2, 7.6, 6.8 };
		double[] notasLogica = { 9.8, 7, 8.2, 7.9 };

		/* Criação dos alunos */
		// Aluno 01
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

		// -------------------------------------------------------------------------------
		/* Criação dos alunos */
		// Aluno 02
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Carlos");
		aluno2.setNomeEscola("UFU");

		/* Criação da disciplina */
		// Disciplina 01
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Sistemas");
		disciplina3.setNota(notas);
		aluno2.getDisciplinas().add(disciplina3);

		// Disciplina 02
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Estrutura de Dados");
		disciplina4.setNota(notasLogica);
		aluno2.getDisciplinas().add(disciplina4);

		// -------------------------------------------------------------------
		// Array de Alunos
		Aluno[] arrayDeAlunos = new Aluno[2];
		arrayDeAlunos[0] = aluno;
		arrayDeAlunos[1] = aluno2;

		for (int pos = 0; pos < arrayDeAlunos.length; pos++) {
			System.out.println("Nome do " + (pos + 1) + "º Aluno: " + arrayDeAlunos[pos].getNome());

			for (Disciplina discip : arrayDeAlunos[pos].getDisciplinas()) {
				System.out.println("Disciplina: " + discip.getDisciplina());

				for (int posNota = 0; posNota < discip.getNota().length; posNota++) {
					System.out.println("Nota " + (posNota + 1) + ": " + discip.getNota()[posNota]);
				}

			}
			System.out.println("\n");
		}

		/*
		 * System.out .println("Nome do aluno : " + aluno.getNome() + "\n" +
		 * "Inscrito na Escola : " + aluno.getNomeEscola());
		 * System.out.println("----------------Disciplina do Aluno-----------------");
		 * 
		 * for (Disciplina d : aluno.getDisciplinas()) {
		 * 
		 * System.out.println("Disciplina : " + d.getDisciplina());
		 * System.out.println("As Notas da da disciplina é: ");
		 * 
		 * double notaMax = 0.0; for (int pos = 0; pos < d.getNota().length; pos++) {
		 * System.out.println("Nota " + (pos + 1) + " é igual: " + d.getNota()[pos]);
		 * 
		 * // Descobrindo um menor valor dentro de um Arry if (pos == 0) { notaMax =
		 * d.getNota()[pos]; } else { if (d.getNota()[pos] < notaMax) { notaMax =
		 * d.getNota()[pos]; } }
		 * 
		 * } System.out.println("A menor nota da Disciplina: " + d.getDisciplina() +
		 * " é de valor: " + notaMax); }
		 */
	}

}
