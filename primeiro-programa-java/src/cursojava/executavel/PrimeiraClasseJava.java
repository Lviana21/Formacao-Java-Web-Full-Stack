package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/*1° PASSAR OS DADOS "ENTRADA DE DADOS"*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String identidade = JOptionPane.showInputDialog("Qual a identidade do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o número do CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual serie o aluno está matriculado?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina1?");
		String nota1 = JOptionPane.showInputDialog("Nota1?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina2?");
		String nota2 = JOptionPane.showInputDialog("Nota2?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina3?");
		String nota3 = JOptionPane.showInputDialog("Nota3?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina4?");
		String nota4 = JOptionPane.showInputDialog("Nota4?");
		
		/*2° INSTANCIAR OS OBJETOS*/
		/* new Aluno() é uma instancia (Criação de Objeto)*/
		/* aluno1 é uma referencia para o obejto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será João "irá receber um valor qualquer"*/
		
		/*3° PASSAR OS VALORES QUE VEIO DA ENTRADA DE DADOS PARA O OBJETO*/
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
	
		
		
		
		
		
		/*System.out.println("Nome: " + aluno1.getNome() + "\n" +
		"Idade: " + aluno1.getIdade() + "\n" + "Data Nascimento: " + aluno1.getDataNascimento() + "\n" + 
		"Registro Geral: " + aluno1.getRegistroGeral() + "\n" + "Número CPF: " + aluno1.getNumeroCpf() + "\n" +
		"Nome Mãe: " + aluno1.getNomeMae() + "\n" + "Nome Pai: " + aluno1.getNomePai() + "\n" +
		"Data da Matricula: " + aluno1.getDataMatricula() + "\n" + "Nome da Escola: " + aluno1.getNomeEscola() + "\n" + 
		"Série Matriculado: " + aluno1.getSerieMatriculado());*/
		/*System.out.println("sMédia da Nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));//Operador terminario: ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado2()))*/
		
		
		/*================================================================================================================*/
		/*4° PROCESSAR E TER O RESULTADO FINAL*/
	    System.out.println(aluno1.toString()); /*Descrição do objeto na memória*/
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
		/*Equals e hashcode (Diferenciar e comparar objetos)*/
		
		
		/*Aluno aluno1 = new Aluno();
		aluno1.setNome("Luciano");
		aluno1.setNumeroCpf("1234");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Luciano");
		aluno2.setNumeroCpf("1234");
		/*Parar comparar objetos se são iguais tem que sobrescrever o método "equals hashCode"*/
		/*if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}*/
		
		
		
}
}

	
	
	
	