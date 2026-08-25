package com.oops;

import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("How many details are entered...?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter id:");
			int id = sc.nextInt();
			System.out.println("Enter Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter Salary:");
			double sal = sc.nextDouble();
			e.setEid(id);
			e.setEname(name);
			e.setSalary(sal);
			System.out.println(e.getEid());
			System.out.println(e.getEname());
			System.out.println(e.getSalary());
		}
		System.out.println("main method ended");

	}

}
