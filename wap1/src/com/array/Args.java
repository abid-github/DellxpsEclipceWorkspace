package com.array;

public class Args {

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i <= args.length; i++) { System.out.println(args[i]); //Index
		 * 0 out of bounds for length 0 }
		 */

		String[] external = { "X", "y", "z" };

		args = external;

		for (String ver : args) {

			System.out.println(ver);
		}

	}

}
