package com.deitel.jhtp.ch06;

import java.util.Random;

public class RandomIntegers {

	public static void main(String[] args) {
		
		Random randomNumbers = new Random();
		
		int face;
		
		for (int counter = 1; counter <= 30; counter++) {
			
			face = randomNumbers.nextInt(2);
			
			System.out.printf("%d ", face);
			if (counter % 5 == 0) {
				System.out.println();
			}
			
		}
		
	}

}
