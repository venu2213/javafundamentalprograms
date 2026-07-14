package com.keywords.methods;

public class Mobilerecharge {

	 void main(String[] args) {
		 System.out.println("main method started");
		 showPlanDetails();
		 recharge(299.0);

	}
	
	void showPlanDetails() {
		System.out.println("Current Recharge plan");
		String planname="Unlimited 299";
		String validity="28 Days";
		String data="1.5 GB/day";
		String calls="unlimited";
		
		System.out.println("Plan Name:" +planname);
		System.out.println("Validity:" +validity);
		System.out.println("Data:" +data);
		System.out.println("Calls:" +calls);
	}
	
	void recharge(double amount) {
		System.out.println("\nRecharge sucessful!");
		System.out.println("Recharge:" +amount);
	}

}
