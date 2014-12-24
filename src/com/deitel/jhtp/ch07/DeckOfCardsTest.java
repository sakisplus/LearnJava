package com.deitel.jhtp.ch07;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		DeckOfCards myDeck = new DeckOfCards();
		
		System.out.println("Your new card pack:");
		for (int i = 1; i <=52; i++){
			System.out.printf("%d.%-25s", i, myDeck.dealCard());
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
		
		myDeck.shuffle();
		
		System.out.println("Your new card pack shuffled:");
		for (int i = 1; i <=52; i++){
			System.out.printf("%d.%-25s", i, myDeck.dealCard());
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
	}

}
