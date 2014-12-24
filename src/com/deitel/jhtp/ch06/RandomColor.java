package com.deitel.jhtp.ch06;

import java.awt.Color;
import java.util.Random;

public class RandomColor {
	
	private Random randomNumber = new Random();
	
	int r = -1 + randomNumber.nextInt(255);
	int g = -1 + randomNumber.nextInt(255);
	int b = -1 + randomNumber.nextInt(255);
	
	public Color getColor = new Color(r, g, b);
}
