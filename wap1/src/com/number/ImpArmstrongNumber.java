package com.number;

import java.util.Scanner;

public class ImpArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// take power of all digit of total digits of that number and add , if its equal
		// to itself .

		// 1+125+27= 153, narcissistic number
		// 0,1,,153,370,371,407 , etc

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check : ");
		int number = sc.nextInt();

		int temp1 = number;

		int length = 0;

		while (temp1 != 0) {
			temp1 = temp1 / 10;
			//System.out.println(temp1);

			length = length + 1;
		}

		 //System.out.println(length);

		int temp2 = number;

		int arm = 0;

		while (temp2 != 0)

		{
			int rem = temp2 % 10;

			int mul = 1;

			for (int i = 1; i <= length; i++)

			{
				mul = mul * rem;

			}
			temp2 = temp2 / 10;
			arm = arm + mul;
		}

		// System.out.println(arm);

		if (number == arm)

			System.out.println(number + " Number is armastrong number");
		else
			System.out.println(number + " Number is NOT armstrong number");
	}

}
