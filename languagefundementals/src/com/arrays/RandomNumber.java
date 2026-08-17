package com.arrays;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int r = ran.nextInt(10);
		// System.out.println(r);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Gusses the chance " + i + ":");
			int n = sc.nextInt();
			if (n == r) {
				System.out.println("You Won the game🏆🎉🎊");
				break;
			} else if (i < 3) {
				System.out.println("Try Again....");
			} else {
				System.out.println("You loose the game ! Better Luck Next time");
			}
		}

		System.out.println("main method ended");

	}

}
