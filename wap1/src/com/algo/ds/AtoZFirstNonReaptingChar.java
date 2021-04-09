package com.algo.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unused")
public class AtoZFirstNonReaptingChar {

	public static void main(String[] args) {

		String s = "aaabccd";
		System.out.println(firstNonReptch(s));
	}

	static char firstNonReptch(String s) {
		 char [] carr = s.toCharArray();
	     int [] temp =new int [26];
	      
	      for (  char data : carr )
	      {
	    	  temp[ data-'a']++;
	      }
	      
	      
	      for ( char data : carr  )
	    	  
	      {
	    	  if ( temp[ data-'a'] ==1)
	    	  {
	    		  return data;
	    	  }  
	      }
	      
	      return '_';
	      
		
		

		/*
		 * for (int i = 0; i < s.length(); i++)
		 * 
		 * { boolean flag = false; 
		 * for (int j = 0; j < s.length(); j++) {
		 * 
		 * if (s.charAt(i) == s.charAt(j) && (i != j)) 
		 * {
		 * 
		 * flag = true; 
		 * break;
		 * 
		 * }
		 * 
		 * } if (!flag)
		 * 
		 * return s.charAt(i);
		 * 
		 * }
		 * 
		 * return '_';
		 */

		/*
		 * HashMap<Character, Integer> char_counts = new HashMap<>();
		 * 
		 * for (int i = 0; i < s.length(); i++) { 
		 * char c = s.charAt(i);
		 * 
		 * if (char_counts.containsKey(c) == false)
		 *  { char_counts.put(c, 1);
		 * 
		 * } else 
		 * char_counts.put(c, char_counts.get(c) + 1);
		 * 
		 * }
		 * 
		 * for (int i = 0; i < s.length(); i++) { 
		 * char c = s.charAt(i);
		 * 
		 * if (char_counts.get(c) == 1) return c;
		 * 
		 * } 
		 * return '_';
		 */
		/*
		 * Set < Map.Entry<Character , Integer >> setview = char_counts.entrySet();
		 * 
		 * 
		 * 
		 * for ( Map.Entry<Character , Integer> data : setview ) {
		 * 
		 * if ( data.getValue()==1 ) { return data.getKey(); } } return '_';
		 */

	}

}
