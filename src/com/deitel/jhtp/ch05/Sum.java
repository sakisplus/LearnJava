package com.deitel.jhtp.ch05;

public class Sum {

	public static void main(String[] args) {
		
		int total = 0;
		
		for (int number = 2; number <= 20; number += 2)
			total = total + number;
		
		System.out.printf("%d " , total);

	}

}
