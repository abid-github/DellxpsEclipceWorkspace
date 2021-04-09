package com.string;

public class RotationalOrNot {

	public static void main(String[] args) {

		String originalString = "PEACOACK";
		String keyString = "EACOACKP";

		originalString = originalString.concat(originalString);

		if (originalString.contains(keyString))

			System.out.println("is rotatinal");
		else

			System.out.println("not rotatinal");

	}

}