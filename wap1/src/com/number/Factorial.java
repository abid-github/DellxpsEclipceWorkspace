package com.number;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5*4*3*2*1

		int number = 5;
		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

}