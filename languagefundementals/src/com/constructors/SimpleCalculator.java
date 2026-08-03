package com.constructors;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		System.out.println("Enter operator(+ or -)");
		char ch = sc.next().charAt(0);
		int res = (ch == '+') ? num1 + num2 : num1 - num2;
		System.out.println("Result:" + res);

		System.out.println("main method ended");

	}

}
