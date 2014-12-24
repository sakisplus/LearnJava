package com.deitel.jhtp.ch08;

public class Employee2 {
	
	private String firstName, lastName;
	private static int count = 0;

	public Employee2(String first, String last) {
		firstName = first;
		lastName = last;
		++count;
		System.out.printf("Employee constructor: %s %s; count = %d\n", firstName, lastName, count);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public static int getCount(){
		return count;
	}

}
