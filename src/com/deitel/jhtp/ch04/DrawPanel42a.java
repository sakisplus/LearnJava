package com.deitel.jhtp.ch04;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel42a extends JPanel{
	
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
			nWidth = nWidth + step;
			nHeight = nHeight + step;
			lines -= 1;
		}
		
	}

}
