package com.oops;

import java.util.Scanner;

class Student3 {
	void calculateGrade(int marks) {

	}
}

class EngineeringStudent extends Student3 {
	@Override
	void calculateGrade(int marks) {
		if (marks <= 100 && marks >= 75) {
			System.out.println("Grade A");
		} else if (marks <= 74 && marks >= 60) {
			System.out.println("Grade B");
		} else if (marks <= 59 && marks >= 40) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
	}
}

class MedicalStudent extends Student3 {
	@Override
	void calculateGrade(int marks) {
		if (marks <= 100 && marks >= 80) {
			System.out.println("Grade A");
		} else if (marks <= 79 && marks >= 60) {
			System.out.println("Grade B");
		} else if (marks <= 59 && marks >= 35) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
	}
}

class ManagementStudent extends Student3 {
	@Override
	void calculateGrade(int marks) {
		if (marks <= 100 && marks >= 85) {
			System.out.println("Grade A");
		} else if (marks <= 84 && marks >= 65) {
			System.out.println("Grade B");
		} else if (marks <= 64 && marks >= 55) {
			System.out.println("Grade C");
		} else if (marks <= 54 && marks >= 35) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}
	}
}

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		System.out.println("1.Engineering Student \n2.Medical Student \n3.Management Student");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		Student3 st;
		switch (ch) {
		case 1 -> {
			System.out.println("Engineering Student Grades");
			st = new EngineeringStudent();
			st.calculateGrade(marks);
		}
		case 2 -> {
			System.out.println("Medical Student Grades");
			st= new MedicalStudent();
			st.calculateGrade(marks);
		}
		case 3 -> {
			System.out.println("Management Student Grades");
			st= new ManagementStudent();
			st.calculateGrade(marks);
		}
		}
		System.out.println("main method ended");

	}

}
