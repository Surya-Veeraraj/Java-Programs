package com.surya.number_programs;

import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input: Get a number from the user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		// Check if the number is a Peterson Number
		if (isPeterson(number)) {
			System.out.println(number + " is a Peterson Number.");
		} else {
			System.out.println(number + " is not a Peterson Number.");
		}
		
		scanner.close();
	}
	
	// Method to check if a number is a Peterson Number
	public static boolean isPeterson(int number) {
		int temp = number;
		int sum = 0;
		
		// Calculate the sum of the factorials of the digits
		while (temp > 0) {
			int digit = temp % 10;
			sum += factorial(digit);
			temp /= 10;
		}
		
		// Return true if the sum is equal to the original number
		return sum == number;
	}
	
	// Method to calculate the factorial of a digit
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
