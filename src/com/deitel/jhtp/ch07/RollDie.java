package com.deitel.jhtp.ch07;

import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		
		Random randomNumbers = new Random();
		
		int[] freq = new int[7];
		
		for (int roll = 1; roll <= 6000; roll++) {
			++freq[1 + randomNumbers.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for (int face = 1; face < freq.length; face++) {
			System.out.printf("%4d%10d\n", face, freq[face]);
		}
		
	}

}
