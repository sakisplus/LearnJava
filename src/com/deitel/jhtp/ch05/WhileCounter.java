package com.deitel.jhtp.ch05;

public class WhileCounter {

	public static void main(String[] args) {
		
		int counter = 1;
		
		while (counter <= 10) {
			System.out.printf ("%d ", counter);
			++counter;
		}
		
		System.out.println();
		System.out.printf ("%d ", counter);

	}

}
