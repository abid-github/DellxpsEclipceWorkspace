package com.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write a program to find max and min in an array

		int[] arr = { 5, 10, 4, 3, 2 };

		int max = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			
			if (arr[i] < min)

				min = arr[i];

		}

		System.out.println("max value " + max + "min value" + min );
	}

}
