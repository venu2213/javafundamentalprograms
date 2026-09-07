package com.oops;

import java.util.Scanner;

public class Orderdetails {

	static Scanner sc = new Scanner(System.in);
	int orderid;
	String customerName;
	double price;

	public Orderdetails(int orderid, String customerName, double price) {
		this.orderid = orderid;
		this.customerName = customerName;
		this.price = price;
	}

	void display() {
		System.out.println("Order id:" + orderid);
		System.out.println("Customer Name:" + customerName);
		System.out.println("Price:" + price);

	}

}
