package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() { /*Executa o que tiver dentro no momento da abertura ou execu��o*/
		
		//Bloco de configura��es iniciais
		setTitle("Minha tela de time com Thread"); //Titulo 
		setSize(new Dimension(240, 240)); //Dimens�o altura e largura
		setLocationRelativeTo(null); //Centralizando a tela
		setResizable(false); //Travar a tela para n�o mudar o tamanho manual
		/*Primeira parte conclu�da*/
		
		
		
		
		
		
		
		
		
		//Sempre ser� o �ltimo comando
		setVisible(true)/*Torna a tela visil para o usu�rio*/;
	}

}
