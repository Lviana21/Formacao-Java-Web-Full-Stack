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
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("099.491.900-60");
		secretario.setIdade(18);
		secretario.setNome("Pedro");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Sal�rio Aluno � = " + aluno.salario());
		System.out.println("Sal�rio Diretor � = " + diretor.salario());
		System.out.println("Sal�rio Secret�rio � = " + secretario.salario());

		/* Teste do m�todo teste */
		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	/* M�todo gen�rico - Trabahando com Polimorfismo */
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = " + pessoa.getNome() + " e o salario � de = " + pessoa.salario());
	}

}
