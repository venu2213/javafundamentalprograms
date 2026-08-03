package com.constructors;

public class Swap {


	public static void main(String[] args) {
		 System.out.println("main method started!");
		 
		 int a=10;
		 int b=20;
		 
		 System.out.println("--------Before Swap-----------");
		 System.out.println("A:" +a);
		 System.out.println("B:" +b);
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("--------After Swap-----------");
		 System.out.println("A:" +a);
		 System.out.println("B:" +b);
		 
		 System.out.println("main method ended!");

	}

}
