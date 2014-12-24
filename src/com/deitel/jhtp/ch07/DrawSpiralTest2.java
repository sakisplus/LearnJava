package com.deitel.jhtp.ch07;

import javax.swing.JFrame;

public class DrawSpiralTest2 {

	public static void main(String[] args) {
		
		DrawSpiralArc panel = new DrawSpiralArc();
		JFrame app = new JFrame();

		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(400, 400);
		app.setVisible(true);
		
	}

}