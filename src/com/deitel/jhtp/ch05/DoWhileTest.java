package com.deitel.jhtp.ch05;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int counter = 1;
		
		do {
			System.out.printf("%d ", counter);
			++counter;
		} while (counter <= 10);
		
		System.out.println();

	}

}
