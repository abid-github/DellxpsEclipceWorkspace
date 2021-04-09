package com.array;

import java.util.HashSet;

//unique from from array

public class UniqeValuesInArray {

	public static void main(String[] args) {

		String[] sa = { "abid", "abid", "mango", "grapes", "apple", "abid", "abid", "mango" };

		HashSet<String> hst1 = new HashSet<String>();
		HashSet<String> hst2 = new HashSet<String>();

		for (String data : sa) {

			if (!hst1.contains(data))

			{
				hst1.add(data);
			} else

				hst2.add(data);
		}

		System.out.println("Unique values" + hst1);
		System.out.println("duplicates values" + hst2);

	}
}