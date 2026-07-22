package com.constructors;

import java.util.Scanner;

public class CricketPlayer {
	
	String pname;
	int matches;
	double t_runs;
	
	CricketPlayer(String name,int match,double runs){
		pname=name;
		matches=match;
		t_runs=runs;
		
	}
	void average() {
		double a_runs=t_runs/matches;
		System.out.println("Average Runs:" +a_runs);
	}
	void show() {
		System.out.println("Player Name:" +pname);
		System.out.println("Matches Played:" +matches);
		System.out.println("Total Runs:" +t_runs);
	}

	public static void main(String[] args) {
		
		System.out.println("main method started!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player Name:");
		String p=sc.nextLine();
		System.out.println("Enter matches Played:");
		int m=sc.nextInt();
		System.out.println("Enter Total Runs:");
		double r=sc.nextDouble();
		CricketPlayer c=new CricketPlayer(p,m,r);
		c.show();
		c.average();
		
		
		System.out.println("main method ended!");
		 

	}

}
