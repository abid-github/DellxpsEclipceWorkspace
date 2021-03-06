package com.file.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicatesFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter("uniquedatafile.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("inputwithduplicates.txt"));

		String line1 = br1.readLine();

		while (line1 != null) {
			boolean isMatched = false;

			BufferedReader br2 = new BufferedReader(new FileReader("uniquedatafile.txt"));
			String line2 = br2.readLine();

			while (line2 != null) {

				if (line1.equals(line2)) {
					isMatched = true;
					break;
				}
				line2 = br2.readLine();

			}

			if (isMatched == false) {

				pw.println(line1);
				pw.flush();

			}
			line1 = br1.readLine();
			br2.close();
		}
		br1.close();
		pw.close();

	}

}
