package com.deitel.jhtp.ch06;

public class MethodOverload {
	
	public void testOverloadMethods() {
		System.out.printf("Square of integer 7 is %d\n", square(7));
		System.out.printf("Square of double 7.7 is %.2f\n", square(7.5));
	}
	
	public int square(int intValue) {
		System.out.printf("\nCalled square with int argument: %d\n", intValue);
		return intValue * intValue;
	}
	
	public double square(double doubletValue) {
		System.out.printf("\nCalled square with int argument: %.2f\n", doubletValue);
		return doubletValue * doubletValue;
	}

}
