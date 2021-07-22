package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// ## THREAD ENVIO DE E-MAIL
		/* Thread processando em paralelo */
		new Thread() {

			public void run() { // Executa o que nós queremos
				/* Código da rotina */

				/* Código da rotina eu quero executar em paralelo */
				for (int pos = 0; pos < 10; pos++) {

					/*
					 * Quero executar esse envio com um tempo de parada, ou com um tempo determinado
					 */
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // Utilizado para dar um tempo em código
					System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
				}
				/* Fim do código em paralelo */

				/* Código do sistema do usuário continua o fluxo de trabalho */

			};

		}.start();// Start liga a thread que fica processando paralelamente por trás

		// ## THREAD ENVIO DE NOTA FISCAL

		new Thread() {

			public void run() {

				for (int pos = 0; pos < 10; pos++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Executando alguma rotina, envio de nota fiscal");
				}
				System.out.println("CHEGOU AO FINM DO CÓDIGO DE TESTE DE THREAD");
			};

		}.start();

		/*
		 * Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal, algo do tipo
		 */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}
}