package com.surya.javabasics;

public class Pattern {

	public static void main(String[] args) {
		int rows = 5; 
		
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= rows - i; ++j) {
				System.out.println(" ");
			}
			
			for (int k = 1; k <= i * 2 - 1; ++k) {
				System.out.println("*");
			}
			
			System.out.println();
		}

	}

}
