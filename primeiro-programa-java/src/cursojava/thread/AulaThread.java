package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// ## THREAD ENVIO DE E-MAIL
		/* Thread processando em paralelo */
		//Transformando Thread em objeto manipulável 
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		// ## THREAD ENVIO DE NOTA FISCAL
		Thread threadNotafiscal = new Thread(thread2);
		threadNotafiscal.start();

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// Executa o que nós queremos
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

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
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

		}
	};

}