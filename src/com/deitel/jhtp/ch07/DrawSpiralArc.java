package com.deitel.jhtp.ch07;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSpiralArc extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int radius = 20;
		int lines = getWidth() / (radius * 2) - 5;
		int dist = radius ;
		int x1, y1, x2, y2;
		
		x1 = getWidth() / 2;
		y1 = getHeight() / 2;
		
		
		for (int count = 0; count <= lines; count++) {
			
			x2 = radius;
			y2 = radius;
			
			g.drawArc(x1, y1, x2 + radius, y2 + radius, 0, 180);
			g.drawArc(x1 - dist, y1 - (dist / 2), x2 + (radius + dist), y2 + (radius + dist), 0, -180);
			
			x1 -= dist;
			y1 -= dist;
			radius += dist;
		}
		
	}

}
