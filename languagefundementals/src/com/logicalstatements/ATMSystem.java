package com.logicalstatements;

import java.util.Scanner;

public class ATMSystem {
	
	static double balance=100000 ;

	public static void main(String[] args) {
		System.out.println("***Welcome to VV Bank***");
		System.out.println("***Please insert your Card***");
		Scanner sc = new Scanner(System.in);
		System.out.println("please wait.....");
		int storedpin = 2219;
		System.out.println("Enter your pin:");
		int userpin = sc.nextInt();
			if (userpin == storedpin) {
				System.out.println("Valid pin");
				System.out.println("Please wait......");
				System.out.println("select option");
				System.out.println("1.Balance Check\n2.Deposite \n3.Withdraw \n4.Change Pin \n5.Exit ");
				System.out.println("Enter your option:");
				int ch = sc.nextInt();
					switch (ch) {
					case 1->{
						System.out.println("Total Balance:" +balance);
					}
					case 2 -> {
						System.out.println("Enter your amount is added:");
						double amount=sc.nextDouble();
						 if(amount>0) {
							 balance=balance+amount;
							 System.out.println("Total Amount:" +balance);
						 }else {
							 System.out.println("Invalid cash");
						 }

					}
					case 3 -> {
						System.out.println("Enter your amount is reduce:");
						double amount=sc.nextDouble();
						 if(amount>0) {
							 if(amount>=balance) {
								 balance=balance-amount;
								 System.out.println("Total Amount:" +balance);
							 }else {
								 System.out.println("Insufficient funds");
							 }
						 }else {
							 System.out.println("Invalid error");
						 }

					}
					case 4->{
						 if(userpin == storedpin) {
							 System.out.println("Enter new pin:");
							 int newpin=sc.nextInt();
							 System.out.println("Enter confirm pin:");
							 int conpin=sc.nextInt();
							 if(newpin!=userpin) {
								 if(newpin==conpin) {
									  storedpin=newpin;
									  System.out.println("Sucessfully Changed😊");
								 }else {
									 System.out.println("invalid pin");
								 }
							 }else {
								 System.out.println("you have not enter new pin");
							 }
						 }else {
							 System.out.println("Invalid pin entered");
						 }
					}
					case 5->System.out.println("Thank for visiting!");
					default->System.out.println("Invalid choice");
					}

			} else {
				System.out.println("invalid pin");
			}
		 
		sc.close();

	}

}
