package com.file.io;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("bufferedwriter.txt");

		BufferedReader br = new BufferedReader(fr);

		//String line = br.readLine();
		String line ="";
		while ((line=br.readLine())!= null)

		{
			
			System.out.println(line);
			//line = br.readLine();
		}

		br.close();
	}

}
