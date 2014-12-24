package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class MinMaxInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, num3, num4, num5, min, max;

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

		min = max = num1;

		// find min
		if (min > num2)
			min = num2;
		if (min > num3)
			min = num3;
		if (min > num4)
			min = num4;
		if (min > num5)
			min = num5;

		// find max
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		if (max < num4)
			max = num4;
		if (max < num5)
			max = num5;

		System.out.printf("The min of them is %d and the max is %d", min, max);
	}

}