package com.string;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x =  "Welcome to JAVA world";
		
		String [] y= x.split(" ");
		
		for ( int i = y.length-1; i>=0 ; i--)
			
		{
			System.out.print(" " +y[i]);
		}
		
		

	}

}