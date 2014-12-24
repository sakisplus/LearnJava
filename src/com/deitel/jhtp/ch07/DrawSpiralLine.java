package com.deitel.jhtp.ch07;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiralLine extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int length = 10;
		int lines = getWidth() / (length * 2) - 2;
		int distance = length; 
		int x1 = getWidth() / 2;
		int y1 = getHeight() / 2;
		int x2, y2;
		
		
		for (int count = 0; count <= lines; count++) {
			
			x2 = x1;
			y2 = y1 + length;
						
			g.drawLine(x1, y1, x2, y2);
			g.drawLine(x1, y1 + length, x2 - length, y2);
			
			length += distance;
			
			g.drawLine(x1 - (length - distance), y1 + (length - distance), x2 - (length - distance), y2 - length);
			g.drawLine(x1 - (length - distance), y1 - distance, x2 + distance, y2 - length);
			
			length += distance;
			
			x1 += distance;
			y1 -= distance;

		}
	}
}
