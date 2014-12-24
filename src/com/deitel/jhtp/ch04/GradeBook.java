package com.deitel.jhtp.ch04;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	
	public GradeBook(String cName) {
		courseName = cName;
	}
	
	public void setCourseName(String name) {
		courseName = name;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void displayMessage() {
		System.out.printf("Welcome to the Grade Book for %s!\n\n", getCourseName());
	}
	
	public void determineClassAverage() {
		Scanner input = new Scanner(System.in);
		
		int total, gradeCounter, grade;
		double average;
		
		total = 0;
		grade = 0;
		gradeCounter = 1;
		
		System.out.println("Enter grade or -1 to quit");
		
		System.out.printf("Enter the 1st grade: ", gradeCounter);
		grade = input.nextInt();
		
		while (grade >= 0) {
			total = total + grade;
			gradeCounter += 1;
			System.out.printf("Enter grade %d: ", gradeCounter);
			grade = input.nextInt();
		}
		
		gradeCounter -= 1;
		average = (double) total / gradeCounter;
		
		if (gradeCounter == 1) {
			System.out.println("Only one grade was entered, no average for this class!");
		}
		else if (gradeCounter  >=0 ) {
			System.out.printf("\nTotal of all %d grades is %d\n", gradeCounter, total);
			System.out.printf("Class average is %.2f\n", average);
		}
		else {
			System.out.println("No grades were entered");
		}
		
	}

}
