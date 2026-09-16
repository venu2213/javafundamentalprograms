package com.oops;

public class UPI extends Payment {
	@Override
	public void pay(double amount) {
		double transactionfee=0;
		 double total= amount+transactionfee;
		 System.out.println("******UPI********");
		 System.out.println("Transaction fee:" +transactionfee);
		 System.out.println("Amount:" +amount);
		 System.out.println("Total Amount:" +total);
	}

}
