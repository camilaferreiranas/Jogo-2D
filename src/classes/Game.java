package classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Game extends JPanel {

	public Game() {
	setFocusable(true);
	setLayout(null);


	}
@Override
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	setBackground(Color.BLACK);
	g.setColor(Color.RED);
	//g.fillOval(100, 100, 50, 50);
	
}

}
