package com.deitel.jhtp.ch02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum;

		number1 = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the first number"));
		number2 = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the second number"));

		System.out.printf("You have enter %d + %d\n", number1, number2);

		sum = number1 + number2;

		System.out.printf("Sum is %d\n", sum);
		// or
		System.out.printf("Sum is %d\n", (number1 + number2));
		// or
		System.out.printf("Sum is %d", number1 + number2);

	}
}