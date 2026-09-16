package com.oops;


public class TestDemo12 {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 PaymentIn c=new CreditCard();
		 c.pay(5000);
		 PaymentIn u=new UPI();
		 u.pay(5000);
		 PaymentIn n=new NetBanking();
		 n.pay(5000);
		 System.out.println("main method ended");

	}

}
