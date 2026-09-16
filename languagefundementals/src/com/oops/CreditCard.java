package com.oops;

public class CreditCard extends Payment  {
	
	@Override
	public void pay(double amount) {
		 double transactionfee=0;
		 transactionfee=amount*0.02;
		 double total= amount+transactionfee;
		 System.out.println("******Credit Card********");
		 System.out.println("Transaction fee:" +transactionfee);
		 System.out.println("Amount:" +amount);
		 System.out.println("Total Amount:" +total);
		
	}
}
