package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String identidade = JOptionPane.showInputDialog("Qual a identidade do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o n�mero do CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual serie o aluno est� matriculado?");
		String nota1 = JOptionPane.showInputDialog("Nota1?");
		String nota2 = JOptionPane.showInputDialog("Nota2?");
		String nota3 = JOptionPane.showInputDialog("Nota3?");
		String nota4 = JOptionPane.showInputDialog("Nota4?");
		
		/* new Aluno() � uma instancia (Cria��o de Objeto)*/
		/* aluno1 � uma referencia para o obejto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� Jo�o "ir� receber um valor qualquer"*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(identidade);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNota1(Double.valueOf(nota1));
		aluno1.setNota2(Double.valueOf(nota2));
		aluno1.setNota3(Double.valueOf(nota3));
		aluno1.setNota4(Double.valueOf(nota4));
		
		/*System.out.println("Nome: " + aluno1.getNome() + "\n" +
		"Idade: " + aluno1.getIdade() + "\n" + "Data Nascimento: " + aluno1.getDataNascimento() + "\n" + 
		"Registro Geral: " + aluno1.getRegistroGeral() + "\n" + "N�mero CPF: " + aluno1.getNumeroCpf() + "\n" +
		"Nome M�e: " + aluno1.getNomeMae() + "\n" + "Nome Pai: " + aluno1.getNomePai() + "\n" +
		"Data da Matricula: " + aluno1.getDataMatricula() + "\n" + "Nome da Escola: " + aluno1.getNomeEscola() + "\n" + 
		"S�rie Matriculado: " + aluno1.getSerieMatriculado());
		System.out.println("M�dia da Nota �: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));//Operador terminario: ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado2()));*/
		
		
		/*================================================================================================================*/
		
		System.out.println(aluno1.toString()); /*Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
		
		Aluno aluno3 = new Aluno("Luciano");
		
		Aluno aluno4 = new Aluno("Luciano", 30);
		
		
}
}

	
	
	
	