package com.oops;

public class TestDriver9 {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Attendance d=new Developer();
		 d.markAttendance();
		 Attendance t=new Tester();
		 t.markAttendance();
		 Attendance m=new Manager();
		 m.markAttendance();
		 
		 System.out.println("main method ended");

	}

}
