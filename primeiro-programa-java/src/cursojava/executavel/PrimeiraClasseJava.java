package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		/* 1° PASSAR OS DADOS "ENTRADA DE DADOS" */
		String nome = JOptionPane.showInputDialog("Nome do aluno?");
		String idade = JOptionPane.showInputDialog("Idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento?");
		String identidade = JOptionPane.showInputDialog("RG?");
		String numeroCpf = JOptionPane.showInputDialog("CPF?");
		String nomeMae = JOptionPane.showInputDialog("Nome mãe?");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data da matricula?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola?");
		String serieMatriculado = JOptionPane.showInputDialog("Serie o aluno?");

		/* 2° INSTANCIAR OS OBJETOS */
		/* new Aluno() é uma instancia (Criação de Objeto) */
		/* aluno1 é uma referencia para o obejto aluno */
		Aluno aluno1 = new Aluno(); /* Aqui será João "irá receber um valor qualquer" */

		/* 3° PASSAR OS VALORES QUE VEIO DA ENTRADA DE DADOS PARA O OBJETO */
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(identidade);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(notaDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}

		/* 4° PROCESSAR E TER O RESULTADO FINAL */
		System.out.println(aluno1.toString()); /* Descrição do objeto na memória */
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}
}
