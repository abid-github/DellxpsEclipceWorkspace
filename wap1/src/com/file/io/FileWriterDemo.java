package com.file.io;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fr = new FileWriter("filewriter.txt");

		fr.write("Hello");
		fr.close();
	}

}
