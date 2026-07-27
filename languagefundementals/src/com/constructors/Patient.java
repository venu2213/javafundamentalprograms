package com.constructors;

import java.util.Scanner;

public class Patient {
	
	String pname;
	int age;
	double roomcharge;
	int admit;
	

	public Patient(String pname, int age, double roomcharge, int admit) {
		this.pname = pname;
		this.age = age;
		this.roomcharge = roomcharge;
		this.admit = admit;
	}
	void totalbill() {
		double totalbill=roomcharge*admit;
		System.out.println("Patient Name:" +pname);
		System.out.println("Age:" +age);
		System.out.println("Room charge per day:" +roomcharge);
		System.out.println("Number of days Admitted:" +admit);
		System.out.println("Total Hospital Bill:" +totalbill);
		
	}


	public static void main(String[] args) {
		 System.out.println("main method started !");
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Patient Name:");
		 String name=sc.nextLine();
		 System.out.println("Enter Age:");
		 int age=sc.nextInt();
		 System.out.println("Enter Room Charge per day:");
		 double charge=sc.nextDouble();
		 System.out.println("Enter Number of Days Admitted:");
		 int admit=sc.nextInt();
		 Patient p=new Patient(name,age,charge,admit);
		 p.totalbill();
		 
		 System.out.println("main method ended !");

	}

}
