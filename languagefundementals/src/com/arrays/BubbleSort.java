package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Before Swapping:");
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count++;

			}
			count1++;
			if (!flag) {
				flag = true;
				break;
			}
		}
		System.out.println("Count:" + count);
		System.out.println("Count1:" + count1);
		System.out.println("After Swapping:");
		System.out.println(Arrays.toString(arr));
		System.out.println("main method ended");

	}

}
