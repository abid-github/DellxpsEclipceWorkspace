package com.regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerVsBufferReader {

	public static void main(String[] args) {
		// Using Scanner to read user input
		Scanner scnr = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("You can use Scanner to read user input");
		System.out.println("=======================================");
		System.out.println("Please enter a String");
		String name = scnr.nextLine();
		System.out.println("You have entered " + name);
		System.out.println("Please enter an integer");
		int age = scnr.nextInt();
		System.out.println("You have entered " + age);
		scnr.close();

		// Using BufferedReader to read a file
		System.out.println("=======================================");
		System.out.println("You can use BufferedReader to read a file");
		System.out.println("=======================================");
		FileReader fileReader;

		try {

			File fl = new File("D:\\\\EclipseWorkSpace\\\\wap1\\\\src\\\\com\\\\regex\\abc.txt");
			fl.createNewFile();
			fileReader = new FileReader(fl);
			BufferedReader buffReader = new BufferedReader(fileReader);
			System.out.println("File contains following lines");
			String line = buffReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = buffReader.readLine();
			}
			buffReader.close();

			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
