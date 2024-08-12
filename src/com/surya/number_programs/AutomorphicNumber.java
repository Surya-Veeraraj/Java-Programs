package com.surya.number_programs;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input: Get a number from the user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		// Check if the number is Automorphic
		if (isAutomorphic(number)) {
			System.out.println(number + " is an Automorphic Number.");
		} else {
			System.out.println(number + " is not an Automorphic Number.");
		}
		
		scanner.close();
  	}
	
	// Method to check if a number is Automorphic
	public static boolean isAutomorphic(int number) {
		// Calculate the square of the number
		int square = number * number;
		
		// Convert both the number and its square to strings
		String numStr = Integer.toString(number);
		String squareStr = Integer.toString(square);
		
		// Check if the square ends with the number
		return squareStr.endsWith(numStr);
	}

}
