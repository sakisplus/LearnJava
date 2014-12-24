// Εικόνα 11.7
// Μεθοδοι getMessage, getStackTrac και printStackTrace .

package com.deitel.jhtp.ch11;

public class UsingExceptions3 {

	public static void main(String[] args) {
		
		try {
			method1();
		}
		catch (Exception exception) {
			System.err.printf("%s\n\n", exception.getMessage());
			exception.printStackTrace();
			System.out.println("");
			
			StackTraceElement[] traceElements = exception.getStackTrace();
			
			for (StackTraceElement element : traceElements) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s\n", element.getMethodName());
			}
		}	
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		method3();
	}
	
	public static void method3() throws Exception  {
		throw new Exception("Exception thrown in method3");
	}
}
