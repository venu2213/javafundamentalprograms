package com.constructors;

import java.util.Scanner;

public class Mobile {

	String name;
	String model;
	int yom;
	String colour;
	double price;

	public Mobile(String name, String model) {
		this.name = name;
		this.model = model;
	}

	public Mobile(String name, String model, int yom) {
		this.name = name;
		this.model = model;
		this.yom = yom;
	}

	public Mobile(String name, String model, int yom, String colour, double price) {
		this.name = name;
		this.model = model;
		this.yom = yom;
		this.colour = colour;
		this.price = price;
	}

	void display() {
		System.out.println("Mobile Name:" + name);
		System.out.println("Mobile Model:" + model);
		System.out.println("Mobile yom:" + yom);
		System.out.println("Mobile Colour:" + colour);
		System.out.println("Mobile Price:" + price);

	}

	public static void main(String[] args) {
		System.out.println("main method Started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile name:");
		String n = sc.nextLine();
		System.out.println("Enter Mobile Model:");
		String mo = sc.nextLine();
		System.out.println("Enter year of model:");
		int y = sc.nextInt();
		System.out.println("Enter mobile Colour:");

		System.out.println("main method ended");

	}

}
