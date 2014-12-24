package com.deitel.jhtp.ch08;

public class Employee {
	
	private String firstName, lastName;
	private Date birthDate, hireDate;

	public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
		firstName = first;
		lastName = last;
		birthDate = dateOfBirth;
		hireDate = dateOfHire;
	}
	
	public String toString() {
		return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
	}

}
