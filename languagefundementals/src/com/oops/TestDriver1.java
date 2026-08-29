package com.oops;

public class TestDriver1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee1 e1 = new Employee1();
		e1.setId(22);
		e1.setName("Venu");
		e1.setSalary(40000);
		e1.setPassword("Venu@2219");

		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getPassword());
		System.out.println("main method ended");

	}

}
