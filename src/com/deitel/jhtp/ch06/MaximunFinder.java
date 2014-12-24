package com.deitel.jhtp.ch06;

import java.util.Scanner;

public class MaximunFinder {
	
	public void determineMaximun() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter thre floating point values seperated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double result = maximun(number1, number2, number3);
		
		System.out.println("Maximun is: " + result);
		
	}
	
	public double maximun(double x, double y, double z) {
		
		return Math.max(x, Math.max(y, z));
	}

}
