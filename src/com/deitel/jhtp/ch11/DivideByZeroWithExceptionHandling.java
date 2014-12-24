package com.deitel.jhtp.ch11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling{
	
	public static int quotient(int numerator, int denominator)
		throws ArithmeticException
	{
		return numerator / denominator;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean contiueLoop = true;
		
		do {
			try {
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
				
				contiueLoop = false;
			}
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine();
				System.out.println("You must enter integers. Please try again.\n");
			}
			catch (ArithmeticException ArithmeticException) {
				System.err.printf("\nException: %s\n", ArithmeticException);
				scanner.nextLine();
				System.out.println("Zero is an invalid denominator. Please try again.\n");
			}
		} while (contiueLoop);

	}

}
