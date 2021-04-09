package com.number;

import java.util.Scanner;

public class PrintTabelOfNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner( System.in);
		System.out.println("Enter the number of wanted tabel :");
	int table = sc.nextInt();
		for ( int i =1 ; i<= 10; i++)
			
		{
			System.out.println(table+"*"+i+"="+table *i);
			
		}
		

	}

}
