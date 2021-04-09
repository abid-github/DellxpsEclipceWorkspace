package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMap {

	public static void main(String[] args) {

		Map<String, String> unsortedmap = new HashMap<String, String>();

		unsortedmap.put("apple", "red");
		unsortedmap.put("banana", "yellow");
		unsortedmap.put("grapes", "green");
		unsortedmap.put("kiwi", "light green");

		Set<Map.Entry<String, String>> st = unsortedmap.entrySet();

		for (Map.Entry<String, String> data : st)

		{
			System.out.println("unsorted key : " + data.getKey());
		}

		Map<String, String> sortedmap = new TreeMap<String, String>(unsortedmap);

		Set<Map.Entry<String, String>> st1 = sortedmap.entrySet();

		for (Map.Entry<String, String> data : st1)

		{
			System.out.println("sorted key : " + data.getKey());
		}

	}

}