package com.deitel.jhtp.ch05;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Contitional AND (&&)",
				"false && false", (false && false),
				"false && true", (false && true),
				"true && false", (true && false),
				"true && true", (true && true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Contitional OR (||)",
				"false || false", (false || false),
				"false || true", (false || true),
				"true || false", (true || false),
				"true || true", (true || true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logiacal AND (&)",
				"false & false", (false & false),
				"false & true", (false & true),
				"true & false", (true & false),
				"true & true", (true & true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logiacal inclusive OR (|)",
				"false | false", (false | false),
				"false | true", (false | true),
				"true | false", (true | false),
				"true | true", (true | true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Boolean logiacal exclusive OR (^)",
				"false ^ false", (false ^ false),
				"false ^ true", (false ^ true),
				"true ^ false", (true ^ false),
				"true ^ true", (true ^ true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n",
				"Logiacal NOT (!)",
				"!false", (!false),
				"!true", (!true));

	}

}
