package com.logicalstatements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int square = n * n;
		System.out.println("Square of n:" + square);
		int sum = 0;
		for (; square > 0;) {
			int digit = square % 10;
			sum = sum + digit;
			square = square / 10;
		}
		if (sum == n) {
			System.out.println("is neon number");
		} else {
			System.out.println("is not a neon number");
		}
		sc.close();

	}

}
