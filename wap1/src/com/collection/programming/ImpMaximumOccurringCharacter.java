package com.collection.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImpMaximumOccurringCharacter {

	public static void main(String[] args) {

		String x = "GOD_BLESS_YOU_MYSHA_HUSSAIN";
		char[] xc = x.toCharArray();
		HashMap<Character, Integer> hp = new HashMap<>();
		for (char data : xc) {
			if (!hp.containsKey(data)) {
				hp.put(data, 1);
			} else {
				hp.put(data, hp.get(data) + 1);
			}
		}
		
		System.out.println(hp);
		// Set<Map.Entry<Character, Integer>> st = hp.entrySet();
		int maxval = 0;
		char maxkey = ' ';

		for (Map.Entry<Character, Integer> data : hp.entrySet()) {
			if (data.getValue() > maxval) {
				maxval = data.getValue();
				maxkey = data.getKey();
			}
		}
		System.out.println(maxkey + " -have a maximum occurance ,that is = " + maxval + " in given statement. ");
	}

}
