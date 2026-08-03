package com.constructors;

public class Laptop {
	
	String name;
	String model;
	double price;
	Laptop(){
	}
	Laptop(Laptop l, String name){
		this.name=name;
	}
	
	public Laptop(String model) {
		 
		this.model = model;
	}
	void show() {
		System.out.println("Name:" +name);
		System.out.println("Model:" +model);
		System.out.println("Price:" +price);
	}
	

	public static void main(String[] args) {
		
		System.out.println("main method started!");
		Laptop l1=new Laptop();
		l1.show();
		Laptop l2=new Laptop(l1,"Dell");
		l2.show();
		System.out.println("main method ended!");
		 

	}

}
