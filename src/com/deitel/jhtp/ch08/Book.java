package com.deitel.jhtp.ch08;

public enum Book {
	
	JHTP("Java How to Program", "2010"),
	CHTP("C How to Program", "2007"),
	IW3HTP("Internet & World Wide Web How to Program", "2008"),
	CPPHTP("C++ How to Program", "2008"),
	VBHTP("Visual Basic How to Program", "2009"),
	CSHARPFTP("Visual C# How to Program", "2009");
	
	private final String title, copyrightYear;
	
	Book(String bookTitle, String year) {
		title = bookTitle;
		copyrightYear = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCopyrightYear() {
		return copyrightYear;
	}
	
}
