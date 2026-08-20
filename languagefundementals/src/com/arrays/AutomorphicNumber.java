package com.arrays;

import java.util.Scanner;

public class AutomorphicNumber {
	
	 void automorphic(int n) {
		int square=0;
		int count=0;
		int temp=n;
		square=n*n;
		System.out.println("Square of given Digit:" +square);
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		int lastdigit=square%(int)Math.powExact(10, count);
		System.out.println(lastdigit);
		if(n==lastdigit) {
			System.out.println("Given Number is Automorphic");
		}else {
			System.out.println("Given Number is not Automorphic");
		}
		
	}

	 void main() {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int n=sc.nextInt();
		 automorphic(n);
		 System.out.println("main method ended");

	}

}
