package p18io.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iot\\outtest1.txt";
		OutputStream os = new FileOutputStream(file);
		
		String message = "\nthank you so much";
		
		os.write(65);
		os.write(66);
		
		for ( int i = 65; i < 91; i++) {
			os.write(i);
		}
		byte[] content = message.getBytes();
		os.write(content);
		
		System.out.println("프짱");
		os.close();
	}
}
