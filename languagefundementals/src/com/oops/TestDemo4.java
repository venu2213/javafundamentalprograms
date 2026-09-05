package com.oops;

public class TestDemo4 {

	 void main() {
		System.out.println("main method started");
		add(10 ,12);
		add(10,20,50);
		add(10,20,30,60);
		System.out.println("main method ended");

	}
	 
//	var arg:variable argument
//	int... a ===> int[] a
	void add(int... a) {
		 int sum=0;
		 for(int a1:a) {
			 sum=sum+a1;
		 }
		 System.out.println("Sum:" +sum);
	}
	
	

}
