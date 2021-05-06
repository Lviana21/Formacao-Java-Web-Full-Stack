package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* 1° PASSAR OS DADOS "ENTRADA DE DADOS" */
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Idade do aluno?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data Nascimento?"); String
			 * identidade = JOptionPane.showInputDialog("RG?"); String numeroCpf =
			 * JOptionPane.showInputDialog("CPF?"); String nomeMae =
			 * JOptionPane.showInputDialog("Nome mãe?"); String nomePai =
			 * JOptionPane.showInputDialog("Nome do Pai?"); String dataMatricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String nomeEscola =
			 * JOptionPane.showInputDialog("Nome da escola?"); String serieMatriculado =
			 * JOptionPane.showInputDialog("Serie o aluno?");
			 */

			/* 2° INSTANCIAR OS OBJETOS */
			/* new Aluno() é uma instancia (Criação de Objeto) */
			/* aluno1 é uma referência para o objeto aluno */
			Aluno aluno1 = new Aluno(); /* Aqui será João "irá receber um valor qualquer" */

			/* 3° PASSAR OS VALORES QUE VEIO DA ENTRADA DE DADOS PARA O OBJETO */
			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento);
			 * aluno1.setRegistroGeral(identidade); aluno1.setNumeroCpf(numeroCpf);
			 * aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
			 * aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setSerieMatriculado(serieMatriculado);
			 * aluno1.setNomeEscola(nomeEscola);
			 */

			/* ADICIONANDO DISCIPINA UTILIZANDO LAÇO DE REPETIÇÃO */
			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			/* REMOVENDO DISCIPLINA UTILIZANDO CONDIÇÃO IF */
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {/* SIM e Zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}

			}

			alunos.add(aluno1);
		}

		/* 4° PROCESSAR E TER O RESULTADO FINAL */
		for (Aluno aluno : alunos) {
			/*Encontrando aluno na lista*/
			if (aluno.getNome().equalsIgnoreCase("Luciano")) {
				System.out.println(aluno.toString()); /* Descrição do objeto na memória */
				System.out.println("Média do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("-------------------------------------------------------------------------------------------");
				break;

			}

		}

	}
}
