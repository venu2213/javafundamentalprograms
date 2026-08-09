package com.logicalstatements;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		 
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		long n1=fact(n);
		System.out.println("Fact of given number:" +n1);
		System.out.println("main method ended");

	}

	static long fact(int n) {
		 long fact=1;
		 if(n==0||n==1) {
			return  1; 
		 }
		 return n*fact(n-1);
	}

}
