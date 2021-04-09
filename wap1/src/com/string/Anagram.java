package com.string;

import java.util.Arrays;

public class Anagram {

	//"New York Times" = "monkeys write"
	//"Mother in Law"= " woman Hitler"
	
	/*
	 * An anagram is a word or phrase formed by rearranging the letters of a
	 * different word or phrase, typically using all the original letters exactly
	 * once.
	 */
	public static void main(String[] args) {

		String str1 = "New York Times";
		 str1 = str1.toLowerCase();
		str1 = str1.replace(" ", "");

		 //str1.toLowerCase();

		// System.out.println(str1);

		// String str3= "y";
		// System.out.println(str1.concat(str3));

		String str2 = "monkeys write";
		str2 = str2.toLowerCase();
		str2 = str2.replace(" ", "");

		char[] strarray1 = str1.toCharArray();
		char[] strarray2 = str2.toCharArray();

		Arrays.sort(strarray1);
		Arrays.sort(strarray2);
		
		

		boolean result = Arrays.equals(strarray1, strarray2);

		if (result == true) {
			System.out.println("Both String is 'ANAGARM'");

		}

		else {
			System.out.println("Both String is not 'ANAGARM'");
		}

	}
}
