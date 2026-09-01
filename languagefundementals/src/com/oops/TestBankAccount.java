package com.oops;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		System.out.println("main method started");
		BankAccount ba = new BankAccount();
		Scanner sc = new Scanner(System.in);
		ba.setAccountNo(442266745);
		ba.setHolderName("venu");
		ba.setBalance(5000);
		System.out.println("Account Number:" + ba.getAccountNo());
		System.out.println("Holder Name:" + ba.getHolderName());
		System.out.println("Balance:" + ba.getBalance());
		ba.deposite(10000);
		ba.withdraw(5000);

		System.out.println("main method ended");

	}

}
