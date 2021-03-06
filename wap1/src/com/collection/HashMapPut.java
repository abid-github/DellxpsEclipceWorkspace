package com.collection;

import java.util.HashMap;

public class HashMapPut {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<>();

		hmap.put("a", 500);
		hmap.put("b", 1000);
		hmap.put("c", 3000);

		System.out.println("HashMap:\n " + hmap.toString());

		int k = hmap.put("a", 200);
		Integer l = hmap.put("d", 200);
		Integer m = hmap.put("d", 200);

		// getting java.lang.NullPointerException for int n = hmap.put ( "e", 1800);

		System.out.println("HashMap:\n " + hmap.toString());
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);

		HashMap<Integer, String> hmap1 = new HashMap<>();

		hmap1.put(10, "Geeks");
		hmap1.put(15, "4");
		hmap1.put(20, "Geeks");
		hmap1.put(25, "Welcomes");
		hmap1.put(30, "You");

		System.out.println(hmap1);

		String x = hmap1.put(50, "New Key");
		System.out.println(hmap1);
		System.out.println(x);

		hmap1.put(30, "null");
		hmap1.put(10, "Geeks1");

		String r1 = hmap1.putIfAbsent(10, "Geeks2");
		String r2 = hmap1.put(10, "Geeks3");
		String r3 = hmap1.putIfAbsent(26, "GO");
		String r4 = hmap1.putIfAbsent(25, "NO");
		String r5 = hmap1.putIfAbsent(30, "GO");

		System.out.println(hmap1);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

		System.out.println(hmap1);

		String p1 = hmap1.remove(50);
		String p2 = hmap1.remove(10);
		boolean p3 = hmap1.remove(15, "5");
		String p4 = hmap1.replace(50, "new key1");
		boolean p5 = hmap1.replace(20, "Geeks", "Geeks2");
		boolean p6 = hmap1.replace(20, "Geeks", "Geeks3");

		System.out.println(hmap1);

		System.out.println(p1); // null
		System.out.println(p2);// Geeks3
		System.out.println(p3);// false
		System.out.println(p4);// null
		System.out.println(p5);// true
		System.out.println(p6);// false

		System.out.println(hmap1.size());
		System.out.println(hmap1);

		System.out.println(hmap1.keySet());
		System.out.println(hmap1.values());
		System.out.println(hmap1.entrySet());

	}
}
