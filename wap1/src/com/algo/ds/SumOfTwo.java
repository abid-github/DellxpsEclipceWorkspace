package com.algo.ds;

import java.util.HashSet;

public class SumOfTwo {

	static boolean sm(int[] a, int[] b, int v) {

		/*
		 * for (int i = 0; i < a.length; i++)
		 * 
		 * { for (int j = 0; j < b.length; j++)
		 * 
		 * { int temp = a[i] + b[j];
		 * 
		 * if (temp == v) 
		 * { System.out.println(temp);
		 *  return true; 
		 *  } 
		 *  }
		 * 
		 * } return false;
		 */

		HashSet<Integer> compliments = new HashSet<>();

		for (int data : a) {

			int diff = v - data;
			compliments.add(diff);
		}

		for (int data : b) {

			if (compliments.contains(data)) {

				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 0, 4, 3, 10};
		int[] b = { 3, 2 ,-1};
		int v = 9;

		System.out.println(sm(a, b, v));

	}

}
