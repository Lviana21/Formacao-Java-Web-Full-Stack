package cursojava.interfaces;

/*Essa interface será nosso contrato de autenticação*/
public interface PermitirAcesso {

	// public boolean autenticar(); /*Apenas declaração do método*/
	public boolean autenticar(String login, String senha);

	public boolean autenticar();
//
}
