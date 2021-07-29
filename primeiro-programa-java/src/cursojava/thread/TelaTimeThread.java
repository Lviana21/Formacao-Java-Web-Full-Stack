package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); /* Painel de componentes */

	// Descrição de texto
	private JLabel descricaoHora = new JLabel("Time Thread 1");

	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time Thread 2");

	private JTextField mostraTempo2 = new JTextField();

	// Botão
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	// Thread 01
	// ---------------------------------------------------------------------------
	private Runnable thread1 = new Runnable() {
		@Override
		public void run() {
			while (true) {// Fica sempre rodando
				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};

	// Thread 02
	// ---------------------------------------------------------------------------

	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			while (true) {// Fica sempre rodando
				mostraTempo2
						.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:s").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};

	private Thread thread1Time;
	private Thread thread2Time;

	public TelaTimeThread() { /* Executa o que tiver dentro no momento da abertura ou execução */
		// Bloco de configurações iniciais
		setTitle("Minha tela de time com Thread"); // Titulo
		setSize(new Dimension(240, 240)); // Dimensão largura e altura da tela
		setLocationRelativeTo(null); // Centralizando a tela
		setResizable(false); // Travar a tela para não mudar o tamanho manual
		/* Primeira parte concluída */

		/* Controlador de posicionamento de componentes */
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		// Painel X e Y: https://prnt.sc/1gk2rvx
		gridBagConstraints.gridx = 0;// Linhas
		gridBagConstraints.gridy = 0;// Colunas
		gridBagConstraints.gridwidth = 2; // Largura - Quantidades de colunas
		gridBagConstraints.insets = new Insets(2, 10, 8, 6);// top, esquerda, baixo, direita
		gridBagConstraints.anchor = GridBagConstraints.WEST; // Posicionamento: alinhar a esquerda

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);

		// Botão------------------------------------------------------------------
		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);

		// Ação do botão--------------------------------------------------------

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {// Executa o clique no botão
				thread1Time = new Thread(thread1);
				thread1Time.start();

				thread2Time = new Thread(thread2);
				thread2Time.start();

				jButton.setEnabled(false);
				jButton2.setEnabled(true);

			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();

				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});

		jButton2.setEnabled(false);

		add(jPanel, BorderLayout.WEST);
		// Sempre será o último comando a ser executado
		setVisible(true)/* Torna a tela visil para o usuário */;
	}

}
