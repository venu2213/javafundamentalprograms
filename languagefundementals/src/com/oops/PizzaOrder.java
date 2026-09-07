package com.oops;

public class PizzaOrder extends Orderdetails {

	PizzaOrder(int orderid, String customerName, double price) {
		super(orderid, customerName, price);

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		PizzaOrder po = new PizzaOrder(101, "venu", 235.9);
		po.display();

		System.out.println("main method ended");

	}

}
