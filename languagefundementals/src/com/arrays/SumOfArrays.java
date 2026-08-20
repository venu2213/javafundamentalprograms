package com.arrays;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number of size:");
		 int n=sc.nextInt();
		 int[] arr= new int[n];
		 int sum=0;
		 int avg=0;
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Enter the Elements:");
			 arr[i]=sc.nextInt();
		 }
		 for(int i=0;i<arr.length;i++) {
			 sum=sum+arr[i];
			 avg=sum/arr.length;
		 }
		 
		 System.out.println("Sum:" +sum);
		 System.out.println("Avg:" +avg);
		 System.out.println("main method ended");

	}

}
