package com.file.io;

import java.io.File;

public class CountFileOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fl1 = new File("D:\\parser_py3");

		String[] s = fl1.list();
		int count = 0;

		for (String data : s)

		{

			File temp = new File(fl1, data);

			// if (temp.isDirectory() )
			if (temp.isFile())

			{
				count++;

				System.out.println(data);
			}

		}

		System.out.println("Total number of File " + count);

	}

}
