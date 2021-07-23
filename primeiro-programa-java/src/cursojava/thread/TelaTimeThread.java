package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() { /*Executa o que tiver dentro no momento da abertura ou execução*/
		
		//Bloco de configurações iniciais
		setTitle("Minha tela de time com Thread"); //Titulo 
		setSize(new Dimension(240, 240)); //Dimensão altura e largura
		setLocationRelativeTo(null); //Centralizando a tela
		setResizable(false); //Travar a tela para não mudar o tamanho manual
		/*Primeira parte concluída*/
		
		
		
		
		
		
		
		
		
		//Sempre será o último comando
		setVisible(true)/*Torna a tela visil para o usuário*/;
	}

}
