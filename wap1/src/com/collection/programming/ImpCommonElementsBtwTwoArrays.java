package com.collection.programming;

import java.util.HashSet;

public class ImpCommonElementsBtwTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 4, 2, 3, 5, 6, 7, 4 };
		int[] arr2 = { 5, 6, 7, 6, 10, 20, 33 };

		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		for (int data : arr1) {
			hs1.add(data);
		}
		for (int data : arr2) {
			hs2.add(data);
		}

		for (int data : hs2) {
			if (hs1.contains(data) == true) {
				System.out.println(data);
			}

			/**
			 * for ( int no : hs2) { boolean b = hs1.add(no); if (b== false ) {
			 * System.out.print(no +" "); }
			 * 
			 * 
			 */
		}

	}

}
