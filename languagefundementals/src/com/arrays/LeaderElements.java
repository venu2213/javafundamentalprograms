package com.arrays;

import java.util.Scanner;

public class LeaderElements {

	public static void main(String[] args) {
		System.out.println("main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] leaders = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[n - 1];
		int count = 0;
		leaders[count++] = max;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				leaders[count++] = max;
			}
		}
		System.out.println("Leader Elements:");
		for (int i = count - 1; i >= 0; i--) {
			System.out.println(leaders[i]);
		}
		System.out.println("main method ended");

	}

}
