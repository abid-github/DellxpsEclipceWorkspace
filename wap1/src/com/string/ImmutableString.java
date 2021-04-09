package com.string;

public class ImmutableString {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("abid");
		str.concat("hussain");
		System.out.println(str); // abid
		

		StringBuffer sb = new StringBuffer("abid");
		sb.substring(1, 3); // its returning string

		System.out.println(sb);

		System.out.println(sb.substring(1, 3));

		sb.append("hussain");

		System.out.println(sb);// abidhussain
		System.out.println(sb.append("hussain"));

	}

}
