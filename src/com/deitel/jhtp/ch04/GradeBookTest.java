package com.deitel.jhtp.ch04;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		GradeBook gradeBook = new GradeBook("CS101 Introfuction to Java Programming!");
		
		System.out.printf("gradeBook1 course name is %s\n", gradeBook.getCourseName());
		
		
		System.out.print("Please enter the course name : ");
		String cName = input.nextLine();
		gradeBook.setCourseName(cName);
		System.out.println();
		
		gradeBook.displayMessage();
		gradeBook.determineClassAverage();
		

	}

}
