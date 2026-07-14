package com.keywords.methods;

public class BankAccount {

	public static void main(String[] args) {
		 
		System.out.println("Main method started");
		
		BankAccount b=new BankAccount();
		b.displayAccount();
		
		System.out.println("Main method ended");
		
		

	}
	
	void displayAccount() {
		long Account_no=43332211689l;
		String Account_Hname="Vamsidhar";
		String Account_type="Savings";
		double Account_Bal=800034.4;
		System.out.println("Account Number:" +Account_no);
		System.out.println("Account Holder name:" +Account_Hname);
		System.out.println("Account Type:" +Account_type);
		System.out.println("Account Balance:" +Account_Bal);
		
	}

}
