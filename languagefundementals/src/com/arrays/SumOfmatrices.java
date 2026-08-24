package com.arrays;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfmatrices {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = sc.nextInt();
		System.out.println("Enter no of columns:");
		int n1 = sc.nextInt();
		int[][] arr = new int[n1][n];
		for (int i = 0; i < n1; i++) {
			System.out.println("Enter the value of" + i + " Row:");
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[j][i];
			}
		}

		System.out.println("Sum of Matrices:" + sum);

		System.out.println("main method ended");

	}

}
