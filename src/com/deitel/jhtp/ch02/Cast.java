package com.deitel.jhtp.ch02;

public class Cast {

	public static void main(String[] args) {

		System.out.printf("The char %c has the numeric value %d\n", 'A',
				((int) 'A'));
		System.out.printf("The char %c has the numeric value %d\n", 'B',
				((int) 'B'));
		System.out.printf("The char %c has the numeric value %d\n", 'C',
				((int) 'C'));
		System.out.printf("The char %c has the numeric value %d\n", 'a',
				((int) 'a'));
		System.out.printf("The char %c has the numeric value %d\n", 'b',
				((int) 'b'));
		System.out.printf("The char %c has the numeric value %d\n", 'c',
				((int) 'c'));
		System.out.printf("The char %c has the numeric value %d\n", '1',
				((int) '1'));
		System.out.printf("The char %c has the numeric value %d\n", '2',
				((int) '2'));
		System.out.printf("The char %c has the numeric value %d\n", '0',
				((int) '0'));
		System.out.printf("The char %c has the numeric value %d\n", '$',
				((int) '$'));
		System.out.printf("The char %c has the numeric value %d\n", '*',
				((int) '*'));
		System.out.printf("The char %c has the numeric value %d\n", '+',
				((int) '+'));
		System.out.printf("The char %c has the numeric value %d\n", '/',
				((int) '/'));

		// Extra check for int (ex. 2.33)
		System.out.printf("The int for the %s is %d\n", "1.9999999999999",
				((int) 1.9999999999999));

	}

}
