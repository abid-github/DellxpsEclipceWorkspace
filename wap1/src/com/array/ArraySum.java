package com.array;

public class ArraySum {

	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 0 };

		int[] klm = { 3, 2, 1, 50 };

		SumMethod.SUM(klm);

		int sum = 0;

		for (int e : a) {
			sum = sum + e;
		}

		System.out.println("sum of int Array by for each =" + sum);

		int sumn = 0;
		for (int i = 0; i < a.length; i++) {
			sumn = sumn + a[i];
		}

		System.out.println("sum of int Array by for loop =" + sumn);
	}

}