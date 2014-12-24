package com.deitel.jhtp.ch07;

public class InitArray {

	public static void main(String[] args) {
		
		int array1[];
		array1 = new int[10];
		
		System.out.printf("%s%8s\n", "Index1", "Value");
		for (int counter = 0; counter < array1.length; counter++) {
			System.out.printf("%6d%8d\n", counter, array1[counter]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		int[] array2 = {32, 27, 64, 18, 95,14, 90, 70, 60, 37};
		
		System.out.printf("%s%8s\n", "Index2", "Value");
		for (int counter = 0; counter < array2.length; counter++) {
			System.out.printf("%6d%8d\n", counter, array2[counter]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		final int ARRAY_LENGTH = 10;
		int[] array3 = new int[ARRAY_LENGTH];
		
		for (int counter = 0; counter < array3.length; counter++) {
			array3[counter] = 2 + 2 * counter; 
		}
		System.out.printf("%s%8s\n", "Index3", "Value");
		for (int counter = 0; counter < array3.length; counter++) {
			System.out.printf("%6d%8d\n", counter, array3[counter]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

}