package com.deitel.jhtp.ch05;

import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	
	private int total, gradeCounter, aCount, bCount, cCount, dCount, fCount;
	
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
	
	public void inputGrades() {
		
		Scanner input = new Scanner(System.in);
		
		int grade;
		
		System.out.printf("%s\n%s\n%s\n%s\n",
				"Enter the integer grades in the range 0-100",
				"Type the end-of-file indicator to determine input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d the press Enter",
				"On Windows type <Ctrl> z then press Enter");
		
		while (input.hasNext()) {
			grade = input.nextInt();
			total += grade;
			++gradeCounter;
			
			incrementLetterGradeCounter(grade);
		}
	}
	
	private void incrementLetterGradeCounter(int grade) {
		
		switch (grade / 10) {
		case 9:
		case 10:
			++aCount;
			break;
		case 8:
			++bCount;
			break;
		case 7:
			++cCount;
			break;
		case 6:
			++dCount;
			break;
		default:
			++fCount;
		}
	}
	
	public void displayGradeReport() {
		
		System.out.println("\nGrade Report:");
		
		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
			System.out.printf("Class average is %.2f\n", average);
			System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of students who received each grade:",
					"A: ", aCount,
					"B: ", bCount,
					"C: ", cCount,
					"D: ", dCount,
					"F: ", fCount);
		}
		else {
			System.out.println("No grades were entered");
		}
		
	}

}
