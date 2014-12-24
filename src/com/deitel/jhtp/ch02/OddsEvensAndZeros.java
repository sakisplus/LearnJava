package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class OddsEvensAndZeros {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, num3, num4, num5, odds = 0, evens = 0, zeros = 0;

		System.out.println("Enter 5 ints");
		System.out.print("Int 1: ");
		num1 = input.nextInt();
		System.out.print("Int 2: ");
		num2 = input.nextInt();
		System.out.print("Int 3: ");
		num3 = input.nextInt();
		System.out.print("Int 4: ");
		num4 = input.nextInt();
		System.out.print("Int 5: ");
		num5 = input.nextInt();

		// Check for odds
		if (num1 < 0)
			odds += 1;
		if (num2 < 0)
			odds += 1;
		if (num3 < 0)
			odds += 1;
		if (num4 < 0)
			odds += 1;
		if (num5 < 0)
			odds += 1;

		// Check for odds
		if (num1 > 0)
			evens += 1;
		if (num2 > 0)
			evens += 1;
		if (num3 > 0)
			evens += 1;
		if (num4 > 0)
			evens += 1;
		if (num5 > 0)
			evens += 1;

		zeros = 5 - odds - evens;

		// If user type 0 it will be ignored from the results.

		System.out.printf("You have enter %d odd, %d even and %d zero numbers",
				odds, evens, zeros);
	}

}
