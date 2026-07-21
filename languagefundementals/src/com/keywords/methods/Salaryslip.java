package com.keywords.methods;

import java.util.Scanner;

public class Salaryslip {
	
	void salaryslip(String employeeName, double basicSalary) {
		
		System.out.println("Employee Name:" +employeeName);
		System.out.println("Basic Salary:" +basicSalary);
		double HRA=(basicSalary*20)/100;
		double DA=(basicSalary*10)/100;
		double grossSalary=basicSalary+HRA+DA;
		System.out.println("HRA(20%):" +HRA);
		System.out.println("DA(10%):" +DA);
		System.out.println("Gross Salary:" +grossSalary);
		
	}

	 public static void main(String[] args) {
		System.out.println("main method started!");
		Salaryslip s=new Salaryslip();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String e=sc.nextLine();
		System.out.println("Enter Basic Salary:");
		double b=sc.nextDouble();
		s.salaryslip(e,b);
		System.out.println("main method ended!");
		
		 

	}

}
