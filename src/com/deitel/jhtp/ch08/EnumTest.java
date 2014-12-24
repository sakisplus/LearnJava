package com.deitel.jhtp.ch08;

import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.print("All books:\n");
		
		for (Book book : Book.values()) {
			System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
		}
		
		System.out.print("\nDisplay a range of enum constants:\n");
		
		for (Book book : EnumSet.range(Book.JHTP, Book.VBHTP)) {
			System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
		}
		
	}

}
