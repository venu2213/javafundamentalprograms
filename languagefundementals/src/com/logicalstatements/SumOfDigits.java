package com.logicalstatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int n=sc.nextInt();
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 sum=i+sum;
		 }
		 System.out.println("Sum of Digits:" +sum);
		 System.out.println("main method ended");

	}

}
