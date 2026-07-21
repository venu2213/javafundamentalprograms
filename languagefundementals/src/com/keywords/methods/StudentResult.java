package com.keywords.methods;

import java.util.Scanner;

public class StudentResult {

	 void main(String[] args) {
		 System.out.println("main method started");
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Student name:");
		 String name=sc.next();
		  
		System.out.println("Enter first subject:");
		int m1=sc.nextInt();
		System.out.println("Enter second subject:");
		int m2=sc.nextInt();
		System.out.println("Enter Third subject:");
		int m3=sc.nextInt();
		displayStudent(name);
		calculateTotal(m1,m2,m3);
		calculateAverage(m1,m2,m3);
		  
		 System.out.println("main method ended");
		 

	}
	 
	 void displayStudent(String name) {
		 System.out.println("Student Name:" +name);
	 }
	 void calculateTotal(int m1, int m2, int m3) {
		 int t=m1+m2+m3;
		 System.out.println("Student total:" +t);
		  
	 }
	 
	 void calculateAverage(int m1,int m2,int m3) {
		 int a=(m1+m2+m3)/3;
		 System.out.println("Student Average:" +a);
	 }

}
