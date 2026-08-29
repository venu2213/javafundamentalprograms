package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter row size:");
		 int n=sc.nextInt();
		 System.out.println("Enter column size:");
		 int n1=sc.nextInt();
		 int[][] arr=new int[3][3];
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Enter the Elements:");
			 for(int j=0;j<arr.length;j++) {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 System.out.println(Arrays.deepToString(arr));
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 int start=0;
				  int end=n-1;
				  while(start<end) {
					  int temp=arr[i][start];
					  arr[i][start]=arr[i][end];
					  arr[i][end]=temp;
					  start++;
					  end--;
				  }
				  if(i==n/2||j==n/2) { 
						arr[i][j]=arr[i][j]*2;
					}
			 }
		 }
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 if(i==j) {
					 arr[i][j]=arr[i][j]*arr[i][j];
				 }
			 }
		 }
		 System.out.println(Arrays.deepToString(arr));
		 System.out.println("main method ended");

	}

}
