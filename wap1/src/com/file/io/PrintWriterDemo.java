package com.file.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter("printwriter.txt");

		pw.write(100);
		pw.println(100);
		pw.println(false);
		pw.println('c');
		pw.append('a');
		pw.println("Abid");
		pw.flush();
		pw.close();
		
		
		//d100
		//false
		//c
		//aAbid


	}

}
