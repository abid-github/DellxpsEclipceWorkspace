package com.collection.programming;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 2, 2, 3, 14, 18, 18, 20, 20, 3, 1, 2 };

		HashMap<Integer, Integer> hp = new HashMap<>();
		for (int data : arr)
		{
			if (hp.containsKey(data) == false) {
				hp.put(data, 1);
			} else {
				hp.put(data, hp.get(data) + 1);

				/*
				 * for (int data : arr)
				 * 
				 * {
				 * 
				 * Integer count = hmap.get(data);
				 * 
				 * if (count == null) { hmap.put(data, 1); } else { count = count + 1;
				 * hmap.put(data, count); }
				 * 
				 * }
				 */
			}

		}
		System.out.println(hp);

		//Set<Entry<Integer, Integer>> st = hp.entrySet();

		for (Entry<Integer, Integer> data : hp.entrySet())

		{
			if (data.getValue() > 1)

				System.out.println(data.getKey() + " is duplicate value ");
		}

	}

}
