package com.file.io;

import java.io.FileInputStream;
import java.io.IOException;

class ReadFileStream {
	public static void main(String args[]) throws IOException {

		// attach the file to FileInputStream
		FileInputStream fin = new FileInputStream("file1.txt");

		// illustrating getChannel() method
		System.out.println(fin.getChannel());

		// illustrating getFD() method
		System.out.println(fin.getFD());

		// illustrating available method
		System.out.println("Number of remaining bytes:" + fin.available());

		// illustrating skip method

		fin.skip(2);
		System.out.println("FileContents :");
		// read characters from FileInputStream and write them
		int ch;
		while ((ch = fin.read()) != -1)
			System.out.print((char) ch);

		// close the file
		fin.close();
	}
}
