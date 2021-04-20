package cursojava.classes;

/*Essa � nossa classe/objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses s�o os atributos do Aluno que representa os dados do mundo real*/
	public String nome;
	public int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() {/*Cria os dados na mem�ria - Sendo padr�o do Java*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
