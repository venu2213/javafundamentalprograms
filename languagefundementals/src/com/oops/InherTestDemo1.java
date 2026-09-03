package com.oops;


class Vehicle1{
	int speed=50;
	void display() {
		System.out.println(speed);
	}
}

class Car1 extends Vehicle1{
	int speed=100;
	@Override
	void display() {
		 System.out.println(speed);
	}
}

public class InherTestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Vehicle1 c=new Car1();
		c.display();
		System.out.println("main method ended");
		 

	}

}
