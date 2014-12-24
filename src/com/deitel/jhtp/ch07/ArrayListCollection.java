package com.deitel.jhtp.ch07;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red");
		items.add(0, "yellow");
		
		System.out.print("Display list contents with counter-controlled loop:");
		
		for (int i = 0; i < items.size(); i++) {
			System.out.printf(" %s", items.get(i));
		}
		
		display(items, "\nDisplay list contents with enhanced for statement:");
		
		items.add("green");
		items.add("yellow");
		display(items, "\nList with two new elements:");
		
		items.remove("yellow");
		display(items, "\nList with the first 'yellow' element removed:");
		
		items.remove(1);
		display(items, "\nList with the second element removed (green):");
		
		System.out.printf("\nElement \"red\" is %sin the list", items.contains("red") ? "" : "not ");
		
		System.out.printf("\nList size: %s", items.size());
		
	}
	
	public static void display(ArrayList<String> items, String header) {
		
		System.out.print(header);
		
		for (String item : items) {
			System.out.printf(" %s", item);
		}
		System.out.printf("\nList size: %s", items.size());
		System.out.println();
	}

}
