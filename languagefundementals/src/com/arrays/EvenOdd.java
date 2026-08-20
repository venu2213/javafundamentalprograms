package com.arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evencount++;
			}
			if (arr[i] % 2 == 1) {
				oddcount++;

			}
		}
		System.out.println("Even:" + evencount);
		System.out.println("odd:" + oddcount);
		System.out.println("main method ended");

	}

}
