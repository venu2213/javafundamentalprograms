package com.oops;

class Student1 {
	int sid;
	String sname;
	Address1 address1;

	public Student1(int sid, String sname, Address1 address1) {
		this.sid = sid;
		this.sname = sname;
		this.address1 = address1;
	}

	public Student1(Student1 s1) {
		this.sid = s1.sid;
		this.sname = s1.sname;
		this.address1 = new Address1(s1.address1);
	}

}

class Address1 {
	String city;

	public Address1(Address1 address1) {
		this.city = address1.city;
	}

	public Address1(String city) {
		this.city = city;
	}

}

public class TestdeepCopy {

	public static void main(String[] args) {
		System.out.println("main method started");
		Address1 address1 = new Address1("kavali");
		Student1 s1 = new Student1(101, "venu", address1);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address1.city);

		System.out.println("--------------------------------");

		Student1 s2 = new Student1(s1);
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address1.city);

		System.out.println("**********************************");

		s2.address1.city = "Nellore";

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address1.city);

		System.out.println("--------------------------------");

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address1.city);

		System.out.println("--------------------------------");

		System.out.println(s1);
		System.out.println(s2);

		System.out.println("main method ended");

	}

}
