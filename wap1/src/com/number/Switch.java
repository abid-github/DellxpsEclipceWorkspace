

package com.number;

import java.util.Scanner;

public class Switch {

	
	
	public static void main(String[] args) {

		
	
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String cont;
		int a, b, result;
		String s;

		do {
			System.out.println("enter first number");
			a = scn.nextInt();
			System.out.println("enter second number");
			b = scn.nextInt();
			System.out.println("enter required airthmatic operation");
			s = scn.next();

			switch (s)

			{
			case "+":

				result = a + b;
				System.out.println(result);
				break;

			case "-":
				result = a - b;
				System.out.println(result);
				break;
			case "*":
				result = a * b;
				System.out.println(result);
				break;
			case "/":
				result = a / b;
				System.out.println(result);
				break;

			default:
				System.out.println("not valid operation");

			}
			System.out.println("do you want to continue ,plz press Yor Y");
			cont = scn.next();
		} while (cont.equalsIgnoreCase("y"));

	}

}
