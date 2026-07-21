package com.keywords.methods;

import java.util.Scanner;

public class Bankloan {
	
	double calculateInterest(double principle, double rate, int time) {
		double interest=(principle*rate*time)/100;
		System.out.println("Total interest:" +interest);
		return interest;
	}

	 void main(String[] args) {
		
		System.out.println("main method started !!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle:");
		double p=sc.nextDouble();
		System.out.println("Enter rate:");
		double r=sc.nextDouble();
		System.out.println("Enter time:");
		int t=sc.nextInt();
		calculateInterest(p,r,t);
		
		
		
		System.out.println("main method started !!");
		

	}

}
