package com.logicalstatements;

import java.util.Scanner;

public class HappyNumber {
	void happynumber(int n) {
		int r=0;
		while(n>9) {
			int sum=0;
			while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r);		
		}
			n=sum;
		}
		if(n==1) {
			System.out.println("Happy number");
		}else {
			System.out.println("not a Happy Number");
		}
	}

	 void main() {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		happynumber(n);
		
		System.out.println("main method ended");

	}

}
