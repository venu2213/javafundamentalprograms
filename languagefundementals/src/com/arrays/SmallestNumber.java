package com.arrays;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array:");
		 int n=sc.nextInt();
		 int[] arr=new int[n];
		 System.out.println("Enter the Elements:");
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int min=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
		 }
		 System.out.println("Min number:" +min);
		 System.out.println("main method ended");

	}

}
