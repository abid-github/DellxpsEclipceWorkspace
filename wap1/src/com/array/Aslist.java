package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.apache.commons.lang3.ArrayUtils;

public class Aslist {

	public static void main(String[] args) {
		// array to arraylist

		String[] a1 = { "a", "b", "c", "d" };

		List<String> arlist1 = Arrays.asList(a1);

		ArrayList<String> arlist2 = new ArrayList<String>(Arrays.asList(a1));

		System.out.println( "print arlist1--" +arlist1);
		System.out.println(arlist2);

		// contains for certain value

		boolean b = Arrays.asList(a1).contains("a");
		System.out.println(b);
		
		

		int[] intArray = { 1, 2, 3, 4, 5 };
		
		//ArrayUtils.reverse(intArray);
		
		System.out.println(Arrays.toString(intArray));

	}

}
