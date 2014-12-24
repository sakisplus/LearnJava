package com.deitel.jhtp.ch06;

import javax.swing.JFrame;

public class DrawTrargetRCTest {

	public static void main(String[] args) {
		
		JFrame application = new JFrame();
		DrawTargetRC panel = new DrawTargetRC();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(250, 250);
		application.setVisible(true);
		application.add(panel);

	}

}
