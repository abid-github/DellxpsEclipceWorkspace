package com.collection;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class TraversalOfMap {

	public static void main(String[] args) {

		/**
		 * The Map.Entry interface enables you to work with a map entry.
		 * 
		 * Using for-each loop for iteration over Map.
		 * 
		 * getKey(), getValue() and setValue() is the methods of Map.Entry<KV>
		 * interface.
		 * 
		 * Set<Map.Entry> entrySet() – Returns theSet view of the entire map.
		 *
		 * Each of these set elements is a Map.Entry object.
		 * 
		 * 
		 */

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(39, "abid");
		hmap.put(6, "myra");
		hmap.put(3, "mysha");
		hmap.put(37, "iram");
		System.out.println(hmap);

		// Using entrySet() to get the entry's of the map

		Set<Map.Entry<Integer, String>> st = hmap.entrySet();

		for (Map.Entry<Integer, String> data : st) {

			System.out.println("Before Change " + data.getKey()+ "  " + data.getValue());

			String xyz = data.getValue().toUpperCase().concat(" HUSSAIN");

			data.setValue(xyz);

			System.out.println("After Change " + data.getKey() + "  " + data.getValue());

		}

	}

}
