package com.deitel.jhtp.ch08;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel2 extends JPanel {
	
	Random randomNumbers = new Random();
	private MyOval[] ovals;
	private MyRectangle[] rectangles;
	
	public DrawPanel2() {
		setBackground(Color.WHITE);
		
		ovals = new MyOval[5 + randomNumbers.nextInt(5)];
		for (int count = 0; count <= ovals.length; count++ ) {
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			boolean filled = randomNumbers.nextBoolean();
			System.out.printf("%d -> %d, %d, %d, %d, %s, %b, %d, %d\n", count, x1, y1, x2, y2, color, filled, ovals.length, ovals[count]);
			ovals[count] = new MyOval(x1, y1, x2, y2, color, filled);
		}
		
		rectangles = new MyRectangle[1 + randomNumbers.nextInt(5)];
		for (int count = 1; count <= rectangles.length; count++ ) {
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			boolean filled = randomNumbers.nextBoolean();
			rectangles[count] = new MyRectangle(x1, y1, x2, y2, color, filled);
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (MyOval oval : ovals) {
			oval.draw(g);
		}
		for (MyRectangle rect : rectangles) {
			rect.draw(g);
		}
	}

}
