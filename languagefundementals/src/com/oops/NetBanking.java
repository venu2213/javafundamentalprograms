package com.oops;

public class NetBanking extends Payment {
	@Override
	public void pay(double amount) {
		double transactionfee=10;
		 double total= amount+transactionfee;
		 System.out.println("******Net Banking********");
		 System.out.println("Transaction fee:" +transactionfee);
		 System.out.println("Amount:" +amount);
		 System.out.println("Total Amount:" +total);
	}

}
