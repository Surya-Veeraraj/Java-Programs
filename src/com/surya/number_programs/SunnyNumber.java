package com.surya.number_programs;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Get a number from the user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check if the number is a Sunny Number
		if (isSunnyNumber(number)) {
			System.out.println(number + " is a Sunny Number.");
		} else {
			System.out.println(number + " is not a Sunny Number.");
		}

		scanner.close();
	}

	// Method to check if a number is a Sunny Number
	public static boolean isSunnyNumber(int number) {
		// Check if (number + 1) is a perfect square
		int sqrt = (int) Math.sqrt(number + 1);
		return (sqrt * sqrt == number + 1);
	}
}
