package com.collection.programming;

import java.util.ArrayList;

public class PrintCountAndSumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 4, 7, 8, 9, 12, 17, 4, 6 };

		ArrayList<Integer> evenal = new ArrayList<>();
		ArrayList<Integer> oddal = new ArrayList<Integer>();

		for (int data : a) {
			if (data % 2 == 0)
				evenal.add(data);

			else
				oddal.add(data);
		}

		int sume = 0;

		for (int data : evenal)

		{

			sume = sume + data;

		}
		System.out.println("List of even number " + evenal);
		System.out.println("Total count of even number " + evenal.size());
		System.out.println("Sum of Even Number" + sume);
		System.out.println("****************************************");

		System.out.println("List of odd number ");
		int sumo = 0;

		for (int data : oddal)

		{
			System.out.print(data + " ");
			sumo = sumo + data;
		}
		// System.out.print("\n");
		System.out.println("\nTotal count of odd number " + oddal.size());
		System.out.println("Sum of odd Number" + sumo);

	}

}
