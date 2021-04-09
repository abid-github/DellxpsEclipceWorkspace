package com.file.io;

import java.io.File;
import java.io.IOException;

public class FileLearning {

	public static void main(String[] args) throws IOException {

		
		  File fl = new File("klm.txt"); 
		  System.out.println(fl.exists());
		  fl.createNewFile();
		  
		  System.out.println(fl.exists());
		 

		File fl1 = new File("D:\\EclipseWorkSpace\\wap1\\src\\com\\regex");

		String[] s = fl1.list();
		int count = 0;

		for (String data : s) {

			count++;
			System.out.println(data);

		}

		System.out.println("the total number of files and folders " + count);

	}

}
