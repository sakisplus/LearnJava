package com.deitel.jhtp.ch03;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double depositAmount, debitAmount;
		
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		System.out.printf("Account1 balance is %.2f€\n", account1.getBalance());
		System.out.printf("Account2 balance is %.2f€\n", account2.getBalance());
		
		System.out.print("Enter deposit amount for Account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to Account1 balance\n\n", depositAmount);
		account1.credit(depositAmount);
		
		System.out.printf("Account1 new balance is %.2f €\n", account1.getBalance());
		System.out.printf("Account2 new balance is %.2f €\n", account2.getBalance());
		
		System.out.print("Enter deposit amount for Account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to Account2 balance\n\n", depositAmount);
		account2.credit(depositAmount);
		
		System.out.print("Enter debit amount to earn money for Account1: ");
		debitAmount = input.nextDouble();
		System.out.printf("\ntrying to earn %.2f from Account1 balance\n\n", debitAmount);
		account1.debit(debitAmount);
		
		System.out.printf("Account1 new balance is %.2f €\n", account1.getBalance());
		System.out.printf("Account2 new balance is %.2f €\n", account2.getBalance());
		
		

	}

}
