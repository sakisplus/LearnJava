// Εικόνα 11.6
// Ξετύλιγμα της στοίβας.

package com.deitel.jhtp.ch11;

public class UsingExceptions2 {

	public static void main(String[] args) {
		
		try {
			throwException();
		}
		catch (Exception exception) {
			System.err.println("Exception handled in main");
		}
	}
	
	public static void throwException() throws Exception {
		try {
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch (RuntimeException runtimeException) {
			System.err.println("Exception handled in method throwException");
		}
		finally {
			System.err.println("Finally is always executed");
		}
	}

}
