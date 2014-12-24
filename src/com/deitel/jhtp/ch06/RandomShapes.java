package com.deitel.jhtp.ch06;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class RandomShapes extends JPanel {
	
	Random randomNumber = new Random();
	RandomColor color = new RandomColor();
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for (int counter = 1; counter <= 10; counter++) {
			
			RandomColor color = new RandomColor();
			
			int shapeType = 0 + randomNumber.nextInt(2);
			int x = 0 + randomNumber.nextInt(getWidth());
			int y = 0 + randomNumber.nextInt(getHeight());
			int width = (0 + randomNumber.nextInt(getWidth())) / 2;
			int height = (0 + randomNumber.nextInt(getHeight())) / 2;
			
			if (shapeType == 0) {
				g.setColor(color.getColor);
				g.fillOval(x, y, width, height);
			}
			else {
				g.setColor(color.getColor);
				g.fillRect(x, y, width, height);
			}
			
			System.out.printf("%d ", counter);
		}
		
	}

}