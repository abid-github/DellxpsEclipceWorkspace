package com.string;

public class ImpDeleteAllOccurance {

	public static void main(String[] args) {

		String x = "delhidesi";

		char[] y = x.toCharArray();
		char givenchar = 'd';
		String temp = "";

		for (char data : y)

		{
			if (data != givenchar) 
			{
				temp = temp + data;
			}

		}

		System.out.print(temp);
	}

}
