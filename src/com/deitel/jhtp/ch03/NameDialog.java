package com.deitel.jhtp.ch03;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog ("What is your name?");
		
		String message = String.format("Hello %s.\nWelcome to Java Programming", name);
		
		JOptionPane.showMessageDialog(null, message);
		

	}

}
