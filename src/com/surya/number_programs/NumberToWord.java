package com.surya.number_programs;

public class NumberToWord {

	// Array of words for single digits
	private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };

	// Array of words for two-digit numbers
	private static final String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeen", "Eighteen", "Nineteen" };

	// Array of words for tens
	private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static void main(String[] args) {
		int number = 123;
		System.out.println("Number: " + number);
		System.out.println("In Words: " + convertToWord(number));

	}

	public static String convertToWord(int number) {
		if (number == 0) {
			return "Zero";
		}

		if (number < 0) {
			return "Minus " + convertToWord(-number);
		}

		String words = "";

		if ((number / 100) > 0) {
			words += units[number / 100] + " Hundred ";
			number %= 100;
		}

		if (number >= 10 && number < 20) {
			words += teens[number - 10];
		} else {
			if (number >= 20) {
				words += tens[number / 10];
				number %= 10;
			}

			if (number > 0) {
				words += " " + units[number];
			}
		}

		return words.trim();
	}

}
