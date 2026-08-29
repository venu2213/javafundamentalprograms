package com.arrays;


class Student2 {
	int sid;
	String sname;
	Address1 address1;
	Number sal;

	public Student2(int sid, String sname, Address1 address1,Number sal) {
		this.sid = sid;
		this.sname = sname;
		this.address1 = address1;
		this.sal=sal;
	}

	public Student2(Student2 s1) {
		this.sid = s1.sid;
		this.sname = s1.sname;
		this.address1 = new Address1(s1.address1);
	}

}

class Address1 {
	String city;
	Number sal;

	public Address1(Address1 address1) {
		this.city = address1.city;
	}

	public Address1(String city, Number sal) {
		this.city = city;
		this.sal=sal;
	}
	

}
class Number {
	double sal;

	public Number(double sal) { 
		this.sal = sal;
	}
	
}

public class RotatingElements {

	public static void main(String[] args) {
		System.out.println("main method started");
		Number sal=new Number(450000);
		Address1 address1 = new Address1("kavali",sal);
		Student2 s1 = new Student2(101, "venu", address1,sal);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address1.city);
		System.out.println(s1.sal.sal);

		System.out.println("--------------------------------");

		Student2 s2 = new Student2(s1);
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address1.city);
		System.out.println(s2.sal.sal);
		

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
