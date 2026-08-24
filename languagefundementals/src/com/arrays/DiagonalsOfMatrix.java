package com.arrays;

import java.util.Scanner;

public class DiagonalsOfMatrix {

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
		int leftdiagonal = 0;
		int rightdiagonal = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					leftdiagonal = leftdiagonal + arr[i][j];
				}
				if (i + j == 2) {
					rightdiagonal = rightdiagonal + arr[i][j];
				}
			}
		}
		System.out.println("Sum of Right Diagonal:" + rightdiagonal);
		System.out.println("Sum of Left Diagonal:" + leftdiagonal);

	}

}
