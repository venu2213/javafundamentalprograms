package com.keywords.methods;

import java.util.Scanner;

public class Calculator {
	
	int add(int a, int b) {
		int c=a+b;
		System.out.println("Addition:" +c);
		return c;
	}
	void subtract(int a, int b) {
		System.out.println("Subtract:" +(a-b));
	}
	void multiply(int a, int b) {
		System.out.println("Multiplication:" +(a*b));
	}
	float divide(float a, float b) {
		float c=a/b;
		System.out.println("division:" +c);
		return c;
	}
	float mod(int a, int b) {
		float c=a%b;
		System.out.println("Modules:" +c);
		return c;
	}

	 void main(String[] args) {
		
		System.out.println("main method started!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		add(a,b);
		subtract(a,b);
		multiply(a,b);
		divide(a,b);
		mod(a,b);
		
		System.out.println("main method ended!");
		 
		

	}

}
