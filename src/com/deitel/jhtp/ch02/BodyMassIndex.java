package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int weight, height;
		double mass;

		System.out.print("Please give me you weight : ");
		weight = input.nextInt();
		System.out.print("Please give me you height : ");
		height = input.nextInt();

		mass = (weight / Math.pow(height, 2)) * 10000;

		System.out.printf("\nYour BMI (Body Mass Insex) is %.1f", mass);

		System.out
				.print("\n\n"
						+ "******************************************************************\n"
						+ "Department of Health and Human Services/National Institutes of Healt\n\n"
						+ "BMI Values\n" + "Underwight: less than 18.5\n"
						+ "Normal: between 18.5 and 24.9\n"
						+ "Overweight: between 25 and 29.9\n"
						+ "Obese: 30 or greater");
	}

}
