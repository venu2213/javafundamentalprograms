package com.constructors;

public class Product {
	
	int pid;
	String pname;
	double price;
	
	Product(int id, String name, double pri){
		System.out.println("Parameterised Constructor");
		pid=id;
		pname=name;
		price=pri;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started!");
		
		Product p=new Product(221,"vamsi",30566);
		p.show();
		
		System.out.println("main method ended!");
		 

	}
	
	void show() {
		System.out.println("Product id:" +pid);
		System.out.println("Product Name:" +pname);
		System.out.println("Product Price:" +price);
	}

}
