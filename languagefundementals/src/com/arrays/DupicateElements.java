package com.arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DupicateElements {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Unique Elements:");
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.println(arr[i] + " ");
			}
		}

	}

}
