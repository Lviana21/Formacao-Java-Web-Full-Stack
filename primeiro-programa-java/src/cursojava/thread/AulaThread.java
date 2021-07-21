package cursojava.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		for (int pos = 0; pos < 10; pos++) {

			/*
			 * Quero executar esse envio com um tempo de parada, ou com um tempo determinado
			 */
			Thread.sleep(1000); // Utilizado para dar um tempo em código
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
		}
		System.out.println("CHEGOU AO FINM DO CÓDIGO DE TESTE DE THREAD");
	}

}
