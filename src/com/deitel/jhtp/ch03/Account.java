package com.deitel.jhtp.ch03;

import javax.swing.JOptionPane;

public class Account {
	
	private double balance;
	
	public Account(double initialBalance) {
		if (initialBalance > 0.0)
			balance = initialBalance;
	}
	
	public void credit(double amount) {
		balance = balance + amount;
	}
	
	public void debit(double amount) {
		if (amount <= balance)
			balance = balance - amount;
		if (amount > balance) {
			String message = String.format("Your account balance is %.2f, you van't take that you want", getBalance());
			JOptionPane.showMessageDialog(null, message);
		}
	}
	
	public double getBalance() {
		return balance;
	}

}
