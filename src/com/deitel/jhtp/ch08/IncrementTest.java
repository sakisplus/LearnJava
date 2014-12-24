package com.deitel.jhtp.ch08;

public class IncrementTest {

	public static void main(String[] args) {
		
		Increment value = new Increment(5);
		Increment value2 = new Increment(22);
		
		System.out.printf("Before incrementing: %s\n\n", value);
		
		for (int i = 1; i <= 5; i++) {
			value.addIncrementToTotal();
			value2.addIncrementToTotal();
			System.out.printf("After incrementing %d: %s, %s\n\n", i, value, value2);
		}
		
		value = null;
		
	}

}
