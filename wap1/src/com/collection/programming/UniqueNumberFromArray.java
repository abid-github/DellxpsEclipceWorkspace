package com.collection.programming;

import java.util.ArrayList;

public class UniqueNumberFromArray {

	public static void main(String[] args) {

		int a[] = { 5, 6, 6, 6, 5, 15, 1, 2, 3 };

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++)

		{

			if (!ab.contains(a[i])) {
				ab.add(a[i]);

			}

		}
		System.out.println(ab);

	}
}
