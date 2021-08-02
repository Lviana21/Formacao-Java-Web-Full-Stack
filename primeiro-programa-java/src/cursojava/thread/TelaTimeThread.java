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
	private JLabel descricaoHora = new JLabel("Nome");

	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail");

	private JTextField mostraTempo2 = new JTextField();

	// Botão
	private JButton jButton = new JButton("Gerar Lote");
	private JButton jButton2 = new JButton("Stop");

	// Execução de processamento da Class ImplementacaoFilaThread
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

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
		gridBagConstraints.gridx = 0;// Colunas
		gridBagConstraints.gridy = 0;// Linhas
		gridBagConstraints.gridwidth = 2; // Largura - Quantidades de colunas
		gridBagConstraints.insets = new Insets(2, 10, 8, 6);// ajustar espaçamento "top, esquerda, baixo, direita"
		gridBagConstraints.anchor = GridBagConstraints.WEST; // Posicionamento: alinhar a esquerda

		descricaoHora.setPreferredSize(new Dimension(200, 25));// JLabel
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));// JTextField
		gridBagConstraints.gridy++;
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));// JLabel
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));// JTextField
		gridBagConstraints.gridy++;
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

				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}

				for (int qtd = 1; qtd <= 100; qtd++) {/* Simulando 100 envios em massa */

					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText() + " - " + qtd);

					fila.add(filaThread);
				}
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				fila.stop();
				fila = null;
			}
		});

		fila.start();
		add(jPanel, BorderLayout.WEST);
		// Sempre será o último comando a ser executado
		setVisible(true)/* Torna a tela visil para o usuário */;
	}

}
