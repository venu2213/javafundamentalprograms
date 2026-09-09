package com.oops;

class Bank1 {
    void bankName() {
        System.out.println("This is a bank");
    }
}

class SBI extends Bank {
    void interestRate() {
        System.out.println("SBI interest rate is 7%");
    }

	public void bankName() {
		// TODO Auto-generated method stub
		
	}
}

public class Bank {
    public static void main(String[] args) {

        SBI s = new SBI();

        // Inherited method
        s.bankName();

        // SBI's own method
        s.interestRate();
    }
}

