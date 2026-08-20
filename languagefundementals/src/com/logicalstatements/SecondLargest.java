package com.logicalstatements;

import java.util.Scanner;

public class SecondLargest {
	
	void secondLargest(int n) {
		int r=0;
		int max=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		while(n>0) {
			int digit=n%10;
			if(digit>max) {
				max=digit;
				secondLargest=max;
				
			}
			n=n/10;
		}
		System.out.println("The SecondLargest Number:" +secondLargest);
	}

	 void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int n=sc.nextInt();
		 secondLargest(n);
		 System.out.println("main method ended");

	}

}
