package com.deitel.jhtp.ch05;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		GradeBook gradeBook = new GradeBook("CS101 Introfuction to Java Programming!");
		gradeBook.inputGrades();
		gradeBook.displayGradeReport();
		

	}

}
