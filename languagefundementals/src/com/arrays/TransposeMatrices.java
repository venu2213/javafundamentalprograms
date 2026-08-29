package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrices {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row:");
		int n = sc.nextInt();
		System.out.println("Enter size of column:");
		int n1 = sc.nextInt();
		int[][] arr = new int[n][n1];
		int[][] transpose = new int[n][n1];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Elements:");
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		System.out.println(Arrays.deepToString(transpose));

		System.out.println("main method ended");

	}

}
