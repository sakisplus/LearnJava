package com.deitel.jhtp.ch05;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
	
	private int choise;
	
	public Shapes(int userChoise) {
		choise = userChoise;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < 12; i++) {
			switch(choise) {
			case 1:
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 2:
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 3:
				g.drawOval(130 - i * 10, 130 - i * 10, 20 + i * 20, 20 + i * 20);
			}
		}	
	}
}
