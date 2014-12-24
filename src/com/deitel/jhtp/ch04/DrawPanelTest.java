package com.deitel.jhtp.ch04;

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		
		DrawPanel42b panel = new DrawPanel42b();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);		

	}

}
