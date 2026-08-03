package com.constructors;

public class Ternary {

	public static void main(String[] args) {
		 int num=10;
		 String pn=(num>=0)?"positive":"Negative";
		 System.out.println("The Number is pos or Neg:" +pn);
		 
		 int marks=32;
		 String res=(marks>=90)?"Grade A":(marks>=75)?"Grade B":(marks>=60)?"Grade C":(marks>=40)?"Grade D": "fail";
		 System.out.println("The Grade is:" +res);

	}

}
