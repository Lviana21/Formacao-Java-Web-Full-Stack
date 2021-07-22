package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// ## THREAD ENVIO DE E-MAIL
		/* Thread processando em paralelo */
		//Transformando Thread em objeto manipul�vel 
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		// ## THREAD ENVIO DE NOTA FISCAL
		Thread threadNotafiscal = new Thread(thread2);
		threadNotafiscal.start();

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// Executa o que n�s queremos
			/* C�digo da rotina */

			/* C�digo da rotina eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				 */
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // Utilizado para dar um tempo em c�digo
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
			}
			/* Fim do c�digo em paralelo */

			/* C�digo do sistema do usu�rio continua o fluxo de trabalho */

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
			System.out.println("CHEGOU AO FINM DO C�DIGO DE TESTE DE THREAD");

		}
	};

}