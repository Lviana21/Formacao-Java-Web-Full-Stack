package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			/* HashMap � uma forma de carregar dados e recuperar eles atravez de um valor */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			/*
			 * � uma lista que dentro dessa lista tem uma chave que identifica outra lista
			 */
			/*
			 * � uma lista que dentro dela temos uma chave que identifica uma sequ�nca de
			 * valores tamb�m
			 */

			for (int qtd = 1; qtd <= 5; qtd++) {

				/* 1� PASSAR OS DADOS "ENTRADA DE DADOS" */
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
				/*
				 * String idade = JOptionPane.showInputDialog("Idade do aluno?"); String
				 * dataNascimento = JOptionPane.showInputDialog("Data Nascimento?"); String
				 * identidade = JOptionPane.showInputDialog("RG?"); String numeroCpf =
				 * JOptionPane.showInputDialog("CPF?"); String nomeMae =
				 * JOptionPane.showInputDialog("Nome m�e?"); String nomePai =
				 * JOptionPane.showInputDialog("Nome do Pai?"); String dataMatricula =
				 * JOptionPane.showInputDialog("Data da matricula?"); String nomeEscola =
				 * JOptionPane.showInputDialog("Nome da escola?"); String serieMatriculado =
				 * JOptionPane.showInputDialog("Serie o aluno?");
				 */

				/* 2� INSTANCIAR OS OBJETOS */
				/* new Aluno() � uma instancia (Cria��o de Objeto) */
				/* aluno1 � uma refer�ncia para o objeto aluno */
				Aluno aluno1 = new Aluno(); /* Aqui ser� Jo�o "ir� receber um valor qualquer" */

				/* 3� PASSAR OS VALORES QUE VEIO DA ENTRADA DE DADOS PARA O OBJETO */
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

				/* ADICIONANDO DISCIPLINA UTILIZANDO LA�O DE REPETI��O */
				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

				/* REMOVENDO DISCIPLINA UTILIZANDO CONDI��O IF */
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

			/*
			 * Tem que ter a chave setada para o mapa de valores para poder recuperar dentro
			 * do for
			 */
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			/* 4� PROCESSAR E TER O RESULTADO FINAL */

			for (Aluno aluno : alunos) {/* Separei em listas */

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno); /* Reprovado */
				}

			}
			System.out.println("-------------------Lista dos aprovados---------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado = " + aluno.getNome() + " Status: " + aluno.getAlunoAprovado2()
						+ " com m�dia de = " + aluno.getMediaNota());
			}
			System.out.println("\n");

			System.out.println("-------------------Lista dos de recupera��o-----------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado = " + aluno.getNome() + " Status: " + aluno.getAlunoAprovado2()
						+ " com m�dia de = " + aluno.getMediaNota());
			}
			System.out.println("\n");

			System.out.println("-------------------Lista dos de Reprovados-------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado = " + aluno.getNome() + " Status: " + aluno.getAlunoAprovado2()
						+ " com m�dia de = " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Login ou Senha incorretos!!");
		}

	}
}
