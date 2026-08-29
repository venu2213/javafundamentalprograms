package com.oops;

public class TestDemo1 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Final method called");
	}

	@Override
	public String toString() {
		return "Employee Info:ID: " + id + " Name:" + name;
	}

	TestDemo1() {
		super();
	}

	void show() {
		System.out.println("show method called :" + this.getClass());
	}

	int id = 22;
	String name = "venu";

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo1 t1 = new TestDemo1();
		TestDemo1 t2 = new TestDemo1();
		TestDemo1 t3 = new TestDemo1();
		t2 = t3;
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		t3.show();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.gc();
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t2));

		System.out.println("main method ended");

	}

}
