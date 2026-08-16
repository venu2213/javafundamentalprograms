package com.arrays;

import java.util.Scanner;

public class StdMarksCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[10];
		int countAbove40 = 0, countBelow40 = 0, highest = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter marks of student " + (i + 1) + ": ");
			marks[i] = sc.nextInt();

			if (marks[i] >= 40) {
				countAbove40++;
			} else {
				countBelow40++;
			}

			if (marks[i] > highest) {
				highest = marks[i];
			}
		}

		System.out.println("Students scoring 40 or above: " + countAbove40);
		System.out.println("Students scoring below 40: " + countBelow40);
		System.out.println("Highest mark: " + highest);

	}

}
