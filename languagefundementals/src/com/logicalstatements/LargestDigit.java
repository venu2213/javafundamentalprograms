package com.logicalstatements;

import java.util.Scanner;

public class LargestDigit {

	void main() {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int largest = 0;
		while (n > 0) {
			int digit = n % 10;
			if (digit > largest) {
				largest = digit;
			}
			n = n / 10;
		}
		System.out.println("Largest Digit:" + largest);
		System.out.println("main method ended");
	}

}
