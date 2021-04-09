package com.file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("bufferedwriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(100);
		bw.newLine();
		char[] ch = { 'a', 'b', 'c' };

		bw.write(ch);
		bw.newLine();
		bw.write("Abid ");
		bw.newLine();
		bw.write("Hussain");

		bw.flush();
		bw.close();

	}
}
