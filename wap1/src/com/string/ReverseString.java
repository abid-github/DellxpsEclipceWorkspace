package com.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Li ril";
		name = name.toLowerCase();
		name = name.replace(" ", "");
		
		
		
		String temp = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			
			
			temp = temp + name.charAt(i);
			
			//System.out.print( name.charAt(i));

		}

		System.out.println(temp);

		if (temp.equals(name)) {
			System.out.println("palindrom");

		}

		else {
			System.out.println("Not Palindrom");
		}

// By inbuild method 

		String name1 = "I Love You";

		StringBuffer sb = new StringBuffer(name1);

		sb.reverse();

		System.out.println(sb);

	}

}
