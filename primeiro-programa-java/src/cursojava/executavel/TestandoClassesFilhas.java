package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Luciano Viana");
		aluno.setNomeEscola("LV Capital Trading");
		aluno.setIdade(21);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("aesra234243");
		diretor.setNome("Luciano");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("099.491.900-60");
		secretario.setIdade(18);
		secretario.setNome("Pedro");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Salário Aluno é = " + aluno.salario());
		System.out.println("Salário Diretor é = " + diretor.salario());
		System.out.println("Salário Secretário é = " + secretario.salario());

		/* Teste do método teste */
		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	/* Método genérico - Trabahando com Polimorfismo */
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salario é de = " + pessoa.salario());
	}

}
