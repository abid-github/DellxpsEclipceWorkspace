package com.string;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "*&^%$#####()Abid Hussain - 1979 ";

		s = s.replaceAll("[^a-z0-9A-Z ]", "");

		//s.replaceAll("[^a-z0-9A-z]" , "");

		System.out.println(s);

	}

}
