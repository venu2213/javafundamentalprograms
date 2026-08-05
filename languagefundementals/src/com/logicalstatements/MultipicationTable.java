package com.logicalstatements;

import java.util.Scanner;

public class MultipicationTable {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.print(n * i + " ");
		}
		System.out.println();
		System.out.println("*****Alaphabets*****");
		for (char c = 'Z'; c >= 'A'; c--) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("main method ended");

	}

}
