package com.collection;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hmap = new HashMap<>();
		
		String r1 = hmap.put(41, "abid");
		hmap.put(38, "iram");
		hmap.put(39, "iram");
		hmap.put(7, "myra");
		String r2 = hmap.put(7, "myra");
		//hmap.put(null, "test1");
		hmap.put(null, "test2");
		hmap.put(null, "test3");

		System.out.println(hmap);
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("Size of map is:- " + hmap.size());

		if (hmap.containsKey(null)) {
			String name = hmap.get(null);
			System.out.println(name);
		}
System.out.println(hmap.keySet());
		System.out.println(hmap.values());

	}

}
