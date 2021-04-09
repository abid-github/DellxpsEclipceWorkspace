package com.file.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("destinationfile.txt");

		BufferedReader br = new BufferedReader(new FileReader("inputfile1.txt"));

		String line = br.readLine();

		while (line != null)

		{

			pw.println(line);
			line = br.readLine();
		}
		br.close();
		br = new BufferedReader(new FileReader("inputfile2.txt"));
		line = br.readLine();

		while (line != null)

		{

			pw.println(line);
			line = br.readLine();
		}

		pw.flush();
		br.close();
		pw.close();

	}

}
