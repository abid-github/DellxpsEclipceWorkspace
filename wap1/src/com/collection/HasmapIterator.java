package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;

import java.util.Set;

public class HasmapIterator {

	
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(39, "abid");
		hmap.put(6, "myra");
		hmap.put(3, "mysha");
		hmap.put(37, "iram");
		System.out.println(hmap);

		// Display content using Iterator//

		Set<Map.Entry<Integer, String>> set = hmap.entrySet();
		System.out.println(set);

		Iterator<Map.Entry<Integer, String>> itr = set.iterator();

		while (itr.hasNext()) {
			
			@SuppressWarnings("rawtypes")
			Map.Entry ment = (Map.Entry) itr.next();

			//Entry<Integer, String> ment = itr.next();
			System.out.print("key is: " + ment.getKey() + " & Value is: ");
			System.out.println(ment.getValue());

		}

		// Get values based on key//
		String var = hmap.get(39);
		System.out.println("Value at index/key 39 is: " + var);

		// Remove values based on key//

		hmap.remove(39);
		System.out.print("Map key and values after removal:" + hmap);

	}

}
