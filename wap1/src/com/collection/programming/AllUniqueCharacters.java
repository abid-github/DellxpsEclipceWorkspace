package com.collection.programming;

import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class AllUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "abcb";
		char[] xa = x.toCharArray();
		// int size = xa.length;
		HashMap<Character, Integer> hp = new HashMap<>();
		for (char data : xa) {
			if (!hp.containsKey(data)) {
				hp.put(data, 1);
			} else {
				hp.put(data, hp.get(data) + 1);
			}
		}

		/*
		 * int i = 0;
		 * 
		 * while (i != size) {
		 * 
		 * if (hp.containsKey(xa[i]) == false) { hp.put(xa[i], 1); } else
		 * 
		 * { hp.put(xa[i], hp.get(xa[i]) + 1); }
		 * 
		 * i++;
		 * 
		 * }
		 */

		System.out.println(hp);
		
		
		System.out.println(hp.keySet());
		System.out.println(hp.values());

		/*
		 * Set<Map.Entry<Character, Integer>> st = hp.entrySet();
		 * 
		 * System.out.println(st);
		 * 
		 * for (Map.Entry<Character, Integer> data : st)
		 */
		for (Map.Entry<Character, Integer> data : hp.entrySet())

		{

			System.out.println("Occurance of character " + data.getKey() + " -" + data.getValue() + " times ");

			/*
			 * if (data.getValue() > 1) {
			 * System.out.println("Given word dosen't make from unique Characters ");
			 * System.exit(0);
			 * 
			 * }
			 */

		}

		// System.out.println(" Given word posses only unique Characters ");

	}
}
