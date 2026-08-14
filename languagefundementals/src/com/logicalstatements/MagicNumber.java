package com.logicalstatements;

import java.util.Scanner;

public class MagicNumber {
	void ismagicnumber(int n) {
		int r=0;
		while(n>9) {
			int sum=0;
			while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;		
		}
			n=sum;
		}
		if(n==1) {
			System.out.println("magic number");
		}else {
			System.out.println("not a magic");
		}
	}

	 void main() {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		ismagicnumber(n);
		
		System.out.println("main method ended");

	}

}
