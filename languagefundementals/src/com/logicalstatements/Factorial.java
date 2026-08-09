package com.logicalstatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		long n1=findFactoral(n);
		System.out.println("Factorial of a given number:" +n1);
		System.out.println("main method ended");

	}

	static long findFactoral(int n) {
		 long fact=1;
		 for(int i=n;i>=1;i--) {
			 fact=i*fact;
		 }
		 return fact;
		
	}

}
