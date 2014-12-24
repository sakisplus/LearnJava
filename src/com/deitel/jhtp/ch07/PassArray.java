package com.deitel.jhtp.ch07;

public class PassArray {

	public static void main(String[] args) {
		
		int[] myArray = {2, 4, 6, 8, 10};
		
		System.out.print("Effects of passing reference to entire array:\n"
				+ "The values of the original array are:");
		for (int value : myArray) {
			System.out.printf(" %d", value);
		}
		
		System.out.println();
		
		modifyArray(myArray);
		System.out.print("\nThe values after modifyArray() are:");
		for (int value : myArray) {
			System.out.printf(" %d", value);
		}
		System.out.println(" !!!");
		
		System.out.println();
		
		System.out.printf("\nEffects of passing array element value:\n"
				+ "myArray[3] before modifyElement(): %d\n", myArray[3]);
		modifyElement(myArray[3]);
		System.out.printf("myArray[3] after modifyElement(): %d\n", myArray[3]);
		System.out.println();
		myArray[3] = modifyElement2(myArray[3]);
		System.out.printf("myArray[3] after modifyElement2(): %d\n", myArray[3]);

	}
	
	public static void modifyArray(int tempArray[]) {
		
		for (int counter = 0; counter < tempArray.length; counter++) {
			tempArray[counter] *= 2;
		}
		System.out.print("The values of array in the modifyArray() are:");
		for (int value : tempArray) {
			System.out.printf(" %d", value);
		}
		
	}
	
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement(): %d\n", element);
	}
	
	public static int modifyElement2(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement2(): %d\n", element);
		return element;
	}

}
