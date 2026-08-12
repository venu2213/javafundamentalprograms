package com.logicalstatements;

import java.util.Scanner;

public class SumofEven {

	 void main(String[] args) {
		 System.out.println("main method started");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter which range to print..:");
		 int n=sc.nextInt();
		 int sum=sumofEven(n);
		 System.out.println( );
		 System.out.println("Sum of Even Numbers:" +sum);
		 System.out.println("main method ended");

	}

	 int sumofEven(int n) {
		 int sum=0;
		 for(int i=1;i<n;i++){
			 if(i%2==0) {
				 System.out.print(i + " ");
				 sum=sum+i;
			 }
		 }
		 
		return sum;
	}

}
