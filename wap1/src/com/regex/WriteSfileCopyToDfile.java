package com.regex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteSfileCopyToDfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File sfl = new File("D:\\EclipseWorkSpace\\wap1\\src\\com\\regex\\source.txt");

		PrintWriter pw = new PrintWriter(sfl);

		pw.write("1st Line -I am writing what i need to copy at destination file \n");
		pw.write("2nd line \n");
		pw.println("3rd line");
		pw.println("4th line");

		pw.flush();
		pw.close();

		BufferedReader sbr = new BufferedReader(new FileReader(sfl));

		pw = new PrintWriter("D:\\EclipseWorkSpace\\wap1\\src\\com\\regex\\destination.txt");

		String s = "";

		while ((s = sbr.readLine()) != null)

		{

			System.out.println(s + "\n");
			pw.println(s);

		}

		pw.flush();
		sbr.close();

	}

}
