package com.constructors;

public class BankAccount {
	
	String accountHolder;
	long accountNumber;
	double balance;
	
	BankAccount(){ 
		this("");
	
	}
	BankAccount(String accountHolder){
		this("", 0);
	}
	BankAccount(String accountHolder,long accountNumber){
		this("",0,0.0);
	}

	public BankAccount(String accountHolder, long accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void display() {
		System.out.println("Account Holder:" +accountHolder);
		System.out.println("Account Number:" +accountNumber);
		System.out.println("Balance:" +balance);
		System.out.println("--------------------------------------");
	}
	public static void main(String[] args) {
		System.out.println("main method started!");
		BankAccount b=new BankAccount("Unknown",0,0.0);
		b.display();
		BankAccount b1=new BankAccount("Krishna",0,0.0);
		b1.display();
		BankAccount b2=new BankAccount("Krishna",1223456757,0.0);
		b2.display();
		BankAccount b3=new BankAccount("Krishna",1223456757,500000.0);
		b3.display();
		
		System.out.println("main method ended!");
		 

	}

}
