package com.arrays;

import java.util.Scanner;

public class TransposeMatrices {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of row:");
		int n=sc.nextInt();
		System.out.println("Enter size of column:");
		int n1=sc.nextInt();
		int[][] arr=new int[n][n1];
		System.out.println("Enter the Elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Elements:");
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j] +" ");
			}
			System.out.println( );
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j][i] +" ");
			}
			System.out.println( );
		}
		System.out.println("main method ended");
		 

	}

}
