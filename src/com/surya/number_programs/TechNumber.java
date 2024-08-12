package com.surya.number_programs;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Get a number from the user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Check if the number is a Tech Number
		if (isTechNumber(number)) {
			System.out.println(number + " is a Tech Number.");
		} else {
			System.out.println(number + " is not a Tech Number.");
		}

		scanner.close();
	}

	// Method to check if a number is a Tech Number
	public static boolean isTechNumber(int number) {
		String numStr = String.valueOf(number);

		// Check if the number has an even number of digits
		if (numStr.length() % 2 != 0) {
			return false;
		}

		// Split the number into two halves
		int firstHalf = Integer.parseInt(numStr.substring(0, numStr.length()));
		int secondHalf = Integer.parseInt(numStr.substring(numStr.length() / 2));

		// Sum the two halves and square the result
		int sum = firstHalf + secondHalf;
		int square = sum * sum;

		// Check if the square of the sum is equal to the original number
		return (square == number);
	}

}
