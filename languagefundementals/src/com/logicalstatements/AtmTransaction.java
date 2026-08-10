package com.logicalstatements;

import java.util.Scanner;

public class AtmTransaction {
	
	 ;

	public static void main(String[] args) {
		 System.out.println("main method stsrted");
		 Scanner sc=new Scanner(System.in);
		 double balance=10000;
		 double totaldeposite=0;
		 double totalwithdraw=0;
		 
		 for(int i=1;i<=5;i++) {
			 System.out.println("Transaction " + i + ":Enter amount:");
			 double amount=sc.nextDouble();
			 System.out.println("Choose 1 for Deposite , 2 for Withdraw");
			 int choose=sc.nextInt();
			 if(choose==1) {
				 balance+=amount;
				 totaldeposite+=amount; 
			 }else if(choose==2) {
				 if(amount<=balance) {
					 balance-=amount;
					 totalwithdraw+=amount;
				 }else {
					 System.out.println("Insufficient Balance");
				 }
			 }else {
				 System.out.println("Invalid Choose");
			 }
		 }
		 System.out.println("Final Balance:" +balance);
		 System.out.println("Total deposite:" +totaldeposite);
		 System.out.println("Total Withdraw:" +totalwithdraw);
		  
		 System.out.println("main method ended");

	}

}
