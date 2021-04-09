package com.string;

public class SbVsString {

	public static void main(String[] args) {

		// Convert String to StringBuffer

		// delete()

		String str1 = "ashjklmo#";

		StringBuffer sb = new StringBuffer(str1);
		// sb.deleteCharAt(1);
		sb.delete(1, 4);
		System.out.println(sb);

		// reverse()

		// sb.reverse();
		// System.out.println(sb);

		// Convert StringBuffer to string

		StringBuffer sb1 = new StringBuffer("i love you");
		System.out.println(sb1);
		String x = sb1.toString();
		System.out.println(x);

	}

}