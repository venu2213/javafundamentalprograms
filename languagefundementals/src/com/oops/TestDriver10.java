package com.oops;

class Circle extends Shape{
	@Override
	public void area() {
		 int r=13;
		 System.out.println("Area of Cricle:" +Math.PI*r*r);
	}
}

class Rectangle extends Shape{
	@Override
	public void area() {
		 int l=30;
		 int h=45;
		 System.out.println("Area of Rectangle:" +l*h);
	}
}

class Triangle extends Shape{
	@Override
	public void area() {
		int l=40;
		int b=34;
		System.out.println("Area of Triangle:" +0.5*(l*b));
	}
}

public class TestDriver10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Shape c=new Circle();
		c.area();
		Shape r=new Rectangle();
		r.area();
		Shape t=new Triangle();
		t.area();
		System.out.println("main method ended");

	}

}
