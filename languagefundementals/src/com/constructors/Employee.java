package com.constructors;

public class Employee {
	
	int empid;
	String empName;
	double salary;
	
	Employee(int empid,String empName,double salary){
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
	}
	Employee(Employee e,String empName ){
		this.empid=e.empid;
		this.empName=empName;
		this.salary=e.salary;
	}
	void incrementSalary(double amount) {
		salary=salary+amount;
	}
	void display() {
		System.out.println("Employee id:" +empid);
		System.out.println("Employee Name:" +empName );
		System.out.println("Employee  Salary:" +salary);
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Employee e=new Employee(101,"Krishna",50000.0);
		e.display();
		Employee e1=new Employee(e,"Ravi");
		e1.incrementSalary(10000);
		e1.display();
		
		System.out.println("main method ended");

	}

}
