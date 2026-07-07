package com.keywords;

public class Employee {
	
	int empid=2213;
	char empgrade='A';
	double empsal=60000.00;
	boolean pes=true;
	int empexp=13;
	int workDays=25;
	long phno=998924464;
	double bonusamt=27000.87;

	public static void main(String[] args) {
		 
		System.out.println("**********Employee Details**************");
		
		Employee e=new Employee();
		
		System.out.println("Employee Id:" +e.empid);
		System.out.println("Employee grade:" +e.empgrade);
		System.out.println("Employee Salary:" +e.empsal);
		System.out.println("Perment Employee Status::" +e.pes);
		System.out.println("Employee Experiences:" +e.empexp);
		System.out.println("Working Days:" +e.workDays);
		System.out.println("Phone No:" +e.phno);
		System.out.println("Bonus Amount:" +e.bonusamt);

	}

}
