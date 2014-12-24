package com.deitel.jhtp.ch07;

public class EnhancedForTest {

	public static void main(String[] args) {
		
		int[] array = {87, 68, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		for (int number : array) {
			total += number;
		}
		System.out.printf("Total of array elements: %d\n", total);
		
		String[] array2 = {"la", "la", "laaaaaaaaaaaaaa"};
		String frace = "";
		for (String part : array2) {
			frace = frace + " " + part;  
		}
		System.out.printf("Total of array2 elements: %s\n", frace);
		
	}

}
