package com.logicalstatements;

import java.util.Scanner;

public class BankLoan {

	public static void main(String[] args) {
		System.out.println("***Welcome to VV Bank***");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if (age >= 21) {
			System.out.println("you have eligible for loan");
			System.out.println("Are you salary:");
			boolean AreyousalAccount = sc.nextBoolean();
			if (AreyousalAccount) {
				System.out.println("check your statement");
				System.out.println("Check your cible Score:");
				int cs = sc.nextInt();
				if (cs > 750 && cs < 10000) {
					System.out.println("your Eligible for loan and how munch amount you have");
				} else {
					System.out.println("you are reject for loan!😕");
				}
			} else {
				System.out.println("your loan is reject");
			}
		} else {
			System.out.println("you have not eligible for loan");
		}
		System.out.println("Thank for visting! Have you nice day😊😊");

	}

}
