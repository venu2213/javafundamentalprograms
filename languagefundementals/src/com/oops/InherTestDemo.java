package com.oops;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}

class Student2 extends Person {
	String collageName;

	public Student2(String name, int age, String collageName) {
		super(name, age);
		this.collageName = collageName;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(collageName);
	}
	
}

public class InherTestDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		Student2 st1=new Student2("venu",21,"PBR VITS");
		st1.display();
		System.out.println("main method ended");

	}

}
