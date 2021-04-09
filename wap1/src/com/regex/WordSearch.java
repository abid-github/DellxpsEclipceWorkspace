package com.regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//https://www.candidjava.com/tutorial/program-to-search-word-in-a-file/
public class WordSearch {
	public static void main(String[] args) throws IOException {
		// Creation of File Descriptor for input file
		File f1 = new File("D:\\EclipseWorkSpace\\wap1\\src\\com\\regex\\inputword.txt");
		// Creation of BufferedReader object
		BufferedReader br = new BufferedReader(new FileReader(f1));

		String line = "";
		// String line = br.readLine();
		String input = "Java";
		int count = 0;

		while ((line = br.readLine()) != null) {

			System.out.println(line.toString());
			// Split the word using space
			String[] words = line.split(" ");
			for (String word : words) {
				if (word.equals(input)) {
					count++;
				}
			}

		}

		br.close();
		if (count != 0) // Check for count not equal to zero
		{
			System.out.println("The given word is present for " + count + " Times in the file");
		} else {
			System.out.println("The given word is not present in the file");
		}

	}

}
