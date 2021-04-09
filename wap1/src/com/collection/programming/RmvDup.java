package com.collection.programming;

import java.util.HashSet;

public class RmvDup {

	public static void main(String[] args) {

		String s = "hussain";
		System.out.println(removeDuplicates(s));

	}

	public static String removeDuplicates(String str) {

		HashSet<Character> st = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++)

		{
			Character c = str.charAt(i);

			if (st.contains(c) == false) {
				st.add(c);
				sb.append(c);
			}
		}

		return sb.toString();
	}
}
