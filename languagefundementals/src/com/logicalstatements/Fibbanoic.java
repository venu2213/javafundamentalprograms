package com.logicalstatements;

import java.util.Scanner;

public class Fibbanoic {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the range to print:");
		 int n=sc.nextInt();
		 fibbanoicSeries(n);
		 System.out.println( );
		 System.out.println("main method ended");

	}
	static void fibbanoicSeries(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1 + " " +n2 +" ");
		for(int i=2;i<=n-1;i++) {
			n3=n1+n2;
			System.out.print(n3 +" ");
			n1=n2;
			n2=n3;
		}
	}

}
