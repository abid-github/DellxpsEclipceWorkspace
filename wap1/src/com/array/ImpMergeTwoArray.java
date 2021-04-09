package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImpMergeTwoArray {

	public static void main(String[] args) {

		int[] a = { 5, 10, 23, 29, 7 };
		int[] b = { 3, 5, 8, 100 };

		int al = a.length;
		int bl = b.length;
		int cl = al + bl;

		int[] c = new int[cl];

		for (int i = 0; i < al; i++)

		{
			c[i] = a[i];
		}

		for (int i = 0; i < bl; i++)

		{
			c[al + i] = b[i];
		}

		Arrays.sort(c);

		System.out.println(Arrays.toString(c));

		for (int d : c) {
			System.out.print(d + " ");
		}

		System.out.println("");

		// In case of String Array by ArrayList,

		String[] str1 = { "a", "b" };

		String[] str2 = { "c", "d" };

		List<String> arl1 = new ArrayList<>(Arrays.asList(str1));

		List<String> arl2 = new ArrayList<>(Arrays.asList(str2));

		arl1.addAll(arl2);
		
		//will get java.lang.UnsupportedOperationException error if will do below ,bcz  aslist return immutable arry
		
		/**
		 * List<String> imt1 = Arrays.asList(str1);
		imt.add("e");
		 */
		System.out.println(arl1);

		/**
		 * In case of int array - ArrayList is not a good option with asList method. as int[] a
		 * is primitive array , not a Integer type.
		 * 
		 */

	}

}
