package com.deitel.jhtp.ch04;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel42b extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int lines, step, nWidth, nHeight;
		
		lines = 15;
		step = height / lines;
		nWidth = width / step;
		nHeight = height / step;
		
		while (lines > 0) {
			g.drawLine(0, nHeight, nWidth, height);
			g.drawLine(nWidth, 0, width, nHeight);
			g.drawLine(width, nHeight, width - nWidth, height);
			g.drawLine(0, height - nHeight, nWidth, 0);
			nWidth = nWidth + step;
			nHeight = nHeight + step;
			lines -= 1;
		}
		
	}

}
