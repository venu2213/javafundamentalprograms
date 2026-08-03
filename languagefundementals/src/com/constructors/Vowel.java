package com.constructors;

import java.util.Scanner;

public class Vowel {
	
	 

	public static void main(String[] args) {
		 System.out.println("main method started");
		 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a Character:");
		  char ch=sc.next().charAt(0);
		  ch=Character.toLowerCase(ch);
		  String res=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?"vowel":"Constant";
		  System.out.println("outpt:" +res);
		  
		  
		 
		 System.out.println("main method ended");

	}

}
