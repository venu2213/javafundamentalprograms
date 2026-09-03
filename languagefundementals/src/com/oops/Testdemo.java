package com.oops;

class Vehicle{
	void start() {
		System.out.println("call start method");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Drive method called");
	}
}

public class Testdemo {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Car c=new Car();
		 c.start();
		 c.drive();
		 
		 System.out.println("main method ended");

	}

}
