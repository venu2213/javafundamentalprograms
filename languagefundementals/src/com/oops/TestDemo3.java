package com.oops;

public class TestDemo3 {
	
	void addition() {
		System.out.println("no arg method called");
	}
	
	void addition(int i) {
		System.out.println("int method called " +i);
	}
	
	void addition(float c) {
		System.out.println("float method called " +c);
	}
	
	void addition(double v) {
		System.out.println("double method called " +v);
	}

	 void main() {
		 System.out.println("main method started");
		 addition();
		 addition(3);
		 addition(3.5);
		 System.out.println("main method ended");

	}

}
