package com.deitel.jhtp.ch08;

public class EmployeeTest2 {

	public static void main(String[] args) {
		
		System.out.printf("Employees before instantiation: %s\n", Employee2.getCount());
		
		Employee2 e1 = new Employee2("Susan", "Baker");
		Employee2 e2 = new Employee2("Bob", "Blue");
		
		System.out.println("\nEmployees after instantiation:");
		System.out.printf("via e1.getCount(): %d\n", e1.getCount());
		System.out.printf("via e2.getCount(): %d\n", e2.getCount());
		System.out.printf("via Employee2.getCount(): %d\n", Employee2.getCount());
		
		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
		
		e1 = null;
		e2 = null;
	}

}
