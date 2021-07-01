package com.collection.programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class RemoveNullHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr1 = { "abid", "Hussain", "aslam", " ", "", "Hussain", null,null };

		List<String> lt = Arrays.asList(arr1);

		HashSet<String> hs1 = new HashSet<>(lt);
		System.out.println(hs1);

		boolean b = hs1.contains(null);
		System.out.println(b);

		// hs1.remove(null);
		// hs1.remove("");
		hs1.remove(" ");
		
		
		// System.out.println(hs1);

		for (String data : hs1) {
			if (data == null || data == "") {
				data = "UNWANTED";

			}
			String data1 = data.toUpperCase();

			System.out.println(data1);
		}

		/*
		 * Iterator<String> it = hs1.iterator();
		 * 
		 * while (it.hasNext()) { 
		 * String value = it.next();
		 * System.out.println("List Value:" + value); 
		 * if (value.equals(null))
		 * hs1.remove(value); 
		 * } 
		 * System.out.println(hs1);
		 */

	}
}
