package com.deitel.jhtp.ch07;

public class StudentPoll {

	public static void main(String[] args) {
		
		int[] responses = {90, 2, 6, 4, 8, 5, 9, 7, 98, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 4, 8, 6, 8, 10};
		int[] frequency = new int[11];
		
		for (int answer = 0; answer < responses.length; answer++) {
			if (responses[answer] > 0 && responses[answer] < frequency.length) {
				++frequency[responses[answer]];
			}
			else {
				++frequency[0];
			}
		}
		
		System.out.printf("%s%10s", "Rating", "Frequency");
		
		for (int rating = 1; rating < frequency.length; rating++) {
			System.out.printf("\n%5d%10d", rating, frequency[rating]);
		}
		System.out.printf("\nAnswers out of range: %d", frequency[0]);
		System.out.printf("\nTotal answers: %d", responses.length);
	}

}
