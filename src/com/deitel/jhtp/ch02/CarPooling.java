package com.deitel.jhtp.ch02;

import java.util.Scanner;

public class CarPooling {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int dailyKm;
		double litCost, litPer100Km, dailyParkCost, dailyCustomCost, dailyFuelCost, dailyTotalCost;

		System.out
				.println("Give me some values and I'll tell you something very interesting!!!\n");

		System.out.print("How many km for your work per day ? : ");
		dailyKm = input.nextInt();
		System.out.print("The price for 1 liter fuel? : ");
		litCost = input.nextDouble();
		System.out.print("Your car's fuel consumption (lit/100Km) ? : ");
		litPer100Km = input.nextDouble();
		System.out.print("Your daily parking cost ? : ");
		dailyParkCost = input.nextDouble();
		System.out.print("And finaly your daily cucstoms cost ? : ");
		dailyCustomCost = input.nextDouble();

		dailyFuelCost = (dailyKm / (100 / litPer100Km)) * litCost;
		dailyTotalCost = dailyParkCost + dailyCustomCost + dailyFuelCost;

		System.out.println();

		System.out
				.printf("You spend daily %.2f euros for fuel, and if we add the cost for parking (%.2f euros) and for customs (%.2f euros)\n"
						+ "you spend daily %.2f for your movements! (%.2f weekly, %.2f monthly and %.2f euros yearly)\n"
						+ "Too match dont you think?\n\n", dailyFuelCost,
						dailyParkCost, dailyCustomCost, dailyTotalCost,
						(dailyTotalCost * 5), (dailyTotalCost * 20),
						(dailyTotalCost * 250));

		System.out
				.printf("What if you can share your car with other one, two, three or for people! take a look\n\n"
						+ "If you share your car with one people, your daily movement cost comes to %.2f, you save %.2f daily, %.2f weekly, %.2f monthly and %.2f euros yearly.\n"
						+ "If you share your car with two people, your daily movement cost comes to %.2f, you save %.2f daily, %.2f weekly, %.2f monthly and %.2f euros yearly.\n"
						+ "If you share your car with three people, your daily movement cost comes to %.2f, you save %.2f daily, %.2f weekly, %.2f monthly and %.2f euros yearly.\n"
						+ "If you share your car with four people, your daily movement cost comes to %.2f, you save %.2f daily, %.2f weekly, %.2f monthly and %.2f euros yearly.\n\n",
						(dailyTotalCost / 2), (dailyTotalCost / 2),
						((dailyTotalCost / 2) * 5),
						((dailyTotalCost / 2) * 20),
						((dailyTotalCost / 2) * 250), (dailyTotalCost / 3),
						((dailyTotalCost / 3) * 2),
						(((dailyTotalCost / 3) * 2) * 5),
						(((dailyTotalCost / 3) * 2) * 20),
						(((dailyTotalCost / 3) * 2) * 250),
						(dailyTotalCost / 4), ((dailyTotalCost / 4) * 3),
						(((dailyTotalCost / 4) * 3) * 5),
						(((dailyTotalCost / 4) * 3) * 20),
						(((dailyTotalCost / 4) * 3) * 250),
						(dailyTotalCost / 5), ((dailyTotalCost / 5) * 4),
						(((dailyTotalCost / 5) * 4) * 5),
						(((dailyTotalCost / 5) * 4) * 20),
						(((dailyTotalCost / 5) * 4) * 250));

		System.out
				.println("I belive that you should think about it, have a nice day.\n\n"
						+ "Notes. Assums that a working weekend have 5 days, a working month 20 days and a working year 250 days");

		input.close();

	}

}
