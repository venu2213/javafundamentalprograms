package com.logicalstatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the range to print:");
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++) {
			 if(isPrime(i)) {
				 System.out.print(i + " ");
			 }
		 }
		 System.out.println( );
		 System.out.println("main method ended");

	}
	static boolean isPrime(int n) {
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
