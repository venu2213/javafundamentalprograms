package com.oops;

public class TestDemo7 extends Account {

	public static void main(String[] args) {
		Account td = new TestDemo7();

		Account.hello();
		td.welcome();
		td.method1();

	}

	@Override
	void method1() {
		System.out.println("Method called!!");

	}

}
