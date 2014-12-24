package com.deitel.jhtp.ch06;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawTargetRC extends JPanel {
	
	RandomColor color1 = new RandomColor();
	RandomColor color2 = new RandomColor();
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		for (int counter = 1; counter <= 9; counter++ ) {
			
			if (counter % 2 == 0) {
				g.setColor(color1.getColor);
			}
			else {
				g.setColor(color2.getColor);
			}
			
			g.fillOval(10 + (counter * 10), 10 + (counter * 10), 200 - (counter * 20), 200 - (counter * 20));

		}
		
	}

}
