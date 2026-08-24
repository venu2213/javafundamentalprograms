package com.arrays;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n - 1];
		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int expectedsum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];

		}
		int missing = expectedsum - actualSum;
		System.out.println("Missing Number:" + missing);
		System.out.println("main method ended");

	}

}
