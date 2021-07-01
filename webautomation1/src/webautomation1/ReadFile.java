package webautomation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\EclipseWorkSpace\\webautomation1\\src\\webautomation1\\file.txt");

		System.out.println(fis.getChannel());
		System.out.println(fis.getFD());
		System.out.println("Number of remaining bytes:" + fis.available());

		fis.skip(4);

		System.out.println("FileContents : ");
		System.out.println(fis.read());

		int ch;
		while ((ch = fis.read()) != -1) {
			System.out.print((char) ch);
		}

		fis.close();

	}

}
