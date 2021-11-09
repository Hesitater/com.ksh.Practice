package p18io.p03reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\iot\\test3.txt";
		InputStream is = new FileInputStream(fileName);
		
		
		
		
		
		is.close();
	}
}
