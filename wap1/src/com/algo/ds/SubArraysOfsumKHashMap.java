package com.algo.ds;

import java.util.HashMap;

public class SubArraysOfsumKHashMap{

	static int sum(int[] a, int k) {

		int res = 0;

		HashMap<Integer, Integer> prevsum = new HashMap<>();
		int currsum = 0;

		for (int i = 0; i < a.length; i++)

		{
			currsum = currsum + a[i];

			if (currsum == k)
				res++;

			if (prevsum.containsKey(currsum - k))

				res = res + prevsum.get(currsum - k);

			Integer count = prevsum.get(currsum);

			if (count == null)
				prevsum.put(currsum, 1);
			else
				prevsum.put(currsum, count + 1);
		}

		/*
		 * for (int i = 0; i < a.length; i++)
		 * 
		 * { int sum = 0;
		 * 
		 * for (int j = i; j < a.length; j++) {
		 * 
		 * sum = sum + a[j];
		 * 
		 * if (sum == k) res++; } }
		 */
		
		return res;
	}

	public static void main(String[] args) {

		int[] a = { 10, 2, -2, -20, 10, -10 };
		// int a[] = { 23, 15, 2, 4, 8, 9, 5, 10 };
		int k = -10;

		// { 10, 2, -2, -20, 10 ,-10} { 10, 2, -2, -20, } {2, -2, -20, 10} {-20, 10 }
		// {-10}

		System.out.println(sum(a, k));

	}

}
