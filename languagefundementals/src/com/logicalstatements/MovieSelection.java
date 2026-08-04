package com.logicalstatements;

import java.util.Scanner;

public class MovieSelection {

	public static void main(String[] args) {
		System.out.println("*****Welcome to movie selection******");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int ms = sc.nextInt();

		switch (ms) {
		case 1 -> {
			System.out.println("Movie Name:Puspha");
			System.out.println("Hero Name:Allu Arjun");
			System.out.println("Heroine name:Rashmika");
			System.out.println("Ratin:9.0/10.0");
		}
		case 2 -> {
			System.out.println("Movie Name:Lenin");
			System.out.println("Hero Name:Akhil");
			System.out.println("Heroine name:Bhayasri");
			System.out.println("Ratin:8.0/10.0");
		}
		case 3 -> {
			System.out.println("Movie Name:Bahubali");
			System.out.println("Hero Name:Prabash");
			System.out.println("Heroine name:Anukasha");
			System.out.println("Ratin:9.5/10.0");
		}
		case 4 -> {
			System.out.println("Movie Name:Eega");
			System.out.println("Hero Name:Nani");
			System.out.println("Heroine name:Samantha");
			System.out.println("Ratin:9.0/10.0");
		}
		default -> System.out.println("invalid input");

		}

	}

}
