package com.deitel.jhtp.ch02;

public class WorldPopulation {

	public static void main(String[] args) {

		double popnow, rate, pop;
		popnow = 7.158;
		rate = 1.1;

		System.out
				.printf("The population now is %f bilions and the grow rate is %f persent per year so,\n",
						popnow, rate);
		System.out.printf("Next year %.3f bilions\n", pop = (popnow * rate));
		System.out.printf("In 2 years %.3f bilions\n", pop = (pop * rate));
		System.out.printf("In 3 years %.3f bilions\n", pop = (pop * rate));
		System.out.printf("In 4 years %.3f bilions\n", pop = (pop * rate));
		System.out.printf("In 5 years %.3f bilions\n", pop = (pop * rate));

	}

}
