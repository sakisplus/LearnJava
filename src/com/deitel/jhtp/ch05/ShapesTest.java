package com.deitel.jhtp.ch05;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangles\n" +
				"Enter 2 to draw ovals\n" +
				"Enter 3 to draw same center ovals");
		
		int choise = Integer.parseInt(input);
		
		Shapes panel = new Shapes(choise);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
		
	}

}
