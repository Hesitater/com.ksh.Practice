package p18io.p01imputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\\\Users\\\\user\\\\Desktop\\\\iot\\\\holy.txt";
		InputStream is = new FileInputStream(file);
		
		int input = 0;
		
		while ( (input = is.read()) != -1) {
			System.out.println(input);
		}
		
		System.out.println("프짱");
		is.close();
		
	}
}