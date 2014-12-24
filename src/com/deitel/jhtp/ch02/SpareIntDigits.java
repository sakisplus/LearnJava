package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class SpareIntDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1;
		int d1, d2, d3, d4, d5;

		System.out.print("Please give me a number with 5 digits : ");
		num1 = input.nextInt();

		d1 = num1 / 10000;
		d2 = (num1 - (d1 * 10000)) / 1000;
		d3 = (num1 - (d1 * 10000) - (d2 * 1000)) / 100;
		d4 = (num1 - (d1 * 10000) - (d2 * 1000) - (d3 * 100)) / 10;
		d5 = (num1 - (d1 * 10000) - (d2 * 1000) - (d3 * 100) - (d4 * 10)) / 1;

		if (num1 <= 99999)
			System.out.printf("%d   %d   %d   %d   %d\n", d1, d2, d3, d4, d5);
		if (num1 < 10000)
			System.out
					.printf("\nYou'd enter a number whith less than 5 didigts\nso i replace the missing digits with 0.");
		if (num1 > 99999)
			System.out
					.println("\nPlease give me a number with 5 digits, restart the app to go on.");

	}

}
