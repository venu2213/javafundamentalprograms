package com.constructors;

import java.util.Scanner;

public class Bank {
	
	long ac_no;
	String ac_hodlername;
	static String b_name="SBI";
	static String ifsccode="SBIN000045";
	double bal;
	

	public Bank(String ac_hodlername, double bal) {
		this.ac_no = ac_no++;
		this.ac_hodlername = ac_hodlername;
		this.bal = bal;
	}
	void show() {
		System.out.println("Bank Name:" +b_name);
		System.out.println("IFSC Code:" +ifsccode);
		System.out.println("Account Number:" +ac_no);
		System.out.println("Account Holder Name:" +ac_hodlername);
		System.out.println("Account Balance:" +bal);
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Holder Name:");
		String name=sc.nextLine();
		System.out.println("Enter Balance:");
		double balance=sc.nextDouble();
		Bank b=new Bank(name,balance);
		b.show();
		System.out.println("main method ended");
		 

	}

}
