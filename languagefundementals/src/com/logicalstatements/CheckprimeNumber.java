package com.logicalstatements;

import java.util.Scanner;

public class CheckprimeNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		primenumber(n);

		System.out.println("main method ended");

	}

	static void primenumber(int n) {
		boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
			 
		}
		if (isPrime) {
			System.out.println(n +" is a number is prime");
		} else {
			System.out.println(n +" is a number is not prime");
		}

	}

}
