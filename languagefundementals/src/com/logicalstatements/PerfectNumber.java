package com.logicalstatements;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter range to print...");
		 int n=sc.nextInt();
		 int sum=0;
		 for(int i=1;i<n;i++) {
			 if(n%i==0) {
				 System.out.println(i);
				 sum=sum+i;  
			 }
		 }
		 System.out.println(sum);
		 if(n==sum) {
			 System.out.println("is perfect");
		 }else {
			 System.out.println("is not perfect");
		 }
		 System.out.println("main method ended");

	}

}
