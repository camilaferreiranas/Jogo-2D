package classes;

import javax.swing.JFrame;

public class Principal {
	public static final int LARGURA_TELA = 640;
	public static final int ALTURA_TELA = 480;
	
public Principal() {//construtor 
	//nome da janela
	JFrame janela = new JFrame("Jogo");
	janela.setSize(LARGURA_TELA, ALTURA_TELA);
	janela.setResizable(false);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setLocation(100,100);
	janela.setVisible(true);
}

public static void main(String[] args) {
	new Principal();
}
}
