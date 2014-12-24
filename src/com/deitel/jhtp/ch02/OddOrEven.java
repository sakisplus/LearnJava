package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num, rest;

		System.out.print("Pease give me one int :");
		num = input.nextInt();

		rest = num % 2;

		if (rest == 0)
			System.out.printf("Rest is %d.\nThe number is Even", rest);
		if (rest != 0)
			System.out.printf("Rest is %d.\nThe number is Odd", rest);

	}

}
