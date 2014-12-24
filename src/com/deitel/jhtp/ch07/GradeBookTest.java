package com.deitel.jhtp.ch07;

public class GradeBookTest {

	public static void main(String[] args) {
		
		int[][] gradesArray = {
				{5, 96, 70},
				{68, 87, 90},
				{94, 100, 90},
				{100, 18, 82},
				{83, 65, 85},
				{78, 28, 65},
				{85, 75, 53},
				{91, 94, 100},
				{36, 42, 84},
				{87, 93, 73}};
		String courseName = "CS101 Introduction to Java Programming";
		
		GradeBook2 myGradeBook = new GradeBook2(courseName, gradesArray);
		
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
		
		
	}

}
