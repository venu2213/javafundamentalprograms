package com.constructors;

public class Student {
	
	 int id;
	 String name;
	 String course;
	 
	 Student(){
		 this(22);
	 }
	 
	 Student(int id){
		 this(22,"venu");
	 }
	 Student(int id,String name){
		 this(id,"venu","java");
	 }
	 Student(int id,String name,String course){
		 this.id=id;
		 this.name=name;
		 this.course=course;
	 }
	 
	 void show() {
		 System.out.println("Student id:" +id);
		 System.out.println("Student name:" +name);
		 System.out.println("Student course:" +course);
		 System.out.println("---------------------------------------");
	 }
	

	public static void main(String[] args) {
		 
		System.out.println("main method started");
		
		Student s=new Student();
		s.show();
		Student s1=new Student(43);
		s.show();
		Student s2=new Student(224,"vamsi");
		s.show();
		Student s3=new Student(224,"vamsi","jsf");
		s.show();
		
		System.out.println("main method ended");

	}

}
