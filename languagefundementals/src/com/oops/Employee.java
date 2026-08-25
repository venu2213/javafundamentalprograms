package com.oops;

public class Employee {
	private int eid;
	private String ename;
	private double salary;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("invalid");
		}
	}

	public double getSalary() {
		return salary;
	}

}
