package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {

		/*
		 * // Java Program to demonstrate simple pattern searching //A regular
		 * expression, specified as a string, must first be compiled // into an instance
		 * of this class. The resulting pattern can // then be used to create a Matcher
		 * object that can match // arbitrary character sequences against the regular
		 * expression.
		 */		
		/*
		 * Pattern p = Pattern.compile("ge*"); 
		 * Matcher m =p.matcher("geeksgforgeeks.orgg");
		 * 
		 * 
		 * while (m.find()) 
		 * { System.out.println("Pattern found from " + m.start() +
		 * " to " + (m.end()-1)); } 
		 * // Java program to demonstrate working of splitting
		 * a text by a given pattern
		 * 
		 * String text = "geeks1for2geeks3";
		 * 
		 * // String [] texta = text.split("\\d");
		 * 
		 * Pattern p1 = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
		 * 
		 * String[] regex = p1.split(text);
		 * 
		 * for (String d : regex) { System.out.println(d); }
		 */

		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		
		System.out.println(b);
		/*
		 * A matches method is defined by this class as a convenience for when a regular
		 * expression is used just once. This method compiles an expression and matches
		 * an input sequence against it in a single invocation. The statement
		 */

		//boolean b = Pattern.matches("a*b", "aaaaab");
		/*
		 * is equivalent to the three statements above, though for repeated match
		 */

	}

}