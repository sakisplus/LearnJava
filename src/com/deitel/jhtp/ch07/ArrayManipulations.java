package com.deitel.jhtp.ch07;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		
		double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		System.out.print("doubleArray: ");
		for (double value : doubleArray) {
			System.out.printf("%.1f ", value);
		}
		
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");
		
		int[] intArray = {1, 2, 3, 4, 5, 6};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("\n\nintArray %s intArrayCopy", (b ? "== (is equal)" : "!= (is not equal)"));
		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("\n\nintArray %s filledIntArray", (b ? "== (is equal)" : "!= (is not equal)"));
		
		int location = Arrays.binarySearch(intArray, 5);
		if (location >= 0) {
			System.out.printf("\n\nFound 5 at element %d in intArray", location);
		}
		else {
			System.out.println("\n\n5 not fount in intArray");
		}
		
		location = Arrays.binarySearch(intArray, 8763);
		if (location >= 0) {
			System.out.printf("\n\nFound 8763 at element %d in intArray\n", location);
		}
		else {
			System.out.printf("\n\n8763 not fount in intArray..%d", location);
		}
	}
	
	public static void displayArray(int[] array, String description) {
		System.out.printf("\n%s: ", description);
		for (int value : array) {
			System.out.printf("%d ", value);
		}
	}

}