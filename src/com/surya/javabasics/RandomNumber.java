package com.surya.javabasics;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rand = new Random();

		int randNum = rand.nextInt(100);
		System.out.println("Random Number:" + randNum);

	}

}
