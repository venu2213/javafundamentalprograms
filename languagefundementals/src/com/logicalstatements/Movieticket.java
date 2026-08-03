package com.logicalstatements;

import java.util.Scanner;

public class Movieticket {

	public static void main(String[] args) {
		System.out.println("****Welcome to max movie*****");
		System.out.println("Select your type \n1.Sliver-RS.200 \n2.Gold-Rs.300 \n3.Platinum-Rs.500");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int ticket = sc.nextInt();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		switch (ticket) {
		case 1 -> {
			System.out.println("Sliver-Rs.200");
			int price = 200;
			if (age >= 60) {
				price = price - (price * 10 / 100);
			}
			System.out.println("Ticket Price:" + price);
		}
		case 2 -> {
			System.out.println("Gold-Rs.300");
			int price = 300;
			if (age >= 60) {
				price = price - (price * 10 / 100);
			}
			System.out.println("Ticket Price:" + price);
		}
		case 3 -> {
			System.out.println("Platinum-Rs.500");
			int price = 500;
			if (age >= 60) {
				price = price - (price * 10 / 100);
			}
			System.out.println("Ticket Price:" + price);
		}
		default -> System.out.println("inavlid input");
		}
		System.out.println("Thank you! Visit again");

	}

}
