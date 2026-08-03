package com.logicalstatements;

import java.util.Scanner;

public class Testdemoifelse {

	void check(int num) {
		if (num >= 0 & num <= 9) {
			System.out.println("One digit number");
		} else if (num >= 10 & num <= 99) {
			System.out.println("Two digits number");
		} else if (num >= 100 & num <= 999) {
			System.out.println("Three digits number");
		} else {
			System.out.println("More than three digits");
		}
	}

	void main() {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int digit = sc.nextInt();
		check(digit);

		System.out.println("main method ended");

	}

}
