package com.deitel.jhtp.ch07;

import javax.swing.JFrame;

public class DrawRainbowTest {

	public static void main(String[] args) {
		
		JFrame application = new JFrame();
		DrawRainbow panel = new DrawRainbow();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);
	}

}
