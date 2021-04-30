package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		/*1� PASSAR OS DADOS "ENTRADA DE DADOS"*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String identidade = JOptionPane.showInputDialog("Qual a RG?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o n�mero do CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual serie o aluno est� matriculado?");
		
		
		
		/*2� INSTANCIAR OS OBJETOS*/
		/* new Aluno() � uma instancia (Cria��o de Objeto)*/
		/* aluno1 � uma referencia para o obejto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� Jo�o "ir� receber um valor qualquer"*/
		
		/*3� PASSAR OS VALORES QUE VEIO DA ENTRADA DE DADOS PARA O OBJETO*/
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
		
	    /*Intanciado 1� Disciplina*/
		Disciplina disciplina01 = new Disciplina();
		disciplina01.setDisciplina("Banco de Dados");
		disciplina01.setNota(9);
		
		/*Intanciado 2� Disciplina*/
		Disciplina disciplina02 = new Disciplina();
		disciplina02.setDisciplina("Java");
		disciplina02.setNota(8);
		
		/*Intanciado 3� Disciplina*/
		Disciplina disciplina03 = new Disciplina();
		disciplina03.setDisciplina("Matem�tica");
		disciplina03.setNota(9.5);
		
		/*Intanciado 4� Disciplina*/
		Disciplina disciplina04 = new Disciplina();
		disciplina04.setDisciplina("Neg�cios");
		disciplina04.setNota(10);
		
		/*Colocando as Disciplinas na lista*/
		aluno1.getDisciplinas().add(disciplina01);	
		aluno1.getDisciplinas().add(disciplina02);
		aluno1.getDisciplinas().add(disciplina03);
		aluno1.getDisciplinas().add(disciplina04);		
		
	
		
		/*================================================================================================================*/
		/*4� PROCESSAR E TER O RESULTADO FINAL*/
	    System.out.println(aluno1.toString()); /*Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
		
		
}
}

	
	
	
	