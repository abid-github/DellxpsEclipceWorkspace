package com.string;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//with count 
@SuppressWarnings("unused")
public class DuplicateWords {

	public static void main(String[] args) {

		String str = "good boy and good girl and all good we all love each other";
		String[] a = str.split(" ");
		// System.out.println(Arrays.toString(a));
		Map<String, Integer> hmap = new HashMap<>();
		for (String data : a) {
			if (hmap.containsKey(data) == false) {
				hmap.put(data, 1);
			} else {
				hmap.put(data, hmap.get(data) + 1);
			}
			// hmap.put(data, hmap.getOrDefault(data, 0)+1);
		}
		System.out.println(hmap);

		// Set<Map.Entry<String, Integer>> st = hmap.entrySet();

		// Set<String> stk = hmap.keySet();
		// System.out.println(stk);
		// System.out.println(st);

		/*
		 * ArrayList<Entry<String, Integer>> list = new ArrayList<>(st);
		 * System.out.println(list);
		 */

		for (Map.Entry<String, Integer> dt : hmap.entrySet())

		{
			if (dt.getValue() > 1) {
				System.out.println("count of duplicate word  " + dt.getKey() + "  is " + dt.getValue());
			}
		}

	}

}