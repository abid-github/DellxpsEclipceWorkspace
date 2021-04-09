package com.collection.programming;

import java.util.HashSet;

public class RemoveDuplicates {

	static String removeDuplicates(String str) {

		char[] strcarr = str.toCharArray();

		HashSet<Character> hst = new HashSet<>();
		
		for (Character data : strcarr) {
			hst.add(data);
		}

		return hst.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hussain";

		System.out.println(RemoveDuplicates.removeDuplicates(str));

	}

}
