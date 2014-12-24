package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class MultipleOf {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, rest, times;

		System.out.println("Please give me two ints :");
		System.out.print("Int 1: ");
		num1 = input.nextInt();
		System.out.print("Int 2: ");
		num2 = input.nextInt();

		rest = num1 % num2;
		times = num1 / num2;

		if (rest == 0) {
			System.out.printf("Number %d is multiple of number %d\n", num1,
					num2);
			System.out.printf("As %d times of %d equals to %d", times, num2,
					num1);
		}
		if (rest != 0)
			System.out.printf("Number %d is NOT multiple of number %d", num1,
					num2);

	}

}
