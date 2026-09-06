package com.oops;

public class TestDemo4 {

	 void main() {
		System.out.println("main method started");
		add("a" ,10 ,12);
		add("b",10,20,50);
		add("c",10,20,30,60);
		System.out.println("main method ended");

	}
	 
//	var arg:variable argument
//	int... a ===> int[] a
//	The variable argument type int of the method add must be the last parameter
	void add(String s,int... a) {
		 int sum=0;
		 for(int a1:a) {
			 sum=sum+a1;
		 }
		 System.out.println("Sum:" +sum +"->" +s);
	}
	
	

}
