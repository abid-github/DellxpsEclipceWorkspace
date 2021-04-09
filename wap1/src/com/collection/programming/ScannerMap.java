package com.collection.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerMap {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter Map Size");
		int n = sn.nextInt();
		
	

		Map<String, Integer> hasmp = new HashMap<>();

		
		System.out.println( " Enter name and mobile number ,given times ");
		for (int i = 0; i < n; i++)

		{
			
			String name = sn.next();
			int phone = sn.nextInt();
		
			hasmp.put(name, phone);

		}

		System.out.println(hasmp);

	}

}
