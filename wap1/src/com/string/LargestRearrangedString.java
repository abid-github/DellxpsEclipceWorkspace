package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * Given a string, construct a new string by rearranging the original string and
 * deleting characters as needed. Return the alphabetically largest string that
 * can be constructed respecting a limit as to how many consecutive characters
 * can be the same.
 * 
 * Example s = 'baccc' k = 2
 * 
 * The largest string, alphabetically, is 'cccba' but it is not allowed because
 * it uses the character 'c' more than 2 times consecutively. Therefore, the
 * answer is 'ccbca'.
 *
 * 
 * 
 */
public class LargestRearrangedString

{
	public static void main(String[] args) {

		System.out.println(largestString("yyyayy", 2));
		
		System.out.println(largestString("bbbaab", 2));
		System.out.println(largestString("baccc", 2));
	}

	private static String largestString(String s, int k) {
		char[] chs = s.toCharArray();

	HashMap<Character, Integer> map = new HashMap<>();

		StringBuilder sb = new StringBuilder();

		for (char ch : chs) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		Set<Entry<Character, Integer>> set = map.entrySet();
		ArrayList<Entry<Character, Integer>> list = new ArrayList<>(set);
		//System.out.println(list);

		Collections.sort(list, (a, b) -> (b.getKey().compareTo(a.getKey())));
		//System.out.println(list);
		
		int i = 0;
		while (i < list.size()) {
			Entry<Character, Integer> firstEntry = list.get(i);
			char firstKey = firstEntry.getKey();
			int firstVal = firstEntry.getValue();

			if (firstVal > k) {
				// reduce by k
				int count = 0;
				while (count < k) {
					sb.append(firstKey);
					count++;
				}
				firstEntry.setValue(firstVal - k);

				// Just add 1 next character
				Entry<Character, Integer> secondEntry = list.get(i + 1);
				char secondKey = secondEntry.getKey();
				int secondVal = secondEntry.getValue();

				if (secondVal > 0) {
					sb.append(secondKey);
					secondEntry.setValue(secondVal - 1);
				}
			} 
			
			else if (firstVal > 0 && firstVal <= k) {
				int count = 0;
				while (count < firstVal) {
					sb.append(firstKey);
					count++;
				}
				firstEntry.setValue(0);
			} 
			
			else
			{
				// firstVal == 0
				i++;
			}
		}

		return sb.toString();
	}
}