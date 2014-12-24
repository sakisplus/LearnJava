package com.deitel.jhtp.ch06;

import javax.swing.JFrame;

public class RandomShapesTest {

	public static void main(String[] args) {
		
		JFrame application = new JFrame();
		RandomShapes panel = new RandomShapes();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(800, 800);
		application.setVisible(true);
		
		
	}

}
