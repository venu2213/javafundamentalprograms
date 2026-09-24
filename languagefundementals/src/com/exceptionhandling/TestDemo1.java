package com.exceptionhandling;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Object o=new Magazine();
		try {
			Book b=(Book)o;
			b.book();
		}catch(ClassCastException e) {
			System.out.println("Exception");
		}
		
		Object o1=new Book();
		try {
			Magazine b1=(Magazine)o1;
			b1.magazine();
		}catch(ClassCastException e) {
			System.out.println("Exception");
		}
		
		System.out.println("main method ended");

	}

}
