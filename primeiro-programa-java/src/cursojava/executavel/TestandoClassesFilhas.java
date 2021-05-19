package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Luciano Viana");
		aluno.setNomeEscola("LV Capital Trading");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("aesra234243");
		diretor.setNome("Luciano");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("099.491.900-60");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		
	}

}
