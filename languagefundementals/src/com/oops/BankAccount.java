package com.oops;

public class BankAccount {

	private long accountNo;
	private String holderName;
	private double balance;

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		System.out.println("Deposite Amount:" +amount);
		balance += amount;
		System.out.println("Balance:" + balance);
	}

	public void withdraw(double amount) {
		System.out.println("Withdraw Amount:" +amount);
		if (balance > 0 && amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("insufficent balance");
		}
		System.out.println("Balance:" +balance);

	}

}
