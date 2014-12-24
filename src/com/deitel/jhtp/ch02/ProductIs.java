package com.deitel.jhtp.ch02;

// Υπολογίζει το γινόμενο 3 ακεραίων

import java.util.Scanner; // Εισάγει την μέθοδο Scanner

public class ProductIs { // Product class open
	public static void main(String[] args) { // main method open

		Scanner input = new Scanner(System.in); // Set input to Scanner

		int x, y, z, result; // Var declaration

		System.out.print("Εισάγετε τον πρώτο ακέραιο: "); // User import
		x = input.nextInt(); // Διαβάζει τον πρώτο ακέραιο
		System.out.print("Εισάγετε τον δεύτερο ακέραιο: "); // User import
		y = input.nextInt(); // Διαβάζει τον δεύτερο ακέραιο
		System.out.print("Εισάγετε τον τρίτο ακέραιο: "); // User import
		z = input.nextInt(); // Διαβάζει τον τρίτο ακέραιο

		result = x * y * z; // Υπολογίζει το γινόμενο

		System.out.printf("Product is %d", result); // Print

	} // main method close
} // Product class close
