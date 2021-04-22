package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() é uma instancia (Criação de Objeto)*/
		/* aluno1 é uma referencia para o obejto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será João "irá receber um valor qualquer"*/
		aluno1.setNome("João da silva");
		aluno1.setIdade(23);
		aluno1.setDataNascimento("01/03/1997");
		aluno1.setRegistroGeral("512.035.506");
		aluno1.setNumeroCpf("099.491.902-80");
		aluno1.setNomeMae("Débora");
		aluno1.setNomePai("Carlos");
		aluno1.setDataMatricula("10/10/2020");
		aluno1.setNomeEscola("Colegio Nascional Udi");
		aluno1.setSerieMatriculado("2° Grau");
		
		System.out.println("Nome: " + aluno1.getNome() + "\n" +
		"Idade: " + aluno1.getIdade() + "\n" + "Data Nascimento: " + aluno1.getDataNascimento() + "\n" + 
		"Registro Geral: " + aluno1.getRegistroGeral() + "\n" + "Número CPF: " + aluno1.getNumeroCpf() + "\n" +
		"Nome Mãe: " + aluno1.getNomeMae() + "\n" + "Nome Pai: " + aluno1.getNomePai() + "\n" +
		"Data da Matricula: " + aluno1.getDataMatricula() + "\n" + "Nome da Escola: " + aluno1.getNomeEscola() + "\n" + 
		"Série Matriculado: " + aluno1.getSerieMatriculado());
		
		/*================================================================================================================*/
		System.out.println("\n" + "--------------------------------------------------------------------------------------------------" + "\n");
		
		Aluno aluno2 = new Aluno(); /*Aqui será João "irá receber um valor qualquer"*/
		aluno2.setNome("Fernanda Souza");
		aluno2.setIdade(19);
		aluno2.setDataNascimento("01/03/2001");
		aluno2.setRegistroGeral("512.035.500");
		aluno2.setNumeroCpf("099.491.900-10");
		aluno2.setNomeMae("Francisca");
		aluno2.setNomePai("Douglas");
		aluno2.setDataMatricula("15/10/2020");
		aluno2.setNomeEscola("UFU - Udi");
		aluno2.setSerieMatriculado("9° Série");
		
		System.out.println("Nome: " + aluno2.getNome() + "\n" +
				"Idade: " + aluno2.getIdade() + "\n" + "Data Nascimento: " + aluno2.getDataNascimento() + "\n" + 
				"Registro Geral: " + aluno2.getRegistroGeral() + "\n" + "Número CPF: " + aluno2.getNumeroCpf() + "\n" +
				"Nome Mãe: " + aluno2.getNomeMae() + "\n" + "Nome Pai: " + aluno2.getNomePai() + "\n" +
				"Data da Matricula: " + aluno2.getDataMatricula() + "\n" + "Nome da Escola: " + aluno2.getNomeEscola() + "\n" + 
				"Série Matriculado: " + aluno2.getSerieMatriculado());
		
		/*================================================================================================================*/
		
		Aluno aluno3 = new Aluno("Luciano");
		
		Aluno aluno4 = new Aluno("Luciano", 30);
		
	}
}
