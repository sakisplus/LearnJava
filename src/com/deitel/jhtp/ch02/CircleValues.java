package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class CircleValues {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int radius;

		System.out.print("Please type the circle's radius (int): ");
		radius = input.nextInt();

		System.out.println();

		System.out
				.printf("You just tell me that the circle's radius is %d.\nSo circle's diammeter is %d\nit's region is %f\nand finaly it's area is %f",
						radius, 2 * radius, 2 * Math.PI * radius, Math.PI
								* (Math.pow(radius, 2)));

	}

}
