package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super("Erro no processamento do arquivo ao processas as notas do aluno!! " + erro);
		
	}
}
