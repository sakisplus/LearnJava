package com.deitel.jhtp.ch08;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval {
	
	private int x1, y1, x2, y2;
	private Color color;
	boolean filled;
	
	public MyOval(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
		this.filled = filled;
	}
	
	public int getUpperLeftX() {
		if (x1 <= x2) {
			return x1;
		}
		else {
			return x2;
		}
	}
	
	public int getUpperLeftY() {
		if (y1 <= y2) {
			return y1;
		}
		else {
			return y2;
		}
	}
	
	public int getWidth() {
		if (x1 <= x2) {
			return x2 - x1;
		}
		else {
			return x1 - x2;
		}
	}
	
	public int getHeight() {
		if (y1 <= y2) {
			return y2 - y1;
		}
		else {
			return y1 - y2;
		}
	}
	
	public void draw(Graphics g) {
		System.out.println("Check point");
		
		x1 = getUpperLeftX();
		y1 = getUpperLeftY();
		x2 = getWidth();
		y2 = getHeight();
		
		g.setColor(color);
		
		if (filled = true) {
			g.drawOval(x1, y1, x2, y2);
		}
		else {
			g.drawLine(x1, y1, x2, y2);
		}
	}
}