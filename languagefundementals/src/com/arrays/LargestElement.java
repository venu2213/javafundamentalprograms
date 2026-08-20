package com.arrays;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		System.out.println("Enter the Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max number:" + max);
		System.out.println("main method ended");

	}

}
